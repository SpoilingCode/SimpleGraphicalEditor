
package graphicseditorforkids;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;


public class MainFrame  extends JFrame{
   private String titleMainFrame = "Graphics Editor for Kids(GEK)";
    
    @Override
    public  void paint( Graphics graphics )
    {
        super.paint( graphics );
    }
    
    MainFrame()
    {
        setTitle(  titleMainFrame );
        setVisible(true);
        setSize(1280, 900);
        setBackground( Color.WHITE );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        setLocationRelativeTo( null );
    }
}