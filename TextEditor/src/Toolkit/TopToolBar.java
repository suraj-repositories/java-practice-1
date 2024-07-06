package Toolkit;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

import javax.swing.JLabel;
import javax.swing.JToolBar;

public class TopToolBar extends JToolBar {

	public JLabel newFile;
	public JLabel openFile;
	public JLabel saveFile;
	
	public TopToolBar(){
	
		
		newFile= new JLabel();
		newFile.setIcon(new ImageIcon("Images/newFile.png"));
		newFile.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		
		openFile = new JLabel();
		openFile.setIcon(new ImageIcon("Images/open.png"));
		openFile.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		
		saveFile = new JLabel();
		saveFile.setIcon(new ImageIcon("Images/save.png"));
		saveFile.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		
		this.add(newFile);
		this.add(openFile);
		this.add(saveFile);

		this.setBackground(Color.DARK_GRAY);
		this.setForeground(Color.gray);
		this.setPreferredSize(new Dimension(40,40));		// East&West | North&South
		
		
	}
	
}
