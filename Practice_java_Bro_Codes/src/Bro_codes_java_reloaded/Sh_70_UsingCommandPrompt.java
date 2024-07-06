package Bro_codes_java_reloaded;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class SeeRunFrame extends JFrame{
	
	ImageIcon showOff;
	
	JLabel label;
	
	SeeRunFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		
		showOff = new ImageIcon("images/commandPrompt.png");
		
		label = new JLabel();
		label.setIcon(showOff);
		label.setBounds(0, 0, 1280, 800);
		
		
		this.setSize(label.getSize());
	    this.add(label);
		
		this.setVisible(true);
		
	}
}

public class Sh_70_UsingCommandPrompt {
	public static void main(String[] args) {
		
		new SeeRunFrame();
	}
}
