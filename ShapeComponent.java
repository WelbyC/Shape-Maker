import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JComponent;
/**
 * 
 * @author Welby Chan	
 * @version 1.0 10/27/2018
 * 
 *
 */
public class ShapeComponent extends JComponent{
	private ArrayList<OriginShape> shapes;
//	public int dx;
//	public int dy;
	/**
	 * constuctor
	 * 
	 */
	public ShapeComponent()
	{
		shapes = new ArrayList<OriginShape>();
//		Mouselisteners mouseAction = new Mouselisteners();
//		addMouseListener(mouseAction);
		
	}
	/**
	 *  paints component
	 *  @param g
	 */
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		for(OriginShape s : shapes)
		{
			s.draw(g2);
		}
	}
	/**
	 *  adds shape
	 *  @param s
	 */
	public void add(OriginShape s)
	{
		shapes.add(s);
		repaint();
	}
/*	
	public class Mouselisteners extends MouseAdapter{
		private Point mousePoint;
		
		public void mousePressed(MouseEvent event)
		{
			mousePoint = event.getPoint();
			dx = (int) mousePoint.getX();
			dy = (int) mousePoint.getY();
			add(new SnowMan(50,dx,dy));

			
		}
	}
	
*/	

	
}

