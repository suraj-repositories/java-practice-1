package company_package;

public class Java_practice_Exception_finally_preview {
	
	public static int greet() {
		try {
			int a=1000;
			int b=5;
			int c=a/b;
			return c;	
					// if any exception not occurred the value of c return 
					// but first the program execute the finally block then terminate the program
		} 
		catch(Exception e) {
			System.out.println("An exception occurred : "+e);
		}
		
		finally {
			System.out.println("this finally execute in every condition");
		}
		return 0;
	}
	
	public static void main(String [] args) {
		int a=greet();
		System.out.println(a);
	}
}