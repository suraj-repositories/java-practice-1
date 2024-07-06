package Menus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JMenuBar;


public class TopMenuBar extends JMenuBar implements ActionListener{
	 
	FileMenu fileMenu;		
	EditMenu editMenu;
	HelpMenu helpMenu;
	
	public TopMenuBar(){
		
		// creating instances at the time of construct
		fileMenu = new FileMenu();
		editMenu = new EditMenu();
		helpMenu = new HelpMenu();
		
		// setting mnemonic keys (shortcut Keys)
		fileMenu.setMnemonic(KeyEvent.VK_F);
		editMenu.setMnemonic(KeyEvent.VK_E);
		helpMenu.setMnemonic(KeyEvent.VK_H);
		
		// ********** adding everything to the top menu bar extends JMenuBar*********** 
		this.add(fileMenu);
		this.add(editMenu);
		this.add(helpMenu);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	
		
	}
	
}
