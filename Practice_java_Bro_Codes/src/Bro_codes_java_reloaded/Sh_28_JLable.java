package Bro_codes_java_reloaded;
// NOTE -> to see output comment the pack method and uncomment others
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Sh_28_JLable {

	public static void main(String[] args) {
		
		// JLable - a GUI displays area for a string of text , an image or both
		
		ImageIcon image = new ImageIcon("images/google.png");
		Border border = BorderFactory.createLineBorder(Color.GREEN,3);
//		Border border = BorderFactory.createLineBorder(Color.red,3);
//		Border border = BorderFactory.createLineBorder(Color.YELLOW,55);
		
		JLabel label = new JLabel();		// create a label
		label.setText("This is a lable.");	// add text in label
		label.setIcon(image);				// add an image in the label
		label.setHorizontalTextPosition(JLabel.CENTER); 	// set text LEFT, RIGHT or CENTER of image
		label.setVerticalTextPosition(JLabel.TOP);			// set text TOP, BOTTOM or CENTER of image
		label.setForeground(new Color(0x00ff00));	// change  color of the text
		label.setFont(new Font("Times New Roman",Font.CENTER_BASELINE,56));		// set font of the text and also size of the text
		label.setIconTextGap(-5);				// set gap of text to image
		label.setBackground(Color.black);		// set background color
		label.setOpaque(true);		// to set background it is needed to set opaque property to true
		label.setBorder(border);		// to create border first we need to declare at the top
		label.setVerticalAlignment(JLabel.CENTER);	// set vertical position of icon + text within label 
		label.setHorizontalAlignment(JLabel.CENTER);// set Horizontal position of icon + text within label 
//		label.setBounds(0, 0, 350, 250);		// x,y,width,height -> where x,y is the axis position 
		
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setSize(500,500);
//		frame.setLayout(null);	// it set on border by default 
		frame.setVisible(true); 
		
		frame.add(label);
		
		frame.pack();		// fit the content -> note- first add label then use pack method otherwise it doesn't work
		
		
		
	}

}
