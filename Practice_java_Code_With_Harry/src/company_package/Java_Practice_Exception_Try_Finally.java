package company_package;

// when we use finally after try it is not necessary to use catch

import java.util.Scanner;
public class Java_Practice_Exception_Try_Finally {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int a;
		int b;
		System.out.print("ENTER FIRST NUMBER : ");
		a = sc.nextInt();
		System.out.print("ENTER SECOND NUMBER : ");
		b = sc.nextInt();
		
		// trying to execute the code 
		try {
			int c = a/b;
			System.out.println("\nResult after divide : "+ c);
		}
		// finally execute in every state exception or no-exception
		finally {
			System.out.println("THIS IS A FINALLY BLOCK OF CODE");
		}
		// when exception occur
		// this code will not execute because we not handled the exception
		System.out.println("this is waste , when exception occur");
	}
}
