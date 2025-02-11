package Bro_codes_java_reloaded;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

class MenuBarDemo extends JFrame implements ActionListener{
	JMenuBar menuBar ;
	JMenu fileMenu;
	JMenu editMenu;
	JMenu helpMenu ;
	
	JMenuItem loadItem ;
	JMenuItem saveItem;
	JMenuItem exitItem ;
	
	ImageIcon loadImage;
	ImageIcon saveImage;
	ImageIcon exitImage;
	
	MenuBarDemo(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		
		loadImage = new ImageIcon("images/folder.png");
		saveImage = new ImageIcon("images/save.png");
		exitImage = new ImageIcon("images/x.png");
		
		menuBar = new JMenuBar();         // creating menu
		
		fileMenu = new JMenu("File");			// creating menuBar Menus 
		editMenu = new JMenu("Edit");
		helpMenu = new JMenu("Help");
		
		loadItem = new JMenuItem("Load");			// creating items for fileMenu -- seperately create them and then add in to the file menu
		saveItem = new JMenuItem("Save");
		exitItem = new JMenuItem("Exit");
		
		loadItem.addActionListener(this);			// adding action lisetner to detect the action 
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		loadItem.setIcon(loadImage);
		saveItem.setIcon(saveImage);
		exitItem.setIcon(exitImage);
		
		fileMenu.setMnemonic(KeyEvent.VK_F);  // l for load 
		editMenu.setMnemonic(KeyEvent.VK_E);
		helpMenu.setMnemonic(KeyEvent.VK_H);
		loadItem.setMnemonic(KeyEvent.VK_L); 	
		saveItem.setMnemonic(KeyEvent.VK_S);	
		exitItem.setMnemonic(KeyEvent.VK_E);			
		
		fileMenu.add(loadItem);			// adding items in the file menu 
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		
		menuBar.add(fileMenu);		// adding menus in the menubar
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		
		this.setJMenuBar(menuBar);
		this.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==loadItem) {
			System.out.println("you are clicked on the load ");
		}
		if(e.getSource()==saveItem) {
			System.out.println("Now you click on save ");
		}
		if(e.getSource()==exitItem) {
			System.exit( 0);     // to exit the porgram use system.exit(0) pass the value zero
		}
		
		
	}
	
}

public class Sh_43_MenuBar {
	public static void main(String[] args) {
		
		new MenuBarDemo();
	}
}
