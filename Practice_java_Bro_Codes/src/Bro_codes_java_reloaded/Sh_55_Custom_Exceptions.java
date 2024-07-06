package Bro_codes_java_reloaded;

import java.util.Scanner;

class AgeException extends Exception{
	AgeException(String message){
		super(message);
	}
}

public class Sh_55_Custom_Exceptions {
	public static void main(String[] args) {
		
		// exception = an event,after execution, that disrupts the normal flow of the program
		// ex- ArithmeticException, ArrayIndexOutOfBoundException, FileNotFoundException
		
		// user-defined exception = custom exceptions
		// ex. DuplicateEmail, InvalidCreditException, AgeException
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENTER YOUR AGE: ");
		int age = sc.nextInt();
		try {
			checkAge(age);
		}
		catch(Exception e){
			System.out.println("A problem occured : "+e);
		}
		
	}

	 static void checkAge(int age) throws AgeException {
		if(age<18) {
			throw new AgeException("\n you must be 18+");
		}
		else {
			System.out.println("you are now sighed up!");
		}
	}
}
