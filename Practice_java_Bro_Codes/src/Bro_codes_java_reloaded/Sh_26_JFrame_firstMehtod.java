package Bro_codes_java_reloaded;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Sh_26_JFrame_firstMehtod {
	public static void main(String[] args) {
		
		// JFrame : a GUI window to add components to
		
		JFrame frame = new JFrame();		// create a frame
		frame.setTitle("JFrame title goes from here");			// set title of the j-frame || another method is to pass title in frame constructor as a string argument
		
		/*	IMPORTANT	*/
		// frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);		// By default
		// frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);	// You can also use this -> by using this the frame never close on clicking the X button
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 			// exit out of application
//		frame.setResizable(false); 	// prevent frame for being resized -> stop resizing
		frame.setSize(420,420);		// set the x-dimension, and y-dimension of frame
		frame.setVisible(true);		// make frame visible
		
		ImageIcon image = new ImageIcon("images/google.png");		// create an image icon
		frame.setIconImage(image.getImage());			// change icon of image
		
		frame.getContentPane().setBackground(Color.RED); 			// change color of background
//		frame.getContentPane().setBackground(new Color(255,0,0)); 	// you can place RGB 
//		frame.getContentPane().setBackground(new Color(0x123456)); 	// and HEX values here	0x represent the hexadecimal values
		
		
	}
}
