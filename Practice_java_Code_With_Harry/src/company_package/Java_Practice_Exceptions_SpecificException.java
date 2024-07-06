package company_package;
import java.util.Scanner;

@SuppressWarnings("serial")
class MaxTriesReachedException extends Exception{
	@Override
	public String toString() {
		return "MaxTriesReachedException ";
	}
	@Override
	public String getMessage() {
		return "cause of exception is - you tries many time but you are wrong ";
	}
}

public class Java_Practice_Exceptions_SpecificException {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int password=12345 , input;
		
		for(int i=0;i<=5;i++) {
			try {
				if(i<5) {
					System.out.println("ETNER PASSWORD : ");
					input=sc.nextInt();
					if (input==password) {
						System.out.println("WELCOME");
						break;
					}
					else {
						System.out.println("INVALID Password");
					}
				}
				else {
					throw new MaxTriesReachedException();
				}
			}
			catch(MaxTriesReachedException e) {
				System.out.println(e);
				System.out.println("here we find an exception");
				System.out.println(e.getMessage());
				break;
			}
		}
		
		System.out.println("\n\ni hope it is useful");
	}
}
