
package graphicseditorforkids;


import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;


public class FontManager {
   private  View view;
   private  String selectedTypeFont = "Arial";
   private  int fontSize = 14;
   private  int fontStyle = Font.PLAIN;
   private  Action fontArial ;
   private  Action fontArialBlack;
   private  Action fontArialNarrow ;
   private  Action fontCentury ;
   private  Action fontCourier;
   private  Action fontCourierNew;
   private  Action fontGaramond ;
   private  Action fontGeorgia;
   private  Action fontImpact;
   private  Action fontTahoma;
   private  Action fontTimesNewRoman;
   private  Action fontVerdana;
   private  Action tenFontSize;
   private  Action twelveFontSize;
   private  Action fourteenFontSize;
   private  Action sixteenFontSize; 
   private  Action eighteenFontSize;
   private  Action twentyFontSize;
   private  Action twentyTwoFontSize;
   private  Action twentyFourFontSize;
   private  Action twentySixFontSize;
   private  Action twentyEightFontSize;
   private  Action thirtySixFontSize;
   private  Action fortyEightFontSize;
   private  Action seventyTwoFontSize ;
   private  Action boldFont;
   private  Action italicFont;
   private  Action plainFont;
   
    public void setView(View view) {
        this.view = view;
     }
     
    public void setSelectedFont(String selectedFont){
        this.selectedTypeFont = selectedFont;
    
    }
    public String getSelectedFont(){
     return selectedTypeFont;
    }
    
    public void setFontSize(int fontSize ){
        this.fontSize = fontSize;
    
    }
    public int getFontSize(){
     return fontSize;
    }
    public void setFontArial(Action fontArial){
        this.fontArial = fontArial;
    
    }
    
    public Action getFontArial(){
     return fontArial;
    }
    
    public void setFontArialBlack(Action fontArialBlack){
        this.fontArialBlack = fontArialBlack;
    
    }
    public Action getFontArialBlack(){
     return fontArialBlack;
    }
    
    public void setFontArialNarrow(Action fontArialNarrow){
        this.fontArialNarrow = fontArialNarrow;
    
    }
    public Action getFontArialNarrow(){
     return fontArialNarrow;
    }
    
    public void setFontCentury(Action fontCentury){
        this.fontCentury = fontCentury;
    
    }
    public Action getFontCentury(){
     return fontCentury;
    }
    
    public void setFontCourier(Action fontCourier){
        this.fontCourier = fontCourier;
    
    }
    public Action getFontCourier(){
     return fontCourier;
    }
    
    public void setFontCourierNew(Action fontCourierNew){
        this.fontCourierNew = fontCourierNew;
    
    }
    public Action getFontCourierNew(){
     return fontCourierNew;
    }
    
    public void setFontGaramond(Action fontGaramond){
        this.fontGaramond = fontGaramond;
    
    }
    public Action getFontGaramond(){
     return fontGaramond;
    }
    public void setFontGeorgia(Action fontGeorgia){
        this.fontGeorgia = fontGeorgia;
    
    }
    public Action getFontGeorgia(){
     return fontGeorgia;
    }
    public void setFontImpact(Action fontImpact){
        this.fontImpact = fontImpact;
    
    }
    public Action getFontImpact(){
     return fontImpact;
    }
    
    public void setFontTahoma(Action fontTahoma){
        this.fontTahoma = fontTahoma;
    }
    public Action getFontTahoma(){
     return fontTahoma;
    }
    
    public void setFontTimesNewRoman(Action fontTimesNewRoman){
        this.fontTimesNewRoman = fontTimesNewRoman;
    
    }
    public Action getFontTimesNewRoman(){
     return fontTimesNewRoman;
    }
    
    public void setFontVerdana(Action fontVerdana){
        this.fontVerdana = fontVerdana;
    
    }
    public Action getFontVerdana(){
     return fontVerdana;
    }
    
    public void setTenFontSize(Action tenFontSize){
        this.tenFontSize = tenFontSize;
    
    }
    public Action getTenFontSize(){
     return tenFontSize;
    }
    
    public void setTwelveFontSize(Action twelveFontSize){
        this.twelveFontSize = twelveFontSize;
    
    }
    public Action getTwelveFontSize(){
     return twelveFontSize;
    }
    
    public void setFourteenFontSize(Action fourteenFontSize){
        this.fourteenFontSize = fourteenFontSize;
    
    }
    public Action getFourteenFontSize(){
     return fourteenFontSize;
    }
    
    public void setSixteenFontSize(Action sixteenFontSize){
        this.sixteenFontSize = sixteenFontSize;
    
    }
    public Action getSixteenFontSize(){
     return sixteenFontSize;
    }
    
    public void setEighteenFontSize(Action eighteenFontSize){
        this.eighteenFontSize = eighteenFontSize;
    
    }
    public Action getEighteenFontSize(){
     return eighteenFontSize;
    }
    
    public void setTwentyFontSize(Action twentyFontSize){
        this.twentyFontSize = twentyFontSize;
    
    }
    public Action getTwentyFontSize(){
     return twentyFontSize;
    }
    
     public void setTwentyTwoFontSize(Action twentyTwoFontSize){
        this.twentyTwoFontSize = twentyTwoFontSize;
    
    }
    public Action getTwentyTwoFontSize(){
     return twentyTwoFontSize;
    }
    
     public void setTwentyFourFontSize(Action twentyFourFontSize){
        this.twentyFourFontSize = twentyFourFontSize;
    
    }
    public Action getTwentyFourFontSize(){
     return twentyFourFontSize;
    }
    
     public void setTwentySixFontSize(Action twentySixFontSize){
        this.twentySixFontSize = twentySixFontSize;
    
    }
    public Action getTwentySixFontSize(){
     return twentySixFontSize;
    }
    
    public void setTwentyEightFontSize(Action twentyEightFontSize){
        this.twentyEightFontSize = twentyEightFontSize;
    
    }
    public Action getTwentyEightFontSize(){
     return twentyEightFontSize;
    }
    
    public void setThirtySixFontSize(Action thirtySixFontSize){
        this.thirtySixFontSize = thirtySixFontSize;
    
    }
    public Action getThirtySixFontSize(){
     return thirtySixFontSize;
    }
    
     public void setFortyEightFontSize(Action fortyEightFontSize){
        this.fortyEightFontSize = fortyEightFontSize;
    
    }
    public Action getFortyEightFontSize(){
     return fortyEightFontSize;
    }
    
    public void setSeventyTwoFontSize(Action seventyTwoFontSize){
        this.seventyTwoFontSize = seventyTwoFontSize;
    
    }
    public Action getSeventyTwoFontSize(){
     return seventyTwoFontSize;
    }
    
    public void setBoldFont(Action boldFont){
        this.boldFont = boldFont;
    }
    
    public Action getBoldFont(){
       return boldFont;
    }
    
    public void setItalicFont(Action italicFont){
        this.italicFont = italicFont;
    }
    
    public Action getItalicFont(){
       return italicFont;
    }
    
    public void setFontStyle(int fontStyle){
       this.fontStyle = fontStyle;
    }
    
    public int getFontStyle(){
       return fontStyle;
    } 
    
    public void setPlainFont(Action plainFont){
        this.plainFont = plainFont;
    }
    
    public Action getPlainFont(){
     return plainFont;
    }
    
    public void prepareActionToSetTypesFont(){
         
         fontArial = new AbstractAction("Arial") {

          @Override
          public void actionPerformed(ActionEvent e) {
              selectedTypeFont = "Arial";
          }
        }; 
         fontArialBlack = new AbstractAction("Arial Black") {

          @Override
          public void actionPerformed(ActionEvent e) {
              selectedTypeFont = "Arial Black";
          }
        };
          fontArialNarrow = new AbstractAction("Arial Narrow") {

          @Override
          public void actionPerformed(ActionEvent e) {
              selectedTypeFont = "Arial Narrow";
          }
        }; 
          
          fontCentury = new AbstractAction("Century") {

          @Override
          public void actionPerformed(ActionEvent e) {
              selectedTypeFont = "Century";
          }
        }; 
          fontCourier = new AbstractAction("Courier") {

          @Override
          public void actionPerformed(ActionEvent e) {
              selectedTypeFont = "Courier";
          }
        }; 
          fontCourierNew = new AbstractAction("Courier New") {

          @Override
          public void actionPerformed(ActionEvent e) {
              selectedTypeFont = "Courier New";
          }
        }; 
            
           fontGaramond = new AbstractAction("Garamond") {

          @Override
          public void actionPerformed(ActionEvent e) {
              selectedTypeFont = "Garamond";
          }
        }; 
           fontGeorgia = new AbstractAction("Georgia") {

          @Override
          public void actionPerformed(ActionEvent e) {
              selectedTypeFont = "Georgia";
          }
        }; 
           fontImpact = new AbstractAction("Impact") {

          @Override
          public void actionPerformed(ActionEvent e) {
              selectedTypeFont = "Impact";
          }
        }; 
          fontTahoma = new AbstractAction("Tahoma") {

          @Override
          public void actionPerformed(ActionEvent e) {
              selectedTypeFont = "Tahoma";
          }
        };
          fontTimesNewRoman = new AbstractAction("Times New Roman") {

          @Override
          public void actionPerformed(ActionEvent e) {
              selectedTypeFont = "Times New Roman";
          }
        }; 
         
           fontVerdana = new AbstractAction("Verdana") {

          @Override
          public void actionPerformed(ActionEvent e) {
              selectedTypeFont = "Verdana";
          }
        }; 
        
    }
    
    public void prepareActionToSetFontSize(){
         
       tenFontSize = new AbstractAction("10") {

          @Override
          public void actionPerformed(ActionEvent e) {
              fontSize = 10;
          }
        }; 
       twelveFontSize = new AbstractAction("12") {

          @Override
          public void actionPerformed(ActionEvent e) {
             fontSize = 12;
          }
        };
       fourteenFontSize = new AbstractAction("14") {

          @Override
          public void actionPerformed(ActionEvent e) {
              fontSize = 14;
          }
        }; 
          
       sixteenFontSize = new AbstractAction("16") {

          @Override
          public void actionPerformed(ActionEvent e) {
              fontSize = 16;
          }
        }; 
        eighteenFontSize = new AbstractAction("18") {

          @Override
          public void actionPerformed(ActionEvent e) {
             fontSize = 18;
          }
        }; 
        twentyFontSize = new AbstractAction("20") {

          @Override
          public void actionPerformed(ActionEvent e) {
              fontSize = 20;
          }
        }; 
            
        twentyTwoFontSize = new AbstractAction("22") {

          @Override
          public void actionPerformed(ActionEvent e) {
              fontSize = 22;
          }
        }; 
        twentyFourFontSize = new AbstractAction("24") {

          @Override
          public void actionPerformed(ActionEvent e) {
              fontSize = 24;
          }
        }; 
         twentySixFontSize = new AbstractAction("26") {

          @Override
          public void actionPerformed(ActionEvent e) {
              fontSize = 26;
          }
        }; 
         twentyEightFontSize = new AbstractAction("28") {

          @Override
          public void actionPerformed(ActionEvent e) {
              fontSize= 28;
          }
        };
        thirtySixFontSize = new AbstractAction("36") {

          @Override
          public void actionPerformed(ActionEvent e) {
              fontSize = 36;
          }
        }; 
         
         fortyEightFontSize = new AbstractAction("48") {

          @Override
          public void actionPerformed(ActionEvent e) {
              fontSize = 48;
          }
        }; 
         seventyTwoFontSize = new AbstractAction("72") {

          @Override
          public void actionPerformed(ActionEvent e) {
              fontSize = 72;
          }
        };
        
    }
    
    public void prepareActionToSetFontStyle(){
     plainFont = new AbstractAction("Обычный") {
             
             @Override
             public void actionPerformed(ActionEvent e) {
                 fontStyle = Font.PLAIN;
             }
         };
     
     boldFont = new AbstractAction("Жирный") {
             
             @Override
             public void actionPerformed(ActionEvent e) {
                 fontStyle = Font.BOLD;
             }
         };
         
     italicFont = new AbstractAction("Курсив") {
             
             @Override
             public void actionPerformed(ActionEvent e) {
                 fontStyle = Font.ITALIC;
               
             }
         };
         
         
    }
}
