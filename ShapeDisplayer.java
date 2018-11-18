import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 * 
 * @author Welby Chan	
 * @version 1.0 10/27/2018
 * 
 *
 */
public class ShapeDisplayer {
	static boolean snow;
	static boolean car;
	static boolean sym;
	static boolean mousePressed;
	public static int dx;
	public static int dy;
	public static int width = 50;
	static SnowMan snowy = new SnowMan(24, 30, 5);
	static CarShape carry = new CarShape(50, 18, 15);
	static SymbolShape symby = new SymbolShape(35, 25, 15);
	

	public static void main(String args[]){
		JFrame frame = new JFrame();
		
		ShapeComponent display = new ShapeComponent();

		
        class ButtonListener implements ActionListener
        { 
            public void actionPerformed(ActionEvent event)
            {
                mousePressed = true;
            }      
        }
        class Mouselisteners extends MouseAdapter{
    		private Point mousePoint;
    		
    		public void mousePressed(MouseEvent event)
    		{
    			mousePoint = event.getPoint();
    			dx = (int) mousePoint.getX();
    			dy = (int) mousePoint.getY();
    			if(snow && mousePressed){
    			display.add(new SnowMan(width, dx-width/2, dy-width/2));
//    			display.revalidate();
                display.repaint();
    			}
    			
    			if(car && mousePressed){
    			display.add(new CarShape(width, dx-width/2, dy-width/4));	
//    			display.revalidate();
                display.repaint();
    			}
    			if(sym && mousePressed){
    			display.add(new SymbolShape(width, dx-width/2, dy-width/4));	
//    			display.revalidate();
                display.repaint();
    			}


    		}
        }
        Mouselisteners mouseClick = new Mouselisteners();
        display.addMouseListener(mouseClick);
        
		JPanel buttonPanel = new JPanel();
		JButton snowmanButton = new JButton(snowy);
		JButton carButton = new JButton(carry);
		JButton symbolButton = new JButton(symby);
		
		ActionListener pressListener = new ButtonListener();
		carButton.addActionListener(pressListener);
		snowmanButton.addActionListener(pressListener);
		symbolButton.addActionListener(pressListener);
		
		

		
		snowmanButton.addActionListener(new 
	    		ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						snow = true;
						car =false;
						sym = false;
//						display.add(new SnowMan(50,dx,dy));
					}
				});
		carButton.addActionListener(new 
	    		ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						
						snow = false;
						car = true;
						sym = false;
						
//						display.add(new CarShape(50,dx,dy));
					}
				});
		symbolButton.addActionListener(new 
	    		ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						car = false;
						snow = false;
						sym = true;
						
//						display.add(new CarShape(50,dx,dy));
					}
				});
		
		buttonPanel.add(snowmanButton);
		buttonPanel.add(carButton);
		buttonPanel.add(symbolButton);
		frame.add(buttonPanel, BorderLayout.NORTH);
		frame.add(display, BorderLayout.CENTER);
		
		System.out.print("hi");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setVisible(true);;
	}
}
