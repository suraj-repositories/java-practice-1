package company_package;
import java.util.Scanner;
// if you enter number larger number than 125 you got error to resolve the error catch exception applies
 @SuppressWarnings("serial")
class MyException extends Exception{
	@Override
	public String toString() {
//		return super.toString() + " i am a toString()";
		return "I am a toString()";
	}
	
	@Override
	public String getMessage() {
//		return super.getMessage() + " i am a getMessage()" ;
		return "I am a getMassage()";
	}
	
}

public class Java_Practice_Exception_Class {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER NUMBER : ");
		int num = sc.nextInt();
		if(num>125) {
			try {
//				throw new MyException();
				throw new ArithmeticException("this is an exception");
			}
			catch(Exception e) {
				
				System.out.println("AN ERROR OCCURRED !");
				
				System.out.println(e.toString()+"\n");  	
				System.out.println(e+"\n");				// by default the 'e' called to-String method
				System.out.println(e.getMessage()+"\n");
				
				e.printStackTrace();       			    // print stack trace detect the error line
				
			}
			System.out.println("you can continue with the program /n/n");
		}
	}
}
