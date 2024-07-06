package ActionHandler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import Text.EditableText;



public class FileHandler {

	public FileHandler(){
		

	}
	
	public void openFile() {
		System.out.println("you clicked on openfile");
	}
	
	public void saveAsFile() {
		System.out.println("you clicked on save file");
		
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setCurrentDirectory(new File("."));
		
		int response = fileChooser.showSaveDialog(null);
		
		if(response == JFileChooser.APPROVE_OPTION);
		{
			File file;
			PrintWriter fileOut = null;
			file = new File (fileChooser.getSelectedFile().getAbsolutePath());
			
			System.out.println(file);
			
			try {
				fileOut = new PrintWriter(file);
//				fileOut.println(textArea.getText());
				System.out.println();
			}
			catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
			finally {
				fileOut.close();
			}
		}
	
		
	}
	
	
}
		

	

