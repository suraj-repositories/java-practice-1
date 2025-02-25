package Bro_codes_java_reloaded;

// BY EXTANDING ABSTACTACTION CLASS -- We can use the key strokes


import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.*;


class KeyBindDemo {
	
	JFrame frame;
	JLabel label;
	
	Action upAction;
	Action downAction;
	Action leftAction;
	Action rightAction;
	
	KeyBindDemo(){
		
		frame= new JFrame("keybinding demo ");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		
		label = new JLabel();
		label.setBackground(Color.red);
		label.setBounds(100,100,100,100);
		label.setOpaque(true);
		
		upAction = new UpAction();
		downAction = new DownAction();
		leftAction = new LeftAction();
		rightAction = new RightAction();
		
		label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "upAction");		// first parameter take want keyboard key | second is a key for next-attribute-you can create it with any meaningful name as your program have 
		label.getActionMap().put("upAction", upAction);							// previous created key is using in this line 
		label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downAction");		
		label.getActionMap().put("downAction", downAction);
		label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "leftAction");		
		label.getActionMap().put("leftAction", leftAction);
		label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "rightAction");		
		label.getActionMap().put("rightAction", rightAction);
		
		label.getInputMap().put(KeyStroke.getKeyStroke('w'), "upAction");		// first parameter take want keyboard key | second is a key for next-attribute-you can create it with any meaningful name as your program have 
		label.getActionMap().put("upAction", upAction);							// previous created key is using in this line 
		label.getInputMap().put(KeyStroke.getKeyStroke('s'), "downAction");		
		label.getActionMap().put("downAction", downAction);
		label.getInputMap().put(KeyStroke.getKeyStroke('a'), "leftAction");		
		label.getActionMap().put("leftAction", leftAction);
		label.getInputMap().put(KeyStroke.getKeyStroke('d'), "rightAction");		
		label.getActionMap().put("rightAction", rightAction);
		
		frame.add(label);
		frame.setVisible(true);
	}
	
	public class UpAction extends AbstractAction{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			label.setLocation(label.getX(),label.getY()-10);
			
		}
	}
	public class DownAction extends AbstractAction {
		@Override
		public void actionPerformed(ActionEvent e) {
			label.setLocation(label.getX(),label.getY()+10);
			
		}
	}
	
	public class RightAction extends AbstractAction{
		@Override
		public void actionPerformed(ActionEvent e) {
			label.setLocation(label.getX()+10,label.getY());
			
			
		}
	}
	public class LeftAction extends AbstractAction{
		@Override
		public void actionPerformed(ActionEvent e) {
			
			label.setLocation(label.getX()-10,label.getY());
		}
	}
}

public class Sh_49_KeyBindings {
	public static void main(String[] args) {
		
		// Key Bindings = bind an Action to a KeyStoke
		//				don't require you to click a component to give it focus
		//				all Swing components  use Key bindings
		//				increased flexibility compared to keyListeners
		//				can assign key stroke to individual Swing components
		//				more difficult to utilize and set up .
			
		KeyBindDemo myObj = new KeyBindDemo();
		System.out.println("hiii");
	}

}
