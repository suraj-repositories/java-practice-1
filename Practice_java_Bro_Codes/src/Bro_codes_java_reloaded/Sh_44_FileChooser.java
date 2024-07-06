package Bro_codes_java_reloaded;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;



class ChooseFileDemo extends JFrame implements ActionListener{

	JButton button ;
	
	ChooseFileDemo(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Select file");		// creating a button who using the action lisener to select a file after click on it 
		button.addActionListener(this);
		
		this.add(button);		// do not forgot to add button on your parent frame
		this.pack();
		this.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			
			JFileChooser fileChooser = new JFileChooser();		// it creates a filechooser instance but it will not work until we use "showOpenDialog" or "show_save_dialog"
			
//			fileChooser.setCurrentDirectory(new File("."));		// to choose your project folder in which your java files are stored
			fileChooser.setCurrentDirectory(new File("C:\\Users\\Administrator\\Desktop"));		// to choose any specific folder 
			
			
//			fileChooser.showOpenDialog(null);			// it opens the filechooser by which we can choose a file
//			int response = fileChooser.showOpenDialog(null);// select file to open   	// it returns an integer value 0 when any file was selected otherwise it returns '1' when we click on cancel or close
			int response = fileChooser.showSaveDialog(null);
			
			if(response == JFileChooser.APPROVE_OPTION) {
				File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
				
				System.out.println(file);
			}
		}
		
	}
	
}
public class Sh_44_FileChooser {
	public static void main(String[] args) {
		
		// JFileChooser = A GUI mechanism that let's a user choose a file (helpful for opening or saving files)
		
		new ChooseFileDemo();
		
		
	}

}
