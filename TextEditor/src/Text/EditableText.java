package Text;

import java.awt.Dimension;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class EditableText extends JPanel {

	public JTextArea textArea;
	public JScrollPane scrollPane;
	
	public int posX = 50;
	public int posY = 50;
	public int WIDTH = 500;
	public int HEIGHT = 500;
	
	
	public EditableText(){
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Arial",Font.PLAIN,25));
		textArea.setWrapStyleWord(true);
		textArea.setLayout(null);
		textArea.setBounds(posX, posY, WIDTH, HEIGHT);
		
		
		scrollPane = new JScrollPane(textArea);
		scrollPane.setPreferredSize(new Dimension(WIDTH,HEIGHT));				// here you can set the dimentions for textarea
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);			// set this to see the scroll view 
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setAlignmentX(TOP_ALIGNMENT);
		scrollPane.setAlignmentY(LEFT_ALIGNMENT);
		scrollPane.setLayout(null);
		scrollPane.setBounds(posX, posY, WIDTH, HEIGHT);
		
//		this.add(textArea);
		this.add(scrollPane);
		this.setLayout(null);
		this.setBounds(posX, posY, WIDTH, HEIGHT);
	}
	
	public JTextArea getEditedText() {
		return textArea;
	}
	
	
}
