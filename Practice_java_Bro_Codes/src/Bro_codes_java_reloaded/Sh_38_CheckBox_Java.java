package Bro_codes_java_reloaded;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

class MyFrame3 extends JFrame implements ActionListener{
	
	JButton button;
	JCheckBox checkBox ;
	ImageIcon google;
	ImageIcon fb;
	
	MyFrame3(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton();
		button.setText("Submit");
		button.addActionListener(this);
		
		google = new ImageIcon("images/google.png");
		fb = new ImageIcon("images/fb.png");
		
		checkBox = new JCheckBox();
		checkBox.setText("Google");
		checkBox.setFont(new Font("Consolas",Font.BOLD,30));
		checkBox.setFocusable(false);
		checkBox.setIcon(google);
		checkBox.setSelectedIcon(fb);
		checkBox.addActionListener(this);
		
		this.add(button);
		this.add(checkBox);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==button) {
			System.out.println(checkBox.isSelected());
		}
		if(e.getSource()== checkBox) {
			if(checkBox.getText()=="Google") {
				checkBox.setText("Facebook");
			}
			else {
				checkBox.setText("Google");
			}
		}
	}
}
public class Sh_38_CheckBox_Java {
	public static void main(String[] args) {
		
		// JCheckBox = A GUI component that can be selected of deselected
		
		 new MyFrame3();
		
	}
}
