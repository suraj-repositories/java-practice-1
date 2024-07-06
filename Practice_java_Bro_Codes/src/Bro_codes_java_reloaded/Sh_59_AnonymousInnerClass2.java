package Bro_codes_java_reloaded;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class FrameCreate extends JFrame {
	
	JButton button1 = new JButton("Button #1");
	JButton button2 = new JButton("Button #2");
	JButton button3 = new JButton("Button #3");
	
	FrameCreate(){
		
		button1.setBounds(100, 100, 100, 100);
		button2.setBounds(200, 100, 100, 100);
		button3.setBounds(300, 100, 100, 100);
		
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("you pressed button #1");
				
			}
			
		});
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("you pressed button #2");
				
			}
			
		});
		button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("you pressed button #3");
				
			}
			
		});
		
		this.add(button1);
		this.add(button2);
		this.add(button3);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
	}

	
}

public class Sh_59_AnonymousInnerClass2 {
	public static void main(String[] args) {
	
		FrameCreate myFrame = new FrameCreate();
		
	}
}
