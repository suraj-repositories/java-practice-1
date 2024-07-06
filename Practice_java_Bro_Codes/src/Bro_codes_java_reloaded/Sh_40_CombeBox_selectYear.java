package Bro_codes_java_reloaded;
/*
 *  Note -- comboBox's constructor takes a referende dataType
 *  If you want to make an array of integer you need to 
 *  use wraper version of 'int' that is Integer
*/

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

class MyFrameComBox extends JFrame implements ActionListener{
	
	JComboBox comboBox ;
	MyFrameComBox(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		String[] animals = {"dog","cat","bird"};// creating an array of reference datatype ---- wrapper class
		comboBox = new JComboBox(animals);		// pass the array in constructor of JComboBox
		
		comboBox.addActionListener(this); 		// IMPORTANT--- this is needed to perform a cetatin task if any event will happen
		
//		comboBox.setEditable(true);			// Edit text || select text
//		System.out.println(comboBox.getItemCount());		// to count the number of items in comboBox
//		comboBox.addItem("horse");			// add element
//		comboBox.insertItemAt("pig", 0); 	// Insert at any location or add value in any place -- it can't delete the element
//		comboBox.setSelectedIndex(0); 		// set selected index -- important
//		comboBox.removeItem("cat");			// remove certain item
//		comboBox.removeItemAt(1);			// remove item from any index
//		comboBox.removeAllItems(); 			// remove all items in comboBox
		
		
		this.add(comboBox);    //adding comboBox in brame
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==comboBox) {
			
			System.out.println(comboBox.getSelectedItem()); 		// method to get selected item
//			System.out.println(comboBox.getSelectedIndex());		// to select the index of the selected item in array
			
		}
	}
}

public class Sh_40_CombeBox_selectYear {
	public static void main(String[] args) {
		
		// JComboBox = A component that combines a button or editable field and a drop-down list
		
		new MyFrameComBox();
	}
}
