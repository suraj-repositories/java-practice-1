package Bro_codes_java_reloaded;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sh_20_Exception_Handling {

	public static void main(String[] args) {
		
		// exception = an event that occurs during the execution of a program that,
		//		distrupts the normal flow of the program
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("ENTER A WHOLE NUMBER TO DIVIDE : ");
			int x = sc.nextInt();
			
			System.out.println("ENTER A WHOLE NUMBER TO DIVIDE BY : ");
			int y = sc.nextInt();
			
			int z = x / y;
			System.out.println("Result : "+ z);
		}
		catch(ArithmeticException e) {
			System.out.println("you can not divide by zero IDIOT!");
		}
		catch(InputMismatchException e) {
			System.out.println("do you know what is number : enter a number");
		}
		catch(Exception e) {
			System.out.println("Exception find :" + e);
		}
		finally {
			System.out.println("this is always print");
			sc.close();				// it is used to close all open files and scanners
		}
		
	}

}
			