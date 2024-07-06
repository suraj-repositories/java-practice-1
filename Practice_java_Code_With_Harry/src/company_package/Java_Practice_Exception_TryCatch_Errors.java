package company_package;
import java.util.Scanner;
// change float to int to see exception
// try to divide any element with zero

public class Java_Practice_Exception_TryCatch_Errors {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc =
		new Scanner(System.in);
		float a,b;
		
		while(true) {
			System.out.print("Enter Number : ");
			a = sc.nextFloat();
			System.out.print("Enter Number : ");
			b = sc.nextFloat();
			
			try {             // it try to execute a code in which runtime error may possible
				float c=a/b;
				System.out.println("The answer is : "+c);
			}
			catch(Exception e) {     // if it found any error it throws an exception 'e' - where e is an argument you can change it like variable name
				System.out.println("AN ERROR OCCURED !");
				System.out.println("THE ERROR IS : "+e);
				continue;
			}
		}
	
	}
}
