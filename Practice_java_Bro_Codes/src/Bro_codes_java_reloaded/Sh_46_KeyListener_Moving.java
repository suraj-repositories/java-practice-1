package Bro_codes_java_reloaded;

/* there are two methods to use keys 
 * 1. impliment keylistener interface sh_46
 * 2. extanding abstractAction class sh_49
 */


import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

class SampleClass extends JFrame implements KeyListener{
	
	JLabel label;
	ImageIcon myIcon;
	
	SampleClass(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
		
		myIcon = new ImageIcon("images/S_logo.png");
		
		label = new JLabel();
		label.setBounds(0, 0, 100 ,100);
		label.setIcon(myIcon);
//		label.setBackground(Color.red);
//		label.setOpaque(true);
		
		this.getContentPane().setBackground(Color.black);		// to chage the color of the frame
		this.addKeyListener(this);
		this.add(label);
		this.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// keyTyped = Invoked when a key is typed. Uses KeyChar, char output
		
		switch(e.getKeyChar()) {
			case 'a' : label.setLocation(label.getX()-10,label.getY());
				break;
			case 'w' : label.setLocation(label.getX(),label.getY()-10);
				break;
			case 's' : label.setLocation(label.getX(),label.getY()+10);
				break;
			case 'd' : label.setLocation(label.getX()+10,label.getY());
				break;
			
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// keyPressed = Invoke when a physical key is pressed down. Uses KeyCode, int input
		
		switch(e.getKeyCode()) {
			case 37 : label.setLocation(label.getX()-10,label.getY());
				break;
			case 38 : label.setLocation(label.getX(),label.getY()-10);
				break;
			case 39 : label.setLocation(label.getX()+10,label.getY());
				break;
			case 40 : label.setLocation(label.getX(),label.getY()+10);
				break;
			
			
		}
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		// keyReleased = called whenever a button is released 
		
		System.out.println("You released key char : " + e.getKeyChar());
		System.out.println("You released key code : " + e.getKeyCode());	// this will give the key number 
		
		/* note --- * the key char of capital and small key are same
		 			* key char of shift is ? but key code is 16
		 			* the arrow keys do not produce a key char but they produce a key code
		 			* 
		*/
	}

	
}

public class Sh_46_KeyListener_Moving {
	public static void main(String[] args) {
		
		new SampleClass();
		
	}
}
