package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {

	JFrame frame;
	JTextField textField;
	JButton[] numberButton = new JButton[10];		// creating an array of button that is used as numbers of calc
	JButton[] functionButton = new JButton[9];		// instead of creating seperate buttons we can create an array of buttons
	JButton addButton,subButton,mulButton,divButton;
	JButton decButton,equButton,delButton,clrButton,negButton;
	JPanel panel;
	
	Font myFont = new Font("Times New Roman",Font.BOLD,30);			// declaring font which we are going use in whole program we can call this any time
	
	double num1=0,num2=0,result=0;
	char operator;
	
	Calculator(){
		
		frame = new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,550);
		frame.setLayout(null);
		
		textField = new JTextField();				// creating search field 
		textField.setBounds(50,25,300,50);
		textField.setFont(myFont);
		textField.setEditable(false);
		
		addButton = new JButton("+");		// adding charcter to button
		subButton = new JButton("-");
		mulButton = new JButton("*");
		divButton = new JButton("/");
		decButton = new JButton(".");
		equButton = new JButton("=");
		delButton = new JButton("Delete");
		clrButton = new JButton("clear");
		negButton = new JButton("(-)");
		
		functionButton[0] = addButton;			// adding these seperate buttons into array(functional array)
		functionButton[1] = subButton;
		functionButton[2] = mulButton;
		functionButton[3] = divButton;
		functionButton[4] = decButton;
		functionButton[5] = equButton;
		functionButton[6] = delButton;
		functionButton[7] = clrButton;
		functionButton[8] = negButton;
		
		for(int i=0;i<9;i++) {				// changeing properies of function buttons useing a loop for convenience
			functionButton[i].addActionListener(this);
			functionButton[i].setFont(myFont);
			functionButton[i].setFocusable(false);
		}
		for(int i=0;i<10;i++) {				// adding value to the number buttons also add action listners for convenience useing loop
			numberButton[i] = new JButton(String.valueOf(i));
			numberButton[i].addActionListener(this);
			numberButton[i].setFont(myFont);
			numberButton[i].setFocusable(false);
		}
		
		delButton.setFont(new Font("Times New Roman" ,Font.BOLD,25));
		
		negButton.setBounds(50,430,100,50);			// setting position manually
		delButton.setBounds(150,430,100,50);
		clrButton.setBounds(250,430,100,50);
		
		panel = new JPanel(); 				// creating jpanel
		panel.setBounds(50,100,300,300);
		panel.setLayout(new GridLayout(4,4,10,10));		// adding a grid layout to add buttons inside the grid
		
		panel.add(numberButton[1]);		// adding item's to grid
		panel.add(numberButton[2]);
		panel.add(numberButton[3]);
		panel.add(addButton);
		panel.add(numberButton[4]);
		panel.add(numberButton[5]);
		panel.add(numberButton[6]);
		panel.add(subButton);
		panel.add(numberButton[7]);
		panel.add(numberButton[8]);
		panel.add(numberButton[9]);
		panel.add(mulButton);
		panel.add(decButton);
		panel.add(numberButton[0]);
		panel.add(equButton);
		panel.add(divButton);
		
		
		frame.add(panel);			// adding everything into frame
		frame.add(negButton);
		frame.add(delButton);
		frame.add(clrButton);
		
		frame.add(textField);
		frame.setVisible(true);
		
	}
	
	//------------------------------------------------------MAIN----------------------
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
	}
	//--------------------------------------------------------------------------------
	@Override
	public void actionPerformed(ActionEvent e) {

		for(int i=0;i<10;i++) {				// using for loop to iterate all buttons at a time
			if(e.getSource()==numberButton[i]) {
				textField.setText(textField.getText().concat(String.valueOf(i)));	
			}
		}
		if(e.getSource()==decButton) {			// special button need to addActions seperately
			textField.setText(textField.getText().concat("."));	
		}
		if(e.getSource()==addButton) {			// if we click on add button then the following we need to happen
			num1 = Double.parseDouble(textField.getText());			// store the pervious text into a variable	(not forgot to type cast it into double)
			operator='+';											// then set the operator
			textField.setText("");									// for convenience lets clear the area for next value
		}
		if(e.getSource()==subButton) {				// same as addition
			num1 = Double.parseDouble(textField.getText());
			operator='-';
			textField.setText("");
		}
		if(e.getSource()==mulButton) {		// same as addition
			num1 = Double.parseDouble(textField.getText());
			operator='*';
			textField.setText("");
		}
		if(e.getSource()==divButton) {		// same as addition
			num1 = Double.parseDouble(textField.getText());
			operator='/';
			textField.setText("");
		}
		if(e.getSource()==equButton) {		// if we are pressing equal that means we fill the second value 
			num2= Double.parseDouble(textField.getText());		// get the second value and cast as an double
			
			switch(operator) {			// perform operations
			case'+' -> result = num1+num2;
			case'-' -> result = num1-num2;
			case'*' -> result = num1*num2;
			case'/' -> result = num1/num2;
			}
			
			textField.setText(String.valueOf(result));		// set the answer into textfield as an string
			num1=result;		// store the result as an first value
		}
		if(e.getSource()==clrButton) {			// when we click on clear button we want to clear the textfield
			textField.setText("");
		}
		if(e.getSource()==delButton) {			//	delete the char from last of the string
			String string = textField.getText();		// get the value of textfield and store it as a new string
			textField.setText("");		// clear the textfield and show ...	
			for(int i=0;i<string.length()-1;i++) { // iterrate the string length-1 times and set value to textfield in each iteration and add the next value respectively  
				textField.setText(textField.getText()+string.charAt(i));	
				
			}	
		}
		if(e.getSource()==negButton) {
			double temp = Double.parseDouble(textField.getText());		// get the string from textfield and store as an double value after type cast 
			temp = temp*(-1);		// change value in negative number by multiply with one 
			textField.setText(String.valueOf(temp));	// set the value to text field as an string
		}
	}

}
