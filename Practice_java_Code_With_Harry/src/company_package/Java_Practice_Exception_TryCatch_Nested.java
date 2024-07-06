package company_package;
import java.util.*;
public class Java_Practice_Exception_TryCatch_Nested {
	public static void main(String[] args) {
		
		int [] array=new int[3];
		array[0]=23;
		array[1]=65;
		array[2]=87;
		
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		boolean temp=true;
		while(temp) {
			System.out.println("Enter array index number : ");
			int index = sc.nextInt();
			try {
				System.out.println("TESTING--");
				try {
					System.out.println("The value of the array index : "+array[index]);
					temp=false;
				}
				catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("Array Index Out Of Bound Exception Occurred.....!");
				}
			}
			catch(Exception e) {
				System.out.println("ANY EXCEPTION OCCURRED : "+e);
			}
		}
		System.out.println("THANKS FOR USING THE PROGRAM");
	}
}
