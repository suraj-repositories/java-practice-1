package Bro_codes_java_reloaded;
// you can also set the position of jframe where it open in your window - default it open in the top left corner 
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

class NewFrame extends JFrame{
	NewFrame(){
		this.setTitle("JFrame title goes from here");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(300,300,420,420);	// jframe position and size -- x axis | y axis | width | height
		this.setResizable(false); 		// no rights to resize window
		this.setSize(420,420);			// setting the size of frame
		this.setVisible(true);			// set the frame visibility by default it is false -- it run in the background
		ImageIcon icon = new ImageIcon("images/google.png");		// create an image icon
		this.setIconImage(icon.getImage());			// change icon of image
		this.getContentPane().setBackground(Color.RED); // change the background-color
//		this.getContentPane().setBackground(getBackground());
	}
}

public class Sh_27_JFrame_secondMethod {

	public static void main(String[] args) {
		
		
		NewFrame myNewFrame = new NewFrame();			// we can use this frame by creating object and also change the values of attributes
//		new NewFrame();			// this will also the same -> ! but we can not change the properties 
		
	
		

	}

}
