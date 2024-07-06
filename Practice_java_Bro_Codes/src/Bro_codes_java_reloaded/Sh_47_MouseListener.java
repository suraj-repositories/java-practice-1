package Bro_codes_java_reloaded;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

class MouseListenerDemo extends JFrame implements MouseListener{
	
	JLabel label;
	
	MouseListenerDemo(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		
		label = new JLabel();
		label.setBounds(0, 0, 100, 100);
		label.setBackground(Color.red);
		label.setOpaque(true);
		label.addMouseListener(this);
		
		this.add(label);
		this.setSize(500,500);
		this.setVisible(true);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// Invoked when the mouse button has been clicked (pressed and relesed) on a component 
//		System.out.println("You clicked the mouse button");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// Invoked when a mouse button has been pressed on a component
		System.out.println("You pressed the mouse button");
		label.setBackground(Color.yellow);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// Invoked when a mouse button has been released on a component
		System.out.println("You rleased the mouse button");
		label.setBackground(Color.green);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// Invoked when a mouse button has been released on a component
		System.out.println("You entered the component");
		label.setBackground(Color.blue);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// Invoked when the mouse enters a component
		System.out.println("You exited the component");
		label.setBackground(Color.red);
	}
}

public class Sh_47_MouseListener {
	public static void main(String[] args) {
		
		new MouseListenerDemo();
		
	}
}
