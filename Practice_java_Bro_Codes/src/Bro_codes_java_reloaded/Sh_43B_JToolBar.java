package Bro_codes_java_reloaded;

import java.awt.BorderLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

class Shubh extends JFrame{
	
	Image icon;
	JToolBar tb;
	JButton b1,b2,b3;
	
	
	Shubh(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(200,200,500,500);
		this.setTitle("holdON");
		icon = new ImageIcon("images/cry.png").getImage();
		
		b1 = new JButton("#1");
		b2 = new JButton("#2");
		b3 = new JButton("#3");
		
		tb = new JToolBar("ToolBar");
		
		tb.add(b1);
		tb.add(b2);
		tb.add(b3);
		
		tb.addSeparator();
		
		this.add(tb,BorderLayout.NORTH);
		this.setIconImage(icon);
		this.setVisible(true);
	}
}

public class Sh_43B_JToolBar {

	public static void main(String[] args) {
		
		new Shubh();
	}

}
