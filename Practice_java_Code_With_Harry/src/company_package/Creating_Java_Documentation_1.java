package company_package;
/*
 * This is main class who carries many arithemaric functions
 * 
 * @author shubham kumar
 * @version 0.1
 * @since  2023
 * @see this is only the demonstratin not the real page of documentation 
*/
public class Creating_Java_Documentation_1 {

	/*
	 * this is a sum method to sum values
	 * 
	 * */
	public void sum(int a , int b) {
		System.out.println("The sum is : "+(a+b));
	}
	/*
	 * this is our main method , program starts to execute here
	 * 
	 * */
	public static void main(String[] args) {
	
		Creating_Java_Documentation_1 obj = new Creating_Java_Documentation_1();
		System.out.println("This is my main method--");
		obj.sum(23,23);
	}
}
