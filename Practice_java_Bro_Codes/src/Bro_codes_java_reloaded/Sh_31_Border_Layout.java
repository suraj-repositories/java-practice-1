package Bro_codes_java_reloaded;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Sh_31_Border_Layout {
	public static void main(String[] args) {
	/*	
		Layout Manager = defines the natural layout for components within a constructor
				
		3 common managers
		
		BorderLayout = A borderLayout places components in five areas : NORTH,SOUTH,EAST,WEST,CENTER.
						all extra space is placed in the center Area.
	*/
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout(10,10));		// Passing margin width and height
		frame.setSize(500,500);
		frame.setVisible(true);
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		panel1.setBackground(Color.red);
		panel2.setBackground(Color.blue);
		panel3.setBackground(Color.green);
		panel4.setBackground(Color.yellow);
		panel5.setBackground(Color.black);
		
		panel1.setPreferredSize(new Dimension(100,100));		// setting the size of the border
		panel2.setPreferredSize(new Dimension(100,100));
		panel3.setPreferredSize(new Dimension(100,100));
		panel4.setPreferredSize(new Dimension(100,100));
		panel5.setPreferredSize(new Dimension(100,100));
		
		//--------------------- SUB-PANELS -----------------------	
		
		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		JPanel panel8 = new JPanel();
		JPanel panel9 = new JPanel();
		JPanel panel10 = new JPanel();
		
		panel6.setBackground(Color.BLACK);
		panel7.setBackground(Color.DARK_GRAY);
		panel8.setBackground(Color.GRAY);
		panel9.setBackground(Color.lightGray);
		panel10.setBackground(Color.white);
		
		panel5.setLayout(new BorderLayout());	// here we are going to use border layout inside an panel
		
		panel6.setPreferredSize(new Dimension(50,50));		// setting the size of the border
		panel7.setPreferredSize(new Dimension(50,50));
		panel8.setPreferredSize(new Dimension(50,50));
		panel9.setPreferredSize(new Dimension(50,50));
		panel10.setPreferredSize(new Dimension(50,50));
		
		panel5.add(panel6,BorderLayout.NORTH);
		panel5.add(panel7,BorderLayout.SOUTH);
		panel5.add(panel8,BorderLayout.EAST);
		panel5.add(panel9,BorderLayout.WEST);
		panel5.add(panel10,BorderLayout.CENTER);
		
		//--------------------- SUB-PANELS -----------------------
		
		frame.add(panel1,BorderLayout.NORTH);		// set the position
		frame.add(panel2,BorderLayout.SOUTH);	
		frame.add(panel3,BorderLayout.EAST);	
		frame.add(panel4,BorderLayout.WEST);	
		frame.add(panel5,BorderLayout.CENTER);	
		 
	}
}
