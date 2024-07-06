package Menus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.filechooser.FileNameExtensionFilter;

import ActionHandler.FileHandler;
import Text.EditableText;

public class FileMenu extends JMenu implements ActionListener{

	JMenuItem openItem;
	JMenuItem saveItem;
	JMenuItem exitItem;
	
	ImageIcon openImage;
	ImageIcon saveImage;
	ImageIcon exitImage;
	
	FileHandler filehandler;
	EditableText ett;
	
	public FileMenu(){
		this.setText("File");
		
		 filehandler = new FileHandler();
		 ett = new EditableText();
		
		// ---- creating imageIcons for items
		openImage = new ImageIcon("Images/open.png");
		saveImage = new ImageIcon("Images/save.png");
		exitImage = new ImageIcon("Images/exit.png");
		
		// ---------Creating items for fileMenu-----
		openItem = new JMenuItem("Open");
		saveItem = new JMenuItem("Save");
		exitItem = new JMenuItem("Exit");
		
		// ---------Set icons on items---------------
		openItem.setIcon(openImage);
		saveItem.setIcon(saveImage);
		exitItem.setIcon(exitImage);
		
		// ---------add action listeners to items ---------------
		openItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		// --------- set Mnemonic keys (shortcut keys)---------------
		openItem.setMnemonic(KeyEvent.VK_O);
		saveItem.setMnemonic(KeyEvent.VK_S);
		exitItem.setMnemonic(KeyEvent.VK_E);
		
		// ********** adding everything to the fileMenu ***********
		this.add(openItem);
		this.add(saveItem);
		this.add(exitItem);
		
	}
	
	public JMenu getFileMenu() {
		return this;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == openItem) {
			filehandler.openFile();
		}
		if(e.getSource() == saveItem) {
//			ett.saveAsFile();
		}
		if(e.getSource() == exitItem) {
			System.exit(0);
		}
		
	}
}
