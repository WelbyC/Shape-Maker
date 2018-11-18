import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import javax.swing.Icon;
/**
A car shape. Borrowed from textbook solutions and lecture
*/
public class CarShape extends CompositeShape {

	   /**
    Constructs a car shape.
    @param x the left of the bounding rectangle
    @param y the top of the bounding rectangle
    @param width the width of the bounding rectangle
 */
	public CarShape(int width, int x, int y)
	{
		Rectangle2D.Double body
	       = new Rectangle2D.Double(x, y + width / 6, 
	          width - 1, width / 6);
	    Ellipse2D.Double frontTire
	       = new Ellipse2D.Double(x + width / 6, y + width / 3, 
	          width / 6, width / 6);
	    Ellipse2D.Double rearTire
	       = new Ellipse2D.Double(x + width * 2 / 3, 
	          y + width / 3,
	          width / 6, width / 6);

	    // The bottom of the front windshield
	    Point2D.Double r1
	       = new Point2D.Double(x + width / 6, y + width / 6);
	    // The front of the roof
	    Point2D.Double r2
	       = new Point2D.Double(x + width / 3, y);
	    // The rear of the roof
	    Point2D.Double r3
	       = new Point2D.Double(x + width * 2 / 3, y);
	    // The bottom of the rear windshield
	    Point2D.Double r4
	       = new Point2D.Double(x + width * 5 / 6, y + width / 6);
	    Line2D.Double frontWindshield
	       = new Line2D.Double(r1, r2);
	    Line2D.Double roofTop
	       = new Line2D.Double(r2, r3);
	    Line2D.Double rearWindshield
	       = new Line2D.Double(r3, r4);

	    add(body);
	    add(frontTire);
	    add(rearTire);
	    add(frontWindshield);
	    add(roofTop);
	    add(rearWindshield);
	 }

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		// TODO Auto-generated method stub
	      Graphics2D g2 = (Graphics2D)g;
	      draw(g2);
	}

	@Override
	public int getIconWidth() {
		// TODO Auto-generated method stub
		return 50;
	}

	@Override
	public int getIconHeight() {
		// TODO Auto-generated method stub
		return 50;
	}


}
