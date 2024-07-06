package Bro_codes_java_reloaded;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

class MyFrameCB extends JFrame implements ActionListener {
	
	JRadioButton googleButton ;
	JRadioButton facebookButton;
	JRadioButton phoneButton;
	
	ImageIcon googleIcon;
	ImageIcon fbIcon;
	ImageIcon phoneIcon;
	
	MyFrameCB(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		googleIcon=new ImageIcon("images/google.png");
		fbIcon = new ImageIcon("images/fb.png");
		phoneIcon = new ImageIcon("images/phone.png");
		
		googleButton = new JRadioButton("google");		// creating radio button
		facebookButton = new JRadioButton("facebook");
		phoneButton = new JRadioButton("phone");
		
		googleButton.setIcon(googleIcon);		// adding an icon in the place of radion button - it works like same
		facebookButton.setIcon(fbIcon);
		phoneButton.setIcon(phoneIcon);
		
		googleButton.addActionListener(this);		// add action listener to all of these buttons to get action
		facebookButton.addActionListener(this);
		phoneButton.addActionListener(this);
		
		ButtonGroup group = new ButtonGroup();		// group to select only one
		group.add(googleButton);
		group.add(facebookButton);
		group.add(phoneButton);
		
		this.add(googleButton);				// add buttons in frame
		this.add(facebookButton);
		this.add(phoneButton);
		
		this.pack();
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==googleButton) {			// now you can get the click source
			System.out.println("you choose google");
		}
		if(e.getSource()==facebookButton) {
			System.out.println("you choose facebook");
		}
		if(e.getSource()==phoneButton) {
			System.out.println("you choose phone");
		}
		
	}
}
public class Sh_39_RadioButtons {
	public static void main(String[] args) {
		
		// JRadioButton = One or more buttons in a grouping in which only one may be selected per group
		
		new MyFrameCB();
	}

}
