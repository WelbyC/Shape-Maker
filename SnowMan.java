import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.Icon;
/**
 * 
 * @author Welby Chan	
 * @version 1.0 10/27/2018
 * 
 *
 */
public class SnowMan extends CompositeShape{
	/**
	 *  consturctor for making snowman
	 *  @param width
	 *  @param y
	 *  @param x
	 */
	public SnowMan(int width, int x, int y)
	{

		Ellipse2D.Double upper = new Ellipse2D.Double(x, y ,width ,width);
		Ellipse2D.Double lower = new Ellipse2D.Double(x, y+width, width, width);
		add(upper);
		add(lower);
	}
	/**
	 *  painting overriden
	 *  @param c
	 *  @param y
	 *  @param x
	 *  @param g
	 */
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
