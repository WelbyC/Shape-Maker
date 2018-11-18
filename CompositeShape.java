import java.awt.*;
import java.awt.geom.*;

/**
 * 
 * @author Welby Chan	
 * @version 1.0 10/27/2018
 * This is a class of multiple shapes with general path
 *
 */
public abstract class CompositeShape implements OriginShape
{
	private GeneralPath path;
	
	public CompositeShape()
	{
		path = new GeneralPath();
		
	}
	   
	/**
	 * adds shape
	 *  @param s
	 */
	protected void add(Shape s)
	{
		path.append(s, false);
	}
	/**
	 * draws shape
	 *  @param g2
	 */
	public void draw(Graphics2D g2)
	{
		g2.draw(path);
	}
	
}








