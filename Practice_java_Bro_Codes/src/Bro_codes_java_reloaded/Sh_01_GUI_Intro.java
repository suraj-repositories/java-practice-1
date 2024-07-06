package Bro_codes_java_reloaded;

import java.awt.Component;

import javax.swing.JOptionPane;

public class Sh_01_GUI_Intro {
	public static void main(String[] args) {
		
		// taking input and display output
		String name = JOptionPane.showInputDialog("ENTER YOUR NAME : ");  // it will shows the input dialog
		JOptionPane.showMessageDialog(null, "hello "+name);			// output message display
		
		// again taking integer input -> note- the input is always in string we need to typecast with integer
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age : "));
		JOptionPane.showMessageDialog(null, "You are "+age+ " years old");
		
		// same is true for double by changing all int to double
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter Your Height : "));
		JOptionPane.showMessageDialog(null, "Your height is : "+height);

	}
}
