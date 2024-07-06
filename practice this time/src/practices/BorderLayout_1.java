package practices;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BorderLayout_1 {
	public static void main(String[] args) {
		
		// creating a jframe
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setLayout(new BorderLayout());
		
		JLabel label = new JLabel();
		label.setText("shubham kumar maurya");
		label.setForeground(Color.green);
		label.setFont(new Font("Times new Roman",Font.BOLD,30));
		
		
		JPanel panel1 = new JPanel();			// create a panel
		panel1.add(label);
		
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		panel1.setBackground(Color.LIGHT_GRAY);			// set the color
		panel2.setBackground(Color.yellow);
		panel3.setBackground(Color.blue);
		panel4.setBackground(Color.DARK_GRAY);
		panel5.setBackground(Color.black);
		
		panel1.setPreferredSize(new Dimension(75,75));		// set the size
		panel2.setPreferredSize(new Dimension(75,75));
		panel3.setPreferredSize(new Dimension(75,75));
		panel4.setPreferredSize(new Dimension(35,35));
		panel5.setPreferredSize(new Dimension(75,75));
		
		frame.add(panel1,BorderLayout.NORTH);
//		frame.add(panel2,BorderLayout.SOUTH);
//		frame.add(panel3,BorderLayout.EAST);
		frame.add(panel4,BorderLayout.WEST);
		frame.add(panel5,BorderLayout.CENTER);
		
		
	}
}
