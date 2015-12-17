
package graphicseditorforkids;

import java.io.File;
import javax.swing.filechooser.FileFilter;


public class PictureFormatsFilter extends FileFilter{
    private  String fileFormat;

    public PictureFormatsFilter( String fileFormat ) {
        this.fileFormat = fileFormat;
    }
 
    @Override
    public boolean accept( File file ) {
        if( file.isDirectory() ){
            return true;
        }
            return (file.getName().endsWith( fileFormat ));
    }

    @Override
    public String getDescription(  ) {
       
        return "fileName" + fileFormat;
    }
    
}