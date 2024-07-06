package Bro_codes_java_reloaded;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

class MyFrame_2 extends JFrame implements ActionListener{

	JButton button ;
	JTextField textField;
	
	MyFrame_2(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Submit");
		button.addActionListener(this);
		
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(250,40));
		textField.setFont(new Font("Consolas",Font.BOLD,30));
		textField.setForeground(Color.green);
		textField.setBackground(Color.black);
		textField.setCaretColor(Color.yellow);		// change cursor color
		textField.setText("USERNAME");
		
		
		this.add(button);
		this.add(textField);
		this.pack();		// fit the content
		this.setVisible(true);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			System.out.println(textField.getText());
			button.setEnabled(false);			// disable the button after using at once
			textField.setEditable(false);		// set text field uneditable
		}
		
	}
	
}

public class Sh_37_TextField_userInput {
	public static void main(String[] args) {
		
		// JTextField = A GUI textbox component that can be used to add , set , or get text
		
		MyFrame_2 frame = new MyFrame_2();
		
		
	}
}
