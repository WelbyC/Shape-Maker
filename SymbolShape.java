import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
/**
 * 
 * @author Welby Chan	
 * @version 1.0 10/27/2018
 * 
 *
 */
public class SymbolShape extends CompositeShape{
	/**
	 *  constuctor for symbolshape
	 *  @param width
	 *  @param y
	 *  @param x
	 *  
	 */
	SymbolShape(int width, int x, int y)
	{
		Ellipse2D.Double circle = new Ellipse2D.Double(x,y,width,width);
		Rectangle2D.Double square = new Rectangle2D.Double(x,y,width,width);
		Line2D.Double line1 = new Line2D.Double(x,y, x+width,y+width);
		Line2D.Double line2 = new Line2D.Double(x+width,y, x,y+width);
		add(circle);
		add(square);
		add(line1);
		add(line2);
	}
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
