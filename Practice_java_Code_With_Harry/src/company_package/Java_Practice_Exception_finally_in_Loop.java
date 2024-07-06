package company_package;

public class Java_Practice_Exception_finally_in_Loop {
	public static void main(String[] args) {
		
		int a=24;
		int b=5;
		while (true) {
			try {
				System.out.println("Result is : "+a/b);
			}
			catch(Exception e) {
				System.out.println(e+" divided by 0");
				break; //finally is execute after break it is mandatory to execute finally
			}
			finally {
				System.out.println("THE VALUE OF B IS : "+b); // it will execute when break trying to terminate the loop
			}
			b--;
		}
	}
}
