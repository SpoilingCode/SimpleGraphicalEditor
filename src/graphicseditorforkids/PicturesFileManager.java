
package graphicseditorforkids;

import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class PicturesFileManager {
    private View view;
    private JFileChooser fileSelectionWindow;
    private Action loadingPictureAction;
    private Action savePictureAction;
    private Action saveAsPictureAction;
    private Action createPictureAction;
    private Action clearPictureAction;
    private PictureFormatsFilter bmpFormatFilter = new PictureFormatsFilter(".bmp");
    private PictureFormatsFilter gifFormatFilter = new PictureFormatsFilter(".gif");
    private PictureFormatsFilter jpgFormatFilter = new PictureFormatsFilter(".jpg");
    private PictureFormatsFilter pngFormatFilter = new PictureFormatsFilter(".png");
    private String saveSelectedFormat;
    private String fullPathToFile;
    private String fileFormat;
    private int resultSelectionFileSave;
    private int resultSelectionFileLoading;
    private boolean conditionLoadingPicture = false;
    private boolean isSavePicture = false;
   
    
    public void setLoadingPictureAction(Action loadingPictureAction){
       this.loadingPictureAction = loadingPictureAction;
    }
    public Action getLoadingPictureAction(){
      return loadingPictureAction;
    }
    
    public void setSavePictureAction(Action  savePictureAction ){
       this.savePictureAction = savePictureAction;
    }
    public Action getSavePictureAction(){
      return savePictureAction;
    }
    
    public void setSaveAsPictureAction(Action  saveAsPictureAction ){
       this.saveAsPictureAction = saveAsPictureAction;
    }
    public Action getSaveAsPictureAction(){
      return saveAsPictureAction;
    }
    
     public void setCreatePictureAction(Action  createPictureAction ){
       this.createPictureAction = createPictureAction;
    }
    public Action getCreatePictureAction(){
      return createPictureAction;
    }
    public void setClearPictureAction (Action  clearPictureAction  ){
       this.clearPictureAction = clearPictureAction ;
    }
    public Action getClearPictureAction (){
      return clearPictureAction ;
    }
   
    
    public void setView(View view) {
        this.view = view;
    }
    public void createPicture() {
        view.clearPaintArea();
    }

    public void loadPictures() {
        try {
            File linksToSelectedFile = fileSelectionWindow.getSelectedFile();
            fullPathToFile = linksToSelectedFile.getAbsolutePath();
            File selectedFile = new File(fullPathToFile);
            addFilters();
            view.loadImage(selectedFile);
            conditionLoadingPicture = true;
        } catch (FileNotFoundException ex) {
            view.showMessage("Файл с данным именем отсутствует");
        } catch (IOException ioex) {
            view.showMessage("Произошла ошибка ввода-вывода при загрузке файла");
        }
    }

    public void savePicture() {

        fileSelectionWindow = new JFileChooser();
        addFilters();
        resultSelectionFileSave = fileSelectionWindow.showDialog(null, "Сохранить");
        switch (resultSelectionFileSave) {
            case JFileChooser.APPROVE_OPTION: {
                File linkTosaveFile = fileSelectionWindow.getSelectedFile();
                fullPathToFile = linkTosaveFile.getAbsolutePath(); 
            }
            break;
            case JFileChooser.ERROR_OPTION:
                view.showMessage("Ошибка при работе с диалоговым окном при сохранении");
        }
    }
    
    public void clearPicture(){
        view.clearPaintArea();
    }
     public void addFilters() {
         fileSelectionWindow.addChoosableFileFilter(bmpFormatFilter);
         fileSelectionWindow.addChoosableFileFilter(gifFormatFilter);
         fileSelectionWindow.addChoosableFileFilter(jpgFormatFilter);
         fileSelectionWindow.addChoosableFileFilter(pngFormatFilter);
    }

    public void chooseFilter() {
        if ( fileSelectionWindow.getFileFilter() == bmpFormatFilter) {
            saveSelectedFormat = ".bmp";
            fileFormat = "bmp";
        } else if (fileSelectionWindow.getFileFilter() == pngFormatFilter) {
            saveSelectedFormat = ".png";
            fileFormat = "png";
        } else if (fileSelectionWindow.getFileFilter() == gifFormatFilter) {
            saveSelectedFormat = ".gif";
            fileFormat = "gif";
        } else {
            saveSelectedFormat = ".jpg";
            fileFormat = "jpg";
        }
       
    }
    

    public void prepareAction() {

        createPictureAction = new AbstractAction("Cоздать новое изображение") {

            @Override
            public void actionPerformed(ActionEvent e) {

                if ( (isSavePicture == false && view.getIsToolUsed() == true) ) {
                    int queryResult = JOptionPane.showConfirmDialog(view.mainFrame, "Сохранить изменения?");
                    if (queryResult == JOptionPane.OK_OPTION) {

                        try {
                            savePicture();
                            chooseFilter();
                            view.saveImage(new File(fullPathToFile + saveSelectedFormat), fileFormat);
                            createPicture();
                            view.setIsToolUsed(false);
                        } catch (IOException io) {
                            view.showMessage("Ошибка ввода - вывода при создании");
                        }
                    } else if (queryResult == JOptionPane.NO_OPTION) {
                        createPicture();
                        view.setIsToolUsed(false);
                    } else if (queryResult == JOptionPane.CANCEL_OPTION) {
                        return;
                    }
                } else if((conditionLoadingPicture == true && view.getIsToolUsed() == true) || (isSavePicture == true && view.getIsToolUsed() == true) ){
                     int queryResult = JOptionPane.showConfirmDialog(view.mainFrame, "Сохранить изменения?");
                    if (queryResult == JOptionPane.OK_OPTION) {
                        try {
                            view.saveImage(new File(fullPathToFile  + saveSelectedFormat ), fileFormat);
                            createPicture();
                            view.setIsToolUsed(false);
                        } catch (IOException io) {
                            view.showMessage("Ошибка ввода - вывода при создании");
                        }
                    } else if (queryResult == JOptionPane.NO_OPTION) {
                        createPicture();
                        view.setIsToolUsed(false);
                    } else if (queryResult == JOptionPane.CANCEL_OPTION) {
                        return;
                    }
                 }  else if( (isSavePicture== true && conditionLoadingPicture == true && view.getIsToolUsed() == false) ||
                           (isSavePicture == true && view.getIsToolUsed() == false) || (conditionLoadingPicture == true && view.getIsToolUsed() == false) ) {
                    createPicture();
                    view.setIsToolUsed(false);
                }  
            }
        };

        loadingPictureAction = new AbstractAction("Загрузить изображение") {
            @Override
            public void actionPerformed(ActionEvent e) {

                fileSelectionWindow = new JFileChooser();
                resultSelectionFileLoading = fileSelectionWindow.showDialog(null, "Загрузить");
                switch (resultSelectionFileLoading) {
                    case JFileChooser.APPROVE_OPTION:
                        loadPictures();
                        break;
                    case JFileChooser.CANCEL_OPTION:
                        break;
                    case JFileChooser.ERROR_OPTION:
                        view.showMessage("Ошибка при работе с диалоговым окном при загрузке ");
                        break;
                }
            }
        };
        savePictureAction = new AbstractAction("Сохранить") {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                 
                
                    if (fullPathToFile == null) {
                        savePicture();
                        chooseFilter();
                        try {
                            view.saveImage(new File(fullPathToFile  + saveSelectedFormat ), fileFormat);
                        } catch (IOException ex) {
                            view.showMessage("Ошибка ввода - вывода при сохранении");
                        }
                        isSavePicture = true;
                    } else if ((conditionLoadingPicture == true && view.getIsToolUsed() == true) || (isSavePicture == true && view.getIsToolUsed() == true) ){
                     int queryResult = JOptionPane.showConfirmDialog(view.mainFrame, "Сохранить изменения?");
                    if (queryResult == JOptionPane.OK_OPTION) {
                        try {
                            view.saveImage(new File(fullPathToFile  + saveSelectedFormat ), fileFormat);
                        } catch (IOException io) {
                            view.showMessage("Ошибка ввода - вывода при сохранении");
                        }
                    } else if (queryResult == JOptionPane.NO_OPTION) {
                        createPicture();
                    } else if (queryResult == JOptionPane.CANCEL_OPTION) {
                        return;
                    }
                } 
            }
        };

        saveAsPictureAction = new AbstractAction("Сохранить как...") {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    savePicture();
                    chooseFilter();
                    view.saveImage(new File(fullPathToFile + saveSelectedFormat), fileFormat);
                    isSavePicture = true;
                } catch (IOException io) {
                   view.showMessage( "Ошибка ввода - вывода при действии сохраниить как.." );
                }
            }
        };
        
        clearPictureAction = new AbstractAction("Очистить изображение") {

            @Override
            public void actionPerformed(ActionEvent e) {
                clearPicture();
            }
        };
    }
}