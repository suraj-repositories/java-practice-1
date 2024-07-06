package Bro_codes_java_reloaded;

import java.util.Random;

class Dice{
	
	Random random;			// here we can use Random object as an attribute
	int number;
	
	Dice(){
		random= new Random();		// then we use this instance as an attribute
		roll();
	}
	void roll(){
		number = random.nextInt(6)+1;			// here we generating random numbers
		System.out.println(number);
		
	}
}

public class Sh_10_Imp_Object_Attribute {
	public static void main(String[] args) {
		
		Dice d= new Dice();
		
		d.roll();			// every time when we call the function the value will be change
		d.roll();			// value of this method is different 
		
	}
}
