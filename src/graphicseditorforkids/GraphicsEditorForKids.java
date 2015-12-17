
package graphicseditorforkids;


public class GraphicsEditorForKids {

    public static void main(String[] args) {
      View view = View.getView();
      PicturesFileManager pf = new PicturesFileManager();
      FontManager fonts = new FontManager();
      view.setPictureFileManager(pf);
      pf.setView(view);
      view.setFonts(fonts);
      fonts.setView(view);
      pf.prepareAction();
      fonts.prepareActionToSetTypesFont();
      fonts.prepareActionToSetFontSize();
      fonts.prepareActionToSetFontStyle();
      view.addGUI();
    }
    
}
