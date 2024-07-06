package Bro_codes_java_reloaded;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


class AnimationDemo extends JFrame {
	
	MyNewPanel panel;
	AnimationDemo(){
		
		panel = new MyNewPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(panel);
		this.pack();			// while using pack we need to use set prefered size
		this.setLocationRelativeTo(null);
		this.setVisible(true);

	}
}

class MyNewPanel extends JPanel implements ActionListener{
	
	final int PANEL_WIDTH = 500;
	final int PANEL_HEIGHT = 500;
	Image smile;
	Image background;
	Timer timer;
	int xVelocity = 2;	// change the velocity to change the path
	int yVelocity = 1;
	int x = 0;			// starting x-position
	int y = 0;			// starting y-position
	
	MyNewPanel(){
		this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
		this.setBackground(Color.black);
		smile = new ImageIcon("images/dizzy.png").getImage();
		background = new ImageIcon("images/waste.png").getImage() ;
		
	//	timer = new Timer(1000, this);		// time is in milliseconds 1000 ms == 1 second
		timer = new Timer(10, this);	// to increase the speed
		timer.start();
		
		
	}

	public void paint(Graphics g) {
		super.paint(g); 	// this will paint background
		
		Graphics2D g2D = (Graphics2D)g;
		
		g2D.drawImage(background, 0, 0, null);
		g2D.drawImage(smile,x,y,null);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(x >= PANEL_WIDTH-smile.getWidth(null)  || x<0 ) {
			xVelocity = xVelocity * -1;
		}
		x = x + xVelocity;
		if(y >= PANEL_HEIGHT-smile.getHeight(null)  || y<0 ) {
			yVelocity = yVelocity * -1;
		}
		y = y + yVelocity;
		
		repaint();
		
	}
}
public class Sh_51_2D_Animations {
	public static void main(String[] args) {
		
		AnimationDemo myObj = new AnimationDemo();
		
	}
}
