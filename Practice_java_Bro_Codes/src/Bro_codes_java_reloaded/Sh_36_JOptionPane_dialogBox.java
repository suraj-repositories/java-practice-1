package Bro_codes_java_reloaded;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Sh_36_JOptionPane_dialogBox {
	public static void main(String[] args) {
		
		// JOptionPane = pop up a standard dialog box that prompts users for a value
		//				or informs them of something.
		
//		JOptionPane.showMessageDialog(null, "this is an useless info","title", JOptionPane.PLAIN_MESSAGE);;
//		JOptionPane.showMessageDialog(null, "INFORMATION FOR YOU","title", JOptionPane.INFORMATION_MESSAGE);;
//		JOptionPane.showMessageDialog(null, "who are you ","title", JOptionPane.QUESTION_MESSAGE);;
//		JOptionPane.showMessageDialog(null, "do not do this !","title", JOptionPane.WARNING_MESSAGE);;
//		JOptionPane.showMessageDialog(null, "error.......!!","title", JOptionPane.ERROR_MESSAGE);;
		
		
		// JOptionPane.showConfirmDialog(null, "would you like to take a break ?", "asking", JOptionPane.YES_NO_CANCEL_OPTION);
		// System.out.println(JOptionPane.showConfirmDialog(null, "would you like to take a break ?", "asking", JOptionPane.YES_NO_CANCEL_OPTION));
		// int answer = JOptionPane.showConfirmDialog(null, "would you like to take a break ?", "asking", JOptionPane.YES_NO_CANCEL_OPTION);
		
		
		// String name = JOptionPane.showInputDialog("ENTER YOUR NAME : ");
		// System.out.println("Hello "+name);
		
		// creating the options 
		String [] responce = {"yes,thanks for asking","No.. not at all ", "not this time","slkfjslkdf"};
		
		ImageIcon icon = new ImageIcon("images/google.png");
		int ans = JOptionPane.showOptionDialog(null, "are you all right ", "title", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, responce, 0);
		System.out.println(ans);
	}
}
