import java.awt.*;
import java.awt.geom.*;

import javax.swing.Icon;

/**
 * 
 * @author Welby Chan	
 * @version 1.0 10/27/2018
 * This is a class of multiple shapes with general path
 *
 */
public interface OriginShape extends Icon
{
   /**
     
      @param g2 the graphics context
   */
   void draw(Graphics2D g2);
   /**
      
      @param g2 the graphics context
   */

}

