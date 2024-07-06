package Bro_codes_java_reloaded;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class PracticeFrame extends JFrame{
	
	JButton myButton = new JButton("MyButton 1");
	JButton myButton2 = new JButton("MyButton 2");
	
	PracticeFrame(){
		
		myButton.setBounds(100, 100, 200, 100);
		myButton.addActionListener(

			(e) ->	System.out.println("you clicked on button #1")
		);
		
		myButton2.setBounds(100, 200, 200, 100);
		myButton2.addActionListener(

			(e) ->	System.out.println("you clicked on button #2")
		);
		
		
		this.add(myButton);
		this.add(myButton2);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500, 500);
		this.setVisible(true);
		
	}
}

public class Sh_61_Lambda_2 {
	public static void main(String[] args) {
		
		PracticeFrame myFrame = new PracticeFrame();
		
	}
}
