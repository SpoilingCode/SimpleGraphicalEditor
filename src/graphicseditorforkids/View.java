
package graphicseditorforkids;


import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;




public class View {
    
    private static View view = null;
    private FontManager textManager;
    private JToolBar palleteOfColors;
    private PicturesFileManager fileManager;
    private PaintArea paintArea ;
    private int drawingMode = 0 ;
    private int xStart;
    private int yStart;
    private int xEnd;
    private int yEnd;
    private boolean isToolUsed   = false;
    private boolean  pressedButton = false;
    protected MainFrame mainFrame;
    private JColorChooser colorChooser;
    private Color currentColor;
    
    private View(){
        
    }
    
    public static View getView(){
        if( view == null )
        {
            view = new View();
        }
        return view;
    }
   
    public void setPictureFileManager(PicturesFileManager pictureFileManager) {
        fileManager = pictureFileManager;
    }
    
    public void setFonts(FontManager textManager) {
        this.textManager = textManager;
    }
    
    
    public void setIsToolUsed(boolean isToolUsed){
        this.isToolUsed = isToolUsed;
    }
    
    public boolean getIsToolUsed(){
       return isToolUsed;
    }
     public void addGUI() {
         
        mainFrame = new MainFrame();
        
        JMenuBar mainMenu = new JMenuBar();
        mainFrame.setJMenuBar(mainMenu);
         
        JMenu menuFile = new JMenu("Файл");
        mainMenu.add(menuFile );

        JMenu menuFonts = new JMenu("Шрифт");
        mainMenu.add(menuFonts );
        
        JMenu menuTutorialVideo = new JMenu("Обучающий видеоролик");
        mainMenu.add( menuTutorialVideo );
        
        JMenuItem menuItemLoad = new JMenuItem( fileManager.getLoadingPictureAction() );
        menuFile.add( menuItemLoad );

        JMenuItem menuItemSavePicture = new JMenuItem( fileManager.getSavePictureAction() );
        menuFile.add( menuItemSavePicture );

        JMenuItem menuItemSaveAsPicture = new JMenuItem( fileManager.getSaveAsPictureAction() );
        menuFile.add(menuItemSaveAsPicture);

        JMenuItem menuItemCreatePicture = new JMenuItem( fileManager.getCreatePictureAction() );
        menuFile.add(menuItemCreatePicture);
        
        JMenuItem menuItemClearPicture = new JMenuItem( fileManager.getClearPictureAction() );
        menuFile.add(menuItemClearPicture);
        
        JMenu menuItemFontTypes = new JMenu("Тип шрифта");
        menuFonts.add(menuItemFontTypes);
        
        JMenuItem menuItemArial = new JMenuItem( textManager.getFontArial() );
        menuItemFontTypes.add( menuItemArial);
        
        JMenuItem menuItemArialBlack = new JMenuItem( textManager.getFontArialBlack() );
        menuItemFontTypes.add(menuItemArialBlack);
        
        JMenuItem menuItemArialNarrow = new JMenuItem( textManager.getFontArialNarrow() );
        menuItemFontTypes.add(menuItemArialNarrow);
        
        JMenuItem menuItemCentury = new JMenuItem( textManager.getFontCentury() );
        menuItemFontTypes.add(menuItemCentury);
        
        JMenuItem menuItemCourier = new JMenuItem( textManager.getFontCourier() );
        menuItemFontTypes.add(menuItemCourier);
        
        JMenuItem menuItemCourierNew = new JMenuItem( textManager.getFontCourierNew() );
        menuItemFontTypes.add(menuItemCourierNew);
        
        JMenuItem menuItemGaramond = new JMenuItem( textManager.getFontGaramond() );
        menuItemFontTypes.add(menuItemGaramond);
        
        JMenuItem menuItemGeorgia = new JMenuItem( textManager.getFontGeorgia() );
        menuItemFontTypes.add(menuItemGeorgia);
        
        JMenuItem menuItemImpact = new JMenuItem( textManager.getFontImpact() );
        menuItemFontTypes.add(menuItemImpact);
        
        JMenuItem menuItemTahoma = new JMenuItem( textManager.getFontTahoma() );
        menuItemFontTypes.add(menuItemTahoma);
        
        JMenuItem menuItemTimesNewRoman = new JMenuItem( textManager.getFontTimesNewRoman() );
        menuItemFontTypes.add(menuItemTimesNewRoman);
        
        JMenuItem menuItemVerdana = new JMenuItem( textManager.getFontVerdana());
        menuItemFontTypes.add(menuItemVerdana);
        
        JMenu menuItemFontsSize = new JMenu("Размер шрифта");
        menuFonts.add(menuItemFontsSize);
        
        JMenuItem menuItemTenFontSize = new JMenuItem( textManager.getTenFontSize() );
        menuItemFontsSize.add( menuItemTenFontSize);
        
        JMenuItem menuItemTwelveFontSize = new JMenuItem( textManager.getTwelveFontSize() );
        menuItemFontsSize.add( menuItemTwelveFontSize);
        
        JMenuItem menuItemFourteenFontSize = new JMenuItem( textManager.getFourteenFontSize() );
        menuItemFontsSize.add( menuItemFourteenFontSize);
        
        JMenuItem menuItemSixteenFontSize = new JMenuItem( textManager.getSixteenFontSize() );
        menuItemFontsSize.add( menuItemSixteenFontSize);
        
        JMenuItem menuItemEighteenFontSize = new JMenuItem( textManager.getEighteenFontSize() );
        menuItemFontsSize.add( menuItemEighteenFontSize);
        
        JMenuItem menuItemTwentyFontSize= new JMenuItem( textManager.getTwentyFontSize() );
        menuItemFontsSize.add( menuItemTwentyFontSize);
        
        JMenuItem menuItemTwentyTwoFontSize= new JMenuItem( textManager.getTwentyTwoFontSize() );
        menuItemFontsSize.add( menuItemTwentyTwoFontSize);
        
        JMenuItem menuItemTwentyFourFontSize= new JMenuItem( textManager.getTwentyFourFontSize() );
        menuItemFontsSize.add( menuItemTwentyFourFontSize);
        
        JMenuItem menuItemTwentySixFontSize = new JMenuItem( textManager.getTwentySixFontSize() );
        menuItemFontsSize.add( menuItemTwentySixFontSize);
        
        JMenuItem menuItemTwentyEightFontSize = new JMenuItem( textManager.getTwentyEightFontSize() );
        menuItemFontsSize.add( menuItemTwentyEightFontSize);
        
        JMenuItem menuItemThirtySixFontSize = new JMenuItem( textManager.getThirtySixFontSize() );
        menuItemFontsSize.add( menuItemThirtySixFontSize);
        
        JMenuItem menuItemFortyEightFontSize = new JMenuItem( textManager.getFortyEightFontSize() );
        menuItemFontsSize.add( menuItemFortyEightFontSize);
        
        JMenuItem menuItemSeventyTwoFontSize = new JMenuItem( textManager.getSeventyTwoFontSize());
        menuItemFontsSize.add( menuItemSeventyTwoFontSize);
        
        JMenu menuFontStyle = new JMenu("Начертание");
        menuFonts.add(menuFontStyle);
        
        JMenuItem menuItemPlainFont = new JMenuItem( textManager.getPlainFont());
        menuFontStyle.add( menuItemPlainFont);
        
        JMenuItem menuItemBoldFont = new JMenuItem( textManager.getBoldFont());
        menuFontStyle.add( menuItemBoldFont);
        
        JMenuItem menuItemItalicFont = new JMenuItem( textManager.getItalicFont());
        menuFontStyle.add( menuItemItalicFont);
        
        paintArea = new PaintArea();
        paintArea.createEmptyImage(mainFrame.getWidth(), mainFrame.getHeight());
        paintArea.adjustSizeToImage();
        mainFrame.add(paintArea);
       
        addToolbarForDrawing();
        createPalleteOfColors();
        addColoringPicture();
        mainFrame.repaint();
    }
   
    public ImageIcon establishIconToButton( String pathToImage ){
       URL imageURL = MainFrame.class.getResource( pathToImage );
       ImageIcon icon = new ImageIcon( imageURL );
       return icon;
   }
    
    public void addToolbarForDrawing(){
        JToolBar toolbarDrawing = new JToolBar("Панель инструментов", JToolBar.VERTICAL);
        paintArea.setLayout(new BorderLayout());
        paintArea.add(toolbarDrawing, BorderLayout.WEST);
        
        JButton penButton = new JButton( establishIconToButton("iconToToolbarDrawing/pencill.png") );
        penButton.setToolTipText("Карандаш - рисование линии произвольной формы");
        
        JButton eraserButton    = new JButton(establishIconToButton("iconToToolbarDrawing/eraser.png"));
        eraserButton.setToolTipText("Ластик - удаляет фрагмент рисунка");
       
        JButton brushButton     = new JButton(establishIconToButton("iconToToolbarDrawing/bbb.png"));
        brushButton.setToolTipText("Кисть - рисование линии с определенной шириной ");
        
        JButton pouringButton   = new JButton(establishIconToButton("iconToToolbarDrawing/fill2.png"));
        pouringButton.setToolTipText("Заливка - щелкните на фрагмент рисунка , чтобы заполнить его основным цветом ");
        
        JButton lineButton      = new JButton(establishIconToButton("iconToToolbarDrawing/line.png")); 
        lineButton.setToolTipText("Линия - рисование линий");
        
        JButton textButton      = new JButton(establishIconToButton("iconToToolbarDrawing/text.png"));
        textButton.setToolTipText("Текст - щелкните на область рисунка и наберите текст с клавиатуры(Вставка текста в изображение)");
        
        JButton rectangleButton = new JButton(establishIconToButton("iconToToolbarDrawing/rectangle.png"));
        rectangleButton.setToolTipText("Прямоугольник - рисование контура прямоугольника");
        
        JButton ellipseButton   = new JButton(establishIconToButton("iconToToolbarDrawing/el.png"));
        ellipseButton.setToolTipText("Овал - рисование контура овала");
        
        JButton filledRectangleButton = new JButton(establishIconToButton("iconToToolbarDrawing/3dRect.png"));
        filledRectangleButton.setToolTipText("Закрашенный прямоугольник - рисование закрашенного прямоугольника");
        
        JButton filled3DRectangleButton = new JButton(establishIconToButton("iconToToolbarDrawing/rect.png"));
        filled3DRectangleButton.setToolTipText("Прямоугольник 3D - рисование закрашенного подсвеченного трехмерного прямоугольника");
        
        JButton filledRoundRectangleButton   = new JButton(establishIconToButton("iconToToolbarDrawing/filledRoundRectangle.png"));
        filledRoundRectangleButton.setToolTipText("Прямоугольник со скругленными углами ");
        
        JButton filledEllipseButton   = new JButton(establishIconToButton("iconToToolbarDrawing/ellipse.png"));
        filledEllipseButton.setToolTipText("Закрашенный овал");
        
        penButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                drawingMode = 0;
            }
        });
        
        eraserButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               drawingMode = 1 ;
            }
        });
        
        brushButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               drawingMode = 2;
            }
        });
        
        pouringButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                drawingMode = 3;
            }
        });
        
        textButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                drawingMode = 4;
            }
        });
        lineButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               drawingMode = 5;
            }
        });
        rectangleButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                drawingMode = 6;
            }
        });
        
        ellipseButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                drawingMode = 7;
            }
        }); 
         filledRectangleButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                drawingMode = 8;
            }
        });
          filled3DRectangleButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                drawingMode = 9;
            }
        }); 
        
         filledRoundRectangleButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                drawingMode = 10;
            }
        });
        filledEllipseButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                drawingMode = 11;
            }
        }); 
           
        toolbarDrawing.add( penButton );
        toolbarDrawing.add( eraserButton );
        toolbarDrawing.add( brushButton );
        toolbarDrawing.add( pouringButton );
        toolbarDrawing.add(textButton );
        toolbarDrawing.add(lineButton );
        toolbarDrawing.add( rectangleButton );
        toolbarDrawing.add( ellipseButton );
        toolbarDrawing.add( filledRectangleButton );
        toolbarDrawing.add( filled3DRectangleButton );
        toolbarDrawing.add( filledRoundRectangleButton );
        toolbarDrawing.add( filledEllipseButton );
        
        mouseDraw();
        keyBoardListen();
    }
    
    public void createPalleteOfColors(){
        
        palleteOfColors = new JToolBar("Палитра цветов и раскраски", JToolBar.VERTICAL);
       
        palleteOfColors.setLayout(new FlowLayout());
        paintArea.add( palleteOfColors, BorderLayout.SOUTH );
        
        JButton selectedColorButton = new JButton();
        selectedColorButton.setToolTipText("Текущий цвет");
        selectedColorButton.setBackground(Color.WHITE);
        selectedColorButton.setPreferredSize(new Dimension(30,30));
        selectedColorButton.addActionListener(new  ActionListener()
            {
              @Override
              public void actionPerformed(ActionEvent event)
              { 
                ColorSelectedWindow coldi = new  ColorSelectedWindow(mainFrame,"Выбор цвета");
                coldi.setVisible(true);
              }
            }); 
        palleteOfColors.add( selectedColorButton );
        
        JButton blackButton = new JButton();
        blackButton.setBackground(Color.BLACK);
        blackButton.setPreferredSize(new Dimension(20,20));
        blackButton.addActionListener(new  ActionListener()
            {
              @Override
              public void actionPerformed(ActionEvent event)
              { 
                  currentColor = Color.BLACK;
                  selectedColorButton.setBackground(currentColor);
                  
              }
            });  
         palleteOfColors.add(blackButton );
      
        JButton darkGrayButton = new JButton();
        darkGrayButton.setBackground( Color.DARK_GRAY );
        darkGrayButton.setPreferredSize( new Dimension( 20, 20 ) );
        darkGrayButton.addActionListener(new  ActionListener()
            {
              @Override
              public void actionPerformed(ActionEvent event)
              { 
                currentColor = Color.DARK_GRAY;
                selectedColorButton.setBackground(currentColor);
              }
            }); 
        palleteOfColors.add(darkGrayButton);
        
        JButton grayButton = new JButton();
        grayButton.setBackground( Color.GRAY );
        grayButton.setPreferredSize( new Dimension( 20, 20 ) );
        grayButton.addActionListener(new  ActionListener()
            {
              @Override
              public void actionPerformed(ActionEvent event)
              { 
                currentColor = Color.GRAY;
                selectedColorButton.setBackground(currentColor);
              }
            });  
        palleteOfColors.add(grayButton);
        
        JButton lightGrayButton = new JButton();
        lightGrayButton.setBackground( Color.LIGHT_GRAY );
        lightGrayButton.setPreferredSize( new Dimension( 20, 20 ) );
        lightGrayButton.addActionListener(new  ActionListener()
            {
              @Override
              public void actionPerformed(ActionEvent event)
              { 
                currentColor = Color.LIGHT_GRAY;
                selectedColorButton.setBackground(currentColor);
              }
            });  
        palleteOfColors.add( lightGrayButton );
        
        JButton whiteButton = new JButton();
        whiteButton.setBackground( Color.WHITE );
        whiteButton.setPreferredSize( new Dimension( 20, 20 ) );
        whiteButton.addActionListener(new  ActionListener()
            {
              @Override
              public void actionPerformed(ActionEvent event)
              { 
                currentColor = Color.WHITE;
                selectedColorButton.setBackground(currentColor);
              }
            });  
        palleteOfColors.add( whiteButton );
        
        JButton redButton = new JButton();
        redButton.setBackground( Color.RED );
        redButton.setPreferredSize( new Dimension( 20, 20 ) );
        redButton.addActionListener(new  ActionListener()
            {
              @Override
              public void actionPerformed(ActionEvent event)
              { 
                currentColor = Color.RED;
                selectedColorButton.setBackground(currentColor);
              }
            }); 
        palleteOfColors.add( redButton );
        
        JButton orangeButton = new JButton();
        orangeButton.setBackground( Color.ORANGE );
        orangeButton.setPreferredSize(new Dimension(20,20));
        orangeButton.addActionListener(new  ActionListener()
            {
              @Override
              public void actionPerformed(ActionEvent event)
              { 
                currentColor = Color.ORANGE;
                  selectedColorButton.setBackground(currentColor);
              }
            });  
        palleteOfColors.add( orangeButton );
        
        JButton yellowButton = new JButton();
        yellowButton.setBackground( Color.YELLOW );
        yellowButton.setPreferredSize( new Dimension( 20, 20 ) );
        yellowButton.addActionListener(new  ActionListener()
            {
              @Override
              public void actionPerformed(ActionEvent event)
              { 
                currentColor = Color.YELLOW;
                  selectedColorButton.setBackground(currentColor);
              }
            });  
        palleteOfColors.add( yellowButton );
        
        JButton blueButton = new JButton();
        blueButton.setBackground( Color.BLUE );
        blueButton.setPreferredSize(new Dimension(20,20));
        blueButton.addActionListener(new  ActionListener()
            {
              @Override
              public void actionPerformed(ActionEvent event)
              { 
                currentColor = Color.BLUE;
                  selectedColorButton.setBackground(currentColor);
              }
            });  
        palleteOfColors.add( blueButton );
        
        JButton greenButton = new JButton();
        greenButton.setBackground( Color.GREEN );
        greenButton.setPreferredSize(new Dimension(20,20));
        greenButton.addActionListener(new  ActionListener()
            {
              @Override
              public void actionPerformed(ActionEvent event)
              { 
                currentColor = Color.GREEN;
                  selectedColorButton.setBackground(currentColor);
              }
            }); 
        palleteOfColors.add( greenButton );
        
        JButton pinkButton = new JButton();
        pinkButton.setBackground( Color.PINK );
        pinkButton.setPreferredSize(new Dimension(20,20));
        pinkButton.addActionListener(new  ActionListener()
            {
              @Override
              public void actionPerformed(ActionEvent event)
              { 
                currentColor = Color.PINK;
                selectedColorButton.setBackground(currentColor);
              }
            });  
        palleteOfColors.add(  pinkButton );
        
        JButton cyanButton = new JButton();
        cyanButton.setBackground( Color.CYAN );
        cyanButton.setPreferredSize(new Dimension(20,20));
        cyanButton.addActionListener(new  ActionListener()
            {
              @Override
              public void actionPerformed(ActionEvent event)
              { 
                currentColor = Color.CYAN;
                  selectedColorButton.setBackground(currentColor);
              }
            });  
        palleteOfColors.add(  cyanButton );
        
        JButton magentaButton = new JButton();
        magentaButton.setBackground( Color.MAGENTA );
        magentaButton.setPreferredSize(new Dimension(20,20));
        magentaButton.addActionListener(new  ActionListener()
            {
              @Override
              public void actionPerformed(ActionEvent event)
              { 
                currentColor = Color.MAGENTA;
                  selectedColorButton.setBackground(currentColor);
              }
            });  
        palleteOfColors.add(  magentaButton );
        
       
        colorChooser = new JColorChooser();
        colorChooser.getSelectionModel().addChangeListener(new  ChangeListener()
          {
          @Override
          public void stateChanged(ChangeEvent e)
          {
            currentColor = colorChooser.getColor();
            selectedColorButton.setBackground(currentColor);
          }
          });
    }
    
    public void addColoringPicture(){
        JToolBar coloringPicturePanel = new JToolBar("Панель закраски", JToolBar.HORIZONTAL);
        palleteOfColors.add(coloringPicturePanel );
        
        JButton firstColoringPictureButton = new JButton( establishIconToButton("iconToToolbarDrawing/firstPicture.jpg"));
        firstColoringPictureButton.setToolTipText("Принцесса Жасмин - чтобы работать с этой закраской нажмите кнопку с изображением");
        firstColoringPictureButton.setPreferredSize(new Dimension(52, 52));
        firstColoringPictureButton.addActionListener(new ActionListener() {
       
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                  loadImage(new File("C://Users//User//Documents//NetBeansProjects//GraphicsEditorForKids//"
                                           + "src//graphicseditorforkids//coloringPicture//firstPicture.jpg"));
                } 
                 catch (IOException ex) {
                     showMessage("Ошибка ввода - вывода при загрузке картикни закраски");
                }
             }
        });
        coloringPicturePanel.add(firstColoringPictureButton); 
       
         
        JButton secondColoringPictureButton = new JButton( establishIconToButton("iconToToolbarDrawing/secondPicture.gif"));
        secondColoringPictureButton.setToolTipText("Волк - чтобы работать с этой закраской нажмите на кнопку с изображением");
        secondColoringPictureButton.setPreferredSize(new Dimension(52, 52));
        secondColoringPictureButton.addActionListener(new ActionListener() {
       
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                  loadImage(new File("C://Users//User//Documents//NetBeansProjects//GraphicsEditorForKids//"
                                           + "src//graphicseditorforkids//coloringPicture//secondPicture.jpg"));
                } 
                 catch (IOException ex) {
                     showMessage("Ошибка ввода - вывода при загрузке картикни закраски");
                }
             }
        });
        coloringPicturePanel.add(secondColoringPictureButton); 
        
        
        JButton thirdColoringPictureButton = new JButton( establishIconToButton("iconToToolbarDrawing/thirdPicture.gif"));
        thirdColoringPictureButton.setToolTipText("Заяц \"Крош\" - чтобы работать с этой закраской нажмите на кнопку с изображением");
        thirdColoringPictureButton.setPreferredSize(new Dimension(52, 52));
        thirdColoringPictureButton.addActionListener(new ActionListener() {
       
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                  loadImage(new File("C://Users//User//Documents//NetBeansProjects//GraphicsEditorForKids//"
                                           + "src//graphicseditorforkids//coloringPicture//thirdPicture.gif"));
                } 
                 catch (IOException ex) {
                     showMessage("Ошибка ввода - вывода при загрузке картикни закраски");
                }
             }
        });
        coloringPicturePanel.add(thirdColoringPictureButton); 
        
        JButton fourthColoringPictureButton = new JButton( establishIconToButton("iconToToolbarDrawing/fourthPicture.jpg"));
        fourthColoringPictureButton.setToolTipText("Дональд Дак и леденцы - чтобы работать с этой закраской нажмите на кнопку с изображением");
        fourthColoringPictureButton.setPreferredSize(new Dimension(52, 52));
        fourthColoringPictureButton.addActionListener(new ActionListener() {
       
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                  loadImage(new File("C://Users//User//Documents//NetBeansProjects//GraphicsEditorForKids//"
                                           + "src//graphicseditorforkids//coloringPicture//fourthPicture.jpg"));
                } 
                 catch (IOException ex) {
                     showMessage("Ошибка ввода - вывода при загрузке картикни закраски");
                }
             }
        });
         coloringPicturePanel.add(fourthColoringPictureButton); 
       
        
        JButton fifthColoringPictureButton = new JButton( establishIconToButton("iconToToolbarDrawing/fifthPicture.gif"));
        fifthColoringPictureButton.setToolTipText("Винни Пух и Тигр - чтобы работать с этой закраской нажмите на кнопку с изображением");
        fifthColoringPictureButton.setPreferredSize(new Dimension(52, 52));
        fifthColoringPictureButton.addActionListener(new ActionListener() {
       
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                  loadImage(new File("C://Users//User//Documents//NetBeansProjects//GraphicsEditorForKids//"
                                           + "src//graphicseditorforkids//coloringPicture//fifthPicture.gif"));
                } 
                 catch (IOException ex) {
                     showMessage("Ошибка ввода - вывода при загрузке картикни закраски");
                }
             }
        });
         coloringPicturePanel.add(fifthColoringPictureButton); 
       
        
        JButton sixthColoringPictureButton = new JButton( establishIconToButton("iconToToolbarDrawing/sixthPicture.gif"));
        sixthColoringPictureButton.setToolTipText("Винни Пух - чтобы работать с этой закраской нажмите на кнопку с изображением");
        sixthColoringPictureButton.setPreferredSize(new Dimension(52, 52));
        sixthColoringPictureButton.addActionListener(new ActionListener() {
       
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                  loadImage(new File("C://Users//User//Documents//NetBeansProjects//GraphicsEditorForKids//"
                                           + "src//graphicseditorforkids//coloringPicture//sixthPicture.gif"));
                } 
                 catch (IOException ex) {
                     showMessage("Ошибка ввода - вывода при загрузке картикни закраски");
                }
             }
        });
        coloringPicturePanel.add(sixthColoringPictureButton); 
        
         JButton seventhColoringPictureButton = new JButton( establishIconToButton("iconToToolbarDrawing/seventhPicture.gif"));
         seventhColoringPictureButton.setToolTipText("Дональд Дак играет в мяч - чтобы работать с этой закраской нажмите на кнопку с изображением");
         seventhColoringPictureButton.setPreferredSize(new Dimension(52, 52));
         seventhColoringPictureButton.addActionListener(new ActionListener() {
       
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                  loadImage(new File("C://Users//User//Documents//NetBeansProjects//GraphicsEditorForKids//"
                                           + "src//graphicseditorforkids//coloringPicture//seventhPicture.gif"));
                } 
                 catch (IOException ex) {
                     showMessage("Ошибка ввода - вывода при загрузке картикни закраски");
                }
             }
        });
        coloringPicturePanel.add(seventhColoringPictureButton);
        
         
        JButton eigthColoringPictureButton = new JButton( establishIconToButton("iconToToolbarDrawing/eigthPicture.jpg"));
        eigthColoringPictureButton.setToolTipText("Кролик \"Роджер\" - чтобы работать с этой закраской нажмите на кнопку с изображением");
        eigthColoringPictureButton.setPreferredSize(new Dimension(52, 52));
        eigthColoringPictureButton.addActionListener(new ActionListener() {
       
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                  loadImage(new File("C://Users//User//Documents//NetBeansProjects//GraphicsEditorForKids//"
                                           + "src//graphicseditorforkids//coloringPicture//eigthPicture.jpg"));
                } 
                 catch (IOException ex) {
                     showMessage("Ошибка ввода - вывода при загрузке картикни закраски");
                }
             }
        });
        coloringPicturePanel.add(eigthColoringPictureButton);
        
    }
    public void mouseDraw(){
        
       paintArea.addMouseMotionListener(new MouseMotionAdapter() {
        @Override
        public void mouseDragged(MouseEvent e){
            
         if( pressedButton == true ){
          Graphics graphics = paintArea.getBufferedImage().getGraphics();
          Graphics2D graphicks2D = (Graphics2D) graphics;
          graphicks2D.setColor(currentColor);
          switch(drawingMode){
            case 0: {
                     graphicks2D.drawLine(xStart, yStart, e.getX(),e.getY());
                     isToolUsed = true;
                     break;
                    }
            case 1: {
                     graphicks2D.setStroke(new BasicStroke(10.0f)); 
                     graphicks2D.setColor( Color.WHITE );
                     graphicks2D.drawLine(xStart, yStart, e.getX(), e.getY());
                     isToolUsed = true;
                     break;
                    }
            case 2: {
                     graphicks2D.setStroke(new BasicStroke(3.0f));
                     graphicks2D.drawLine(xStart, yStart, e.getX(), e.getY());
                     isToolUsed = true;
                     break;
                     }
           }
            xStart = e.getX();
            yStart = e.getY();
            }
            paintArea.repaint();
         }
       });
       
        paintArea.addMouseListener(new MouseAdapter() {
           @Override
           public void mouseClicked(MouseEvent e){
            Graphics graphics = paintArea.getBufferedImage().getGraphics();
            Graphics2D graphick2D = (Graphics2D) graphics;
            graphick2D.setColor(currentColor);
            
            switch(drawingMode){
                case 0 : {
                           graphick2D.drawLine(xStart, yStart, e.getX(), e.getY());
                           break;
                         }
                case 1 : {
                           graphick2D.setStroke(new BasicStroke(10.0f));
                           graphick2D.setColor(Color.white);
                           graphick2D.drawLine(xStart, yStart, xStart + 1, yStart + 1);
                           break;
                         }
                case 2 : {
                           graphick2D.setStroke(new BasicStroke(3.0f));
                           graphick2D.drawLine(xStart, yStart, xStart + 1, yStart + 1);
                           break;
                         }
               case 4 :  {
                           paintArea.requestFocus();
                           break;       
                         }
            }
           xStart = e.getX();
           yStart = e.getY();
           
           pressedButton = true;
           paintArea.repaint();
        }
           @Override
           public void mousePressed(MouseEvent e){
               xStart = e.getX();
               yStart = e.getY();
               xEnd   = e.getX();
               yEnd   =  e.getY();
               pressedButton = true;
           }
           
           @Override
           public void mouseReleased(MouseEvent e){
               Graphics graphics = paintArea.getBufferedImage().getGraphics();
               Graphics2D graphics2D = (Graphics2D) graphics;
               graphics2D.setColor(currentColor);
               
               
               int heightRoundRectangle = 20;
               int widthRoundRectangle = 20;
               int x1, x2, y1, y2;
               x1 = xEnd;
               y1 = yEnd;
               x2 = xStart;
               y2 = yStart;
               
               if(xEnd > xStart){
                   x2 = xEnd;
                   x1 = xStart;
               }
               
               if(yEnd > yStart){
                   y2 = yEnd;
                   y1 = yStart;
               }
               
               switch(drawingMode){
                   case 3 : {
                             break;
                            }
                   case 5 : {
                              graphics2D.drawLine(xEnd, yEnd, e.getX(), e.getY());
                              isToolUsed = true;
                              break;
                            }
                   case 6 : {
                             graphics2D.drawRect(x1, y1, (x2 - x1), (y2 - y1));
                             isToolUsed = true;
                             break;
                            }
                   case 7 : {
                             graphics2D.drawOval(x1, y1, (x2 - x1), (y2 - y1));
                             isToolUsed = true;
                             break;
                            }  
                   case 8 : {
                             graphics2D.fillRect(x1, y1, (x2 - x1), (y2 - y1));
                             isToolUsed = true;
                             break;
                            }
                   case 9 : {
                             graphics2D.fill3DRect(x1, y1, (x2 - x1), (y2 - y1), true);
                             isToolUsed = true;
                             break;
                            } 
                   case 10: {
                             graphics.fillRoundRect(x1, y1, (x2 - x1), (y2 - y1), widthRoundRectangle, heightRoundRectangle);
                             isToolUsed = true;
                             break;
                            }
                   case 11: {
                             graphics2D.fillOval(x1, y1, (x2 - x1), (y2 - y1));
                             isToolUsed = true;
                             break;
                            }
               }
               xEnd = 0; 
               yEnd = 0;
               
               pressedButton = false;
               paintArea.repaint();
           }
       });
    }

    public void keyBoardListen(){
       paintArea.addKeyListener(new KeyAdapter() {
       @Override
        public void keyReleased(KeyEvent e){
           paintArea.requestFocus();
        }
         
       @Override
        public void keyTyped(KeyEvent e){
           
         if( drawingMode == 4 ){
             writeTextOnScreen(textManager.getSelectedFont(), e);
        }
       }
    });
       
  }
    public void writeTextOnScreen(String selectedFont, KeyEvent e){
         Graphics graphics = paintArea.getBufferedImage().getGraphics();
         Graphics2D graphics2D = (Graphics2D) graphics;
         graphics2D.setColor(currentColor);
         Font font = new Font(textManager.getSelectedFont(),textManager.getFontStyle() , textManager.getFontSize());
         graphics2D.setStroke(new BasicStroke(2.0f));
         graphics2D.setFont(font);
         String line = new String("");
         line += e.getKeyChar();
         FontMetrics fontMetrics = graphics.getFontMetrics();
         graphics2D.drawString(line, xStart, yStart);
         xStart += fontMetrics.charWidth(e.getKeyChar());;
         paintArea.requestFocus();
         paintArea.repaint();
    }
    
    public View adjustFrameSizeToImage() {
        mainFrame.setSize(paintArea.getWidth(), paintArea.getHeight() );
        return this;
    }
    
    public View createPaintArea(){
      paintArea.createEmptyImage(mainFrame.getWidth(), mainFrame.getHeight());
      return this;
    }
    
    public View clearPaintArea() {
        paintArea.clear().repaint();
        return this;
    }
    
    public View loadImage(File filePath) throws IOException {
        paintArea.loadImage(filePath);
        paintArea.adjustSizeToImage();
        adjustFrameSizeToImage();
        paintArea.repaint();
        return this;
    }
    
    public View saveImage(File filePath, String format) throws IOException {
        paintArea.saveImage(filePath, format);
        return this;
    }
    
    public View showMessage(String message) {
        JOptionPane.showMessageDialog(mainFrame, message);
        return this;
    }
    
    public class ColorSelectedWindow extends JDialog{
    public ColorSelectedWindow(MainFrame mainFrame, String title){
        super(mainFrame, title, false);
        add(colorChooser);
        setSize(400, 400);
    }
  }
}
    