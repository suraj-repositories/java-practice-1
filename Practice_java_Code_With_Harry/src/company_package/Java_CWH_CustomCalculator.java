package company_package;
import java.util.Scanner;

@SuppressWarnings("serial")
class InvalidInputException extends Exception{
	public String toString() {
		return "INVALID INPUT...!";
	}
}
@SuppressWarnings("serial")
class InputGreaterThanLimit extends Exception{
	public String toString() {
		return "INPUT CAN NOT BE GREATER THAN 100000";
	}
}
@SuppressWarnings("serial")
class MultplierOutOfLimit extends Exception{
	public String toString() {
		return "MULTIPLIER CAN NOT BE GREATER THAN 7000";
	}
}
public class Java_CWH_CustomCalculator{
	
	public static void operationValidator(char operator) throws InvalidInputException{
		if(operator!='+' && operator!='-' && operator!='*' && operator!='/') {
			throw new InvalidInputException();
		}
	}
	public static void InputValidator(double first , double second)throws InputGreaterThanLimit{
		if(first>100000 || second >100000) {
			throw new InputGreaterThanLimit();
		}
	}
	
	public static double multiply(double first , double second) throws MultplierOutOfLimit{
		if(first>7000 || second > 7000) {
			throw new MultplierOutOfLimit();
		}
		return first * second;
	}

	 public static double division (double first,double second )throws ArithmeticException{
		 if(second==0.0f) {
			 throw new ArithmeticException("CAN NOT DEVIDE BY ZERO");
		 }
		return first/second; 
	 }
	
	
	
	public static void main(String[] args) {
		
		/* You have to create a custom calculator with following operations : 
		 * 1. + -> Addition
		 * 2. - -> Subtraction
		 * 3. * -> Multiplication
		 * 4. / -> Division
		 * which throws the following exceptions
		 * 1. Invalid input Exception ex - 8 & 9
		 * 2. Cannot divide by 0 Exception
		 * 3. Max Input Exception if any of the input is greater than 100000
		 * 4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
		 */
		
		while(true) {
			char oper;
			double result ,firstNum,secondNum;
			System.out.println("Choose from menu ----");
			System.out.println("1.'+'");
			System.out.println("2.'-'");
			System.out.println("3.'*'");
			System.out.println("4.'/'");
			
			@SuppressWarnings("resource")
			Scanner sc= new Scanner(System.in);
			oper =sc.nextLine().charAt(0);
			try {
				operationValidator(oper);
			}
			catch (Exception e) {
				System.out.println(e);
				System.out.println("please try again....");
				continue;
			}
			System.out.print("ENTER FIRST NUMBER : ");
			firstNum=sc.nextDouble();
			System.out.print("ENTER SECOND NUMBER : ");
			secondNum=sc.nextDouble();
			
			try {
				InputValidator(firstNum,secondNum);
			}
			catch(InputGreaterThanLimit e) {
				System.out.println(e);
				continue;
			}
			switch(oper) {
			case '+':
				result = firstNum + secondNum;
				System.out.println("Addition is : "+result);
				break;
			case '-':
				result =firstNum - secondNum;
				System.out.println("Substraction is : "+result);
				break;
			case '*': 
				try {
					System.out.println(multiply(firstNum,secondNum));
				}
				catch(MultplierOutOfLimit e) {
					System.out.println(e);
				}
				break;
			case '/':
				try {
					System.out.println(division(firstNum,secondNum));
				}
				catch(ArithmeticException e) {
					System.out.println(e);
				}
			}
			System.out.println("___________________________________________");
		}
		
	}
}