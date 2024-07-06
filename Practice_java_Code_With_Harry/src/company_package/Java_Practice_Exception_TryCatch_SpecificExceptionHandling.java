package company_package;
import java.util.Scanner;

// here multiple catches are possible with single try
public class Java_Practice_Exception_TryCatch_SpecificExceptionHandling {
	public static void main(String[] args) {
		
		int [] arr= new int[3];
		arr[0]=12;
		arr[1]=89;
		arr[2]=24;
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("ENTER ARRAY INDEX NUMBER : ");
			int index=sc.nextInt();
			System.out.println("ENTER NUMBER WHICH YOU WANT TO DIVIDE WITH ARRAY : ");
			int number= sc.nextInt();
			
			try {
				System.out.println("The value of the index is : "+arr[index]);
				System.out.println("The answer after dividing : "+ arr[index]/number);
			}
			catch(ArithmeticException e) {			// checking for arithmetic exception
				System.out.println("Arithmetic Exception OCCURED !");
				System.out.println(e);
				break;
			}
			catch(ArrayIndexOutOfBoundsException e) {  // checking for array index number is out of bound or not 
				System.out.println("Array Index Out Of Bounds Exception OCCURED !");
				System.out.println(e);
				break;
			}
			catch(Exception e) {			// if any other exception occurred the following code will execute
				System.out.println("AN ERROR OCCURED !");
				System.out.println(e);
				break;
			}
		}
	}
}
