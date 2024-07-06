package Bro_codes_java_reloaded;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

class ColorChooserDemo extends JFrame implements ActionListener{

	JButton button;
	JLabel label;
	
	 ColorChooserDemo(){
		 
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 this.setLayout(new FlowLayout());
		 
		 button = new JButton("Choose Color");
		 button.addActionListener(this);
		 
		 label = new JLabel();
		 label.setText("This is my sample text.");
		 label.setFont(new Font("Times New Roman",Font.PLAIN,100));
		 label.setBackground(Color.green);
		 label.setOpaque(true); 		// IMPORTANT  TO SET BACKGROUND COLOR !!!
		 
		
		 this.add(button);
		 this.add(label);
		 this.pack();
		 this.setVisible(true);
		 
	 }
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			
			JColorChooser colorChooser = new JColorChooser();
			
			Color color = JColorChooser.showDialog(null, "Pick a color ..... I Guess", Color.BLACK);
		
			// label.setForeground(color);
			label.setBackground(color);
		}
		
	}
	
}

public class Sh_45_ColorChooser {
	public static void main(String[] args) {
		
		// JColorChooser : A GUI mechanism that let's a user choose a color
		
		new  ColorChooserDemo();
		
	}
}
