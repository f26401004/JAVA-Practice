package test;

// include the graphics library.
import java.awt.*;
import java.awt.event.*;

public class GraphicsDemo01 extends Canvas
{
	public static void main(String[] args)
	{
		// use AWT to draw the picture.
		Frame frame  = new Frame("AWTDemo");
		frame.addWindowListener(new AdapterDemo());
		frame.setSize(220, 220);
		// create a canvas.
		GraphicsDemo01 canvas = new GraphicsDemo01();
		// add the canvas to the frame.
		frame.add(canvas, BorderLayout.CENTER);
		frame.setVisible(true);
	}
	// override paint function to draw the picture 
	public void paint(Graphics g)
	{
		g.fillRect(40, 40, 120, 120);
		// clear the specific region
		g.clearRect(60, 60, 80, 80);
	}
	
}

// create a class inherit the WindowAdapter to override some specific function.
class AdapterDemo extends WindowAdapter
{
	public void windowClosing(WindowEvent event)
	{
		System.exit(0);
	}
}
