package Bro_codes_java_reloaded;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Sh_29_Panels_Java {
	public static void main(String[] args) {
		
		// JPanel = a GUI component that functions as a container to hold other components
		
		ImageIcon icon = new ImageIcon("images/s2.png");
		
		
		JLabel label = new JLabel();
		label.setText("It's me");
		label.setIcon(icon);
		// label.setVerticalAlignment(JLabel.BOTTOM);		// they are compulsary when no using layout manager
		// label.setHorizontalAlignment(JLabel.RIGHT);
		label.setBounds(25, 20, 75, 75);			// you can set the position according you
		
		
		
		
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.RED);
		redPanel.setBounds(0,0,250,250);
		redPanel.setLayout(null);	
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.BLUE);
		bluePanel.setBounds(250,0,250,250);
		bluePanel.setLayout(null);	
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.GREEN);
		greenPanel.setBounds(0,250,500,250);
		greenPanel.setLayout(null);	
//		greenPanel.setLayout(new BorderLayout());// here we are using the  border layout so set the content in the middle left corner of the panel
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);	// because we are going to placing all components manually 
		frame.setSize(750,750);
		frame.setVisible(true);
//		greenPanel.add(label);			// add the label into green panel
		bluePanel.add(label);			// we can't use multiple	
		frame.add(redPanel);
		frame.add(bluePanel);
		frame.add(greenPanel);
		
		
	}
}
