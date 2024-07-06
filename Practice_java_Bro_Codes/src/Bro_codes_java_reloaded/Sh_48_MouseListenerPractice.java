package Bro_codes_java_reloaded;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MouseListenerDemo2 extends JFrame implements MouseListener{
	
	JLabel label;
	
	ImageIcon smileIcon;
	ImageIcon nervousIcon;
	ImageIcon dizzyIcon;
	ImageIcon cryIcon;
	
	MouseListenerDemo2(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		smileIcon = new ImageIcon("images/smile.png");
		nervousIcon = new ImageIcon("images/nervous.png");
		dizzyIcon = new ImageIcon("images/dizzy.png");
		cryIcon = new ImageIcon("images/cry.png");
		
		label = new JLabel();
		label.addMouseListener(this);
		label.setIcon(smileIcon);
		
		this.add(label);
		this.pack();
		this.setVisible(true);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// Invoked when the mouse button has been clicked (pressed and relesed) on a component 

		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// Invoked when a mouse button has been pressed on a component
		label.setIcon(dizzyIcon);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// Invoked when a mouse button has been released on a component
		label.setIcon(cryIcon);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// Invoked when a mouse button has been released on a component
		label.setIcon(nervousIcon);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// Invoked when the mouse enters a component
		label.setIcon(smileIcon);
	}
}

public class Sh_48_MouseListenerPractice {
	public static void main(String[] args) {
		
		new MouseListenerDemo2();
		
	}
}
