package company_package;
// throw = it is used to throw an exception
// throws = it is used to tell the user this exception may possible please be ready to handle this exception

@SuppressWarnings("serial")
class NegativeRadiusException extends Exception{	// this is a user defined exception with the help of extending exception class
//	public String toString() {						// if we uncomment this , it is invoke automatically by 'e'
//		return "here negative radius exception found";
//	}
	public String getMessage() {
		return "here negative radius exception found 1";
	}
}

public class Java_Practice_Exception_throw_throws {
	
	// it may throw arithmetic exception to handle this you need to surround your code in try-catch block
	public static int divide(int num1 ,int num2) throws ArithmeticException{
		int divide = num1 / num2 ;
		return divide;
	}
	public static double area(int r) throws NegativeRadiusException {
		if(r<0) {
				throw new NegativeRadiusException();
		}
		return  Math.PI * r * r ;	
	}
	
	public static void main(String[] args) {
		
		// if you want to use the divide method you need to resolve the exception by using try catch 
//		try {
//			int d=divide(3,0);
//			System.out.println(d);
//		}
//		catch(Exception e) {
//			System.out.println("Divided by zero ");
//			System.out.println("this is an exception");
//		}
		
		// if I want to use area method I need to resolve the exception
		try {
			double ar=area(-654);
			System.out.println(ar);
		}
		catch(Exception e) {
			System.out.println(e.getMessage()); // here we are using getMassege to use only the instance message
		}
	}
}