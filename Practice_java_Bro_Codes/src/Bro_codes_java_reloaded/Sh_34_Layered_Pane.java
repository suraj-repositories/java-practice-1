package Bro_codes_java_reloaded;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class Sh_34_Layered_Pane {

	public static void main(String[] args) {
		
		// JLayeredPane = Swing container that provides a third dimension for positioning components
		//				ex - depth , Z-index
						
		JLabel label1 = new JLabel();
		label1.setOpaque(true);  // make sure to make it true - it is a kind by which out label is visible
		label1.setBackground(Color.red);
		label1.setBounds(50,50, 200, 200);
		
		JLabel label2 = new JLabel();
		label2.setOpaque(true);  
		label2.setBackground(Color.blue);
		label2.setBounds(100,100, 200, 200);
		
		JLabel label3 = new JLabel();
		label3.setOpaque(true); 
		label3.setBackground(Color.green);
		label3.setBounds(150,150, 200, 200);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0,0,500,500);			// set bounds for layered pane
		
		layeredPane.add(label1);
		layeredPane.add(label2);
		layeredPane.add(label3);
		
//		layeredPane.add(label1,JLayeredPane.DEFAULT_LAYER); // for bottom most layer
//		layeredPane.add(label2,JLayeredPane.DEFAULT_LAYER);
//		layeredPane.add(label3,JLayeredPane.DRAG_LAYER);	// for topmost layer
		
//		layeredPane.add(label1 , Integer.valueOf(0));		// bottom
//		layeredPane.add(label2 , Integer.valueOf(2));		// second
//		layeredPane.add(label3 , Integer.valueOf(1));		// first
		
		
		JFrame frame = new JFrame();
		frame.add(layeredPane);				// add layered pane into our frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(500,500));
		frame.setLayout(null);
		frame.setVisible(true);
		
		
	}

}
