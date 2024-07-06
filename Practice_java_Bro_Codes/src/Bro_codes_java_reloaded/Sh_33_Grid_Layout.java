package Bro_codes_java_reloaded;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Sh_33_Grid_Layout {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLayout(new GridLayout(3,3,10,10)); // this will take two or four arguments 
		// num_of_rows|| num_of_columns || horizontal_spacing || vertical_spacing
		
		
		/* 
		 * NOTE - if number of given button are greater than number of row*column 
		 * the compiler add a new column to adjust the counting
		 * 
		 * */
		
//		JButton button1 = new JButton("1");
//		frame.add(button1);							//  there is a shortcut to do this an anonymus method
		
		frame.add(new JButton("1"));
		frame.add(new JButton("2"));
		frame.add(new JButton("3"));
		frame.add(new JButton("4"));
		frame.add(new JButton("5"));
		frame.add(new JButton("6"));
		frame.add(new JButton("7"));
		frame.add(new JButton("8"));
		frame.add(new JButton("9"));
		
		
		
		
		

	}

}
