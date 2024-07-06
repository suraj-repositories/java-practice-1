package Bro_codes_java_reloaded;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class LaunchPage implements ActionListener{
	
	 JFrame frame = new JFrame();		// we are set this private bacause it is not using by any other class
	 JButton myButton = new JButton("New Window");
	
	LaunchPage(){
		
		myButton.setBounds(100, 160, 200, 40);
		myButton.setFocusable(false);
		
		/*	IMPORTANT	*/
		myButton.addActionListener(this);		// we are adding action lisener in this button and setting the argument to this --  
		
		
		
		
		
		frame.add(myButton);
		// frame.setBounds(100, 100, 200, 500);			// you can also set the position of the frame where it will open
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == myButton) 	{
			frame.dispose();			// important ot close the existing window !!!! without using this user can open any number of same window
			NewWindow myWindow = new NewWindow();
		}
		
	}
}
class NewWindow{
	
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	
	NewWindow(){
		
		label.setBounds(0,0,500,50);
		label.setText("Hello & welcome to new window");
		label.setFont(new Font(null,Font.PLAIN,25));
		
		frame.add(label);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}

/*  MAIN CLASS  */

public class Sh_35_New_Window_open {
	/*  MAIN METHOD  */
	public static void main(String[] args) {

		LaunchPage launchPage = new LaunchPage();
	
	}

}
