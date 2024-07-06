package Bro_codes_java_reloaded;

import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

// also called nameless objects


public class Sh_56_anonymousObjects {
	public static void main(String[] args) {
		
		JFrame frame = new  JFrame();
		ArrayList<JLabel> deck = new ArrayList<JLabel>();
		
		/*if we want to add large number of images this will increase the programe size
		
		ImageIcon AC = new ImageIcon("images/smile.png");
		JLabel ACLabel = new JLabel(AC);
		deck.add(ACLabel);
		
		... repeat 50 more times :(
		*/
		
		for(int i =0 ;i<50;i++) {
			deck.add(new JLabel(new ImageIcon("images/smile.png")));
			frame.add(deck.get(i));
		}
		
//		frame.add(deck.get(0));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,432);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}

}
