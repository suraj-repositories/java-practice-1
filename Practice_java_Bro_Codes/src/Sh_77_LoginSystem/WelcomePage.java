package Sh_77_LoginSystem;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePage {
	
	JFrame frame = new JFrame();
	JLabel welcomeLabel = new JLabel("Hello");
	
	WelcomePage(String userID){
		
		
		welcomeLabel.setBounds(0,0,400,35);
		welcomeLabel.setFont(new Font("Times New Roman",Font.PLAIN,35));
		welcomeLabel.setText("Hello "+userID);
		
		frame.add(welcomeLabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
