package FrontScreen;

import java.awt.BorderLayout;
import java.awt.Dimension;


import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import Menus.TopMenuBar;
import Text.EditableText;
import Toolkit.TopToolBar;

public class Frame extends JFrame {


	public EditableText editableText;
	
	public Frame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		this.setJMenuBar(new TopMenuBar());					// adding menu Bar	
		this.add(new TopToolBar(),BorderLayout.NORTH);		// adding top toolbar on the frame 
		
		editableText = new EditableText();
		
		
		this.setVisible(true);
		this.add(editableText);
		
	}
}
