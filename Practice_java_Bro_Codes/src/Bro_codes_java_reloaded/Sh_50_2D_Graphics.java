package Bro_codes_java_reloaded;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

class GraphicsDemo extends JFrame {

	MyPanel panel;
	GraphicsDemo(){
		
		panel = new MyPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.add(panel);
		this.pack();
		this.setLocationRelativeTo(null);		// this is responsible to open frame in the center of the screen
		this.setVisible(true);
		
	}
}

class MyPanel extends JPanel {
	
	Image image;
	
	MyPanel(){
		this.setPreferredSize(new Dimension(500,500));
	}
	public void paint(Graphics g) {
		
		Graphics2D g2D = (Graphics2D) g;		// it is an advance version of graphic g
		
		image = new ImageIcon("images/background.png").getImage();
		g2D.drawImage(image,0 ,0, null);
		
		g2D.setPaint(Color.blue);
		g2D.setStroke(new BasicStroke(5));		// set width of the lines it can be used with any shapes
//		g2D.drawLine(0, 0, 500, 500);
		
		g2D.setPaint(Color.yellow);
//		g2D.drawRect(0, 0, 100, 200);
//		g2D.fillRect(0, 0, 100, 200);
		
		g2D.setPaint(Color.orange);
//		g2D.drawOval(0, 0, 100, 100);
//		g2D.fillOval(0, 0, 100, 200);
		
//		g2D.setPaint(Color.red);
//		g2D.drawArc(0, 0, 100, 100, 0, 180);
//		g2D.fillArc(0, 0, 100, 100, 0, 180);
//		g2D.setPaint(Color.white);
//		g2D.fillArc(0, 0, 100, 100, 180, 180);
		
//		int[] xPoints = {150, 250, 350};
//		int[] yPoints = {300, 150, 300};
//		g2D.setPaint(Color.blue);
//		g2D.drawPolyline(xPoints, yPoints, 3);
//		g2D.drawPolygon(xPoints, yPoints, 3);
//		g2D.fillPolygon(xPoints, yPoints, 3);
		
		
//		g2D.setPaint(Color.MAGENTA);
//		g2D.setFont(new Font("Ink Free",Font.BOLD,50));
//		g2D.drawString("Shubham kumar", 50, 50);	// the coordinates are the bottom left corner of the string
	}
	
}

public class Sh_50_2D_Graphics {
	public static void main(String[] args) {
	
		GraphicsDemo myObj = new GraphicsDemo();
	}

}
