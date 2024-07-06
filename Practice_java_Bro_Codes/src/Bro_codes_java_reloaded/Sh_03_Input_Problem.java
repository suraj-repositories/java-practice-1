package Bro_codes_java_reloaded;
// Important Question/ topic
import java.util.Scanner;


public class Sh_03_Input_Problem {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		
		System.out.println("What is your name : ");
		String name = sc.nextLine();
		
		System.out.println("How old are you : ");
		int age = sc.nextInt();
		
//		sc.nextLine();					// it not taking input
		System.out.println("What is your favourite food : ");
		String food = sc.nextLine();
		
		System.out.println();
		System.out.println("Hello " + name);
		System.out.println("Your age " + age + " years old");
		System.out.println("You like : "+ food);
		
		
	}
}
