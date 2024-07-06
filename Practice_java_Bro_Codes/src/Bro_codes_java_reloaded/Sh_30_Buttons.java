package Bro_codes_java_reloaded;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MyFrame extends JFrame implements ActionListener{
	
	JButton button ;
	
	JLabel label;
	
	MyFrame(){
		
		ImageIcon icon = new ImageIcon("images/google.png");
		ImageIcon icon2 = new ImageIcon("images/f.jpg");
		
		label = new JLabel();
		label.setIcon(icon2);
		label.setBounds(75,200,300,150);
		label.setVisible(false);		// not visible at this time we can make visible when we want
		
		button = new JButton();
		button.setBounds(100, 100, 250, 75);
		button.addActionListener(this);
		
		//button.addActionListener(e -> System.out.println("clicked"));	// lambda expression 
		
		/* you can also use this as an better way 
		 * -- to use gamma function remove override method ,
		 * implimenting interface
		 * and use it in the place of "button.addActionListener(this);" 
		 */
		
		button.setText("I am a button");
		button.setFocusable(false);			// to remove text border
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);		// set the position of text according to the image
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic sans",Font.BOLD,20));
		button.setIconTextGap(-5);	// gap between icon and the text	
		button.setForeground(Color.cyan);			// set the text color
		button.setBackground(Color.BLACK);
		button.setBorder(BorderFactory.createEtchedBorder());
//		button.setEnabled(false); 	// to disable the button
		
	
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setVisible(true);
		this.setSize(500,500);
		this.add(button);
		this.add(label);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
			if(e.getSource()==button) {
				System.out.println("..clicked..");
//				button.setEnabled(false);		// if you want to the button is clickable once use this method in action performed
				label.setVisible(true);
			}
	}
}

public class Sh_30_Buttons {
	public static void main(String[ ] args) {
		
		// JButton = a botton that performs an action when clicked on
		
		MyFrame frame = new MyFrame();
		
	}
}
