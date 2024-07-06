package Bro_codes_java_reloaded;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Sh_32_Flow_Layout {

	public static void main(String[] args) {
		
		// Layout Manager = Defines the natural layout for conponents within a container
		
		// FlowLayout = places components in a row , sized at their preferred size.
		//				If the horizontal space in the container is too small,
		//				the FlowLayout class uses the next availble row.
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(520, 520);
//		frame.setLayout(new FlowLayout());
//		frame.setLayout(new FlowLayout(FlowLayout.LEADING));
//		frame.setLayout(new FlowLayout(FlowLayout.TRAILING));
		frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));		// frame use border layout by default
		
		
		/* YOU CAN ALSO USE FLOW LAYOUT IN PANELS */
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(250,250));
		panel.setBackground(Color.yellow);
		panel.setLayout(new FlowLayout());	// panels use flowlayout by default
		
		
//		JButton button = new JButton();
//		button.setText("1");
//		frame.add(button);
		
//		frame.add(new JButton("1"));
//		frame.add(new JButton("2"));
//		frame.add(new JButton("3"));
//		frame.add(new JButton("4"));
//		frame.add(new JButton("5"));
//		frame.add(new JButton("6"));
//		frame.add(new JButton("7"));
//		frame.add(new JButton("8"));
//		frame.add(new JButton("9"));
		

		panel.add(new JButton("1"));
		panel.add(new JButton("2"));
		panel.add(new JButton("3"));
		panel.add(new JButton("4"));
		panel.add(new JButton("5"));
		panel.add(new JButton("6"));
		panel.add(new JButton("7"));
		panel.add(new JButton("8"));
		panel.add(new JButton("9"));
		
		frame.add(panel);
		frame.setVisible(true);		// set visibility at the end of the creation otherwise our added material will not be shown 
									// if we want to show we need to resize the window
	}

}
