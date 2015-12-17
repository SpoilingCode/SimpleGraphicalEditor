
package graphicseditorforkids;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

class PaintArea extends JPanel {
    private BufferedImage image = null ;
    private Color currentColor;
   
    public void setBufferedImage(BufferedImage image){
      this.image = image;
    }
    
    public BufferedImage getBufferedImage(){
        return image;
    }
          
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);  
        g.drawImage( image, 0, 0, this);
    }
    
    public PaintArea adjustSizeToImage() {
      setSize(image.getWidth() + image.getWidth()/2, image.getHeight() + image.getHeight()/2);
      return this;
    }
    
    
    public PaintArea paintWhiteRectangle(int width, int height) {
        Graphics2D d2 = (Graphics2D) image.getGraphics();
        d2.setColor(Color.white);
        d2.fillRect(0, 0, width, height);
        return this;
    }
    
    public PaintArea clear() {
        return this.paintWhiteRectangle(getWidth(), getHeight());
    }
    
    public PaintArea createEmptyImage(int width, int height) {
        image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        return this.paintWhiteRectangle(width, height);
    }
    
    public PaintArea loadImage(File filePath) throws IOException {
        image = ImageIO.read(filePath);
        return this;
    }
    
    public PaintArea saveImage(File filePath, String format) throws IOException {
        ImageIO.write(image, format, filePath);
        return this;
    } 
}
