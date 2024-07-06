package Bro_codes_java_reloaded;

import java.awt.*;
import javax.swing.*;

class ProgressBarDemo {
	 
	JFrame frame = new JFrame();
	JProgressBar bar = new JProgressBar(0,100);		// you can pass the minimum and maximum value 
	
	ProgressBarDemo(){
		
		bar.setValue(0);			// you can set the value of progress bar
		bar.setBounds(0,0,420,50);		// set the bounds that is ==> x-axis | y-axis | width | height
		
		bar.setStringPainted(true); // IMPORTANT - method who add a changing percentage value in our profress bar 
		bar.setFont(new Font("MV Boli",Font.PLAIN,15));
		bar.setForeground(Color.red);
		bar.setBackground(Color.black);
		
		frame.add(bar);			// adding the bar into frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
		fill();			// 
	}
	
	public void fill() {
		int counter = 0;
		
		/* making coundation */
		while(counter <= 100) {
			bar.setValue(counter);
			try {					
				Thread.sleep(50);				// stop the program for 1000 mili- seconds  | it may throw an exception so surround with try catch 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			counter += 1;
		}
		bar.setFont(new Font("MV Boli",Font.PLAIN,30));
		bar.setString("BOOM");		// setting the text after coundation
		
	}
	
}
public class Sh_42_Progress_Bar {

	public static void main(String[] args) {
		
		// Progress bar = Visual aid to let the user know that an operation is processing
		
		ProgressBarDemo progressBarDemo = new ProgressBarDemo();

	}

}
