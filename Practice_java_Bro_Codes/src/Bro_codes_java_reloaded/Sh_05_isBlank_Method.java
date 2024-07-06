package Bro_codes_java_reloaded;

import java.util.Scanner;

public class Sh_05_isBlank_Method {
		public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String name = " ";
		
		while(name.isBlank()){
			System.out.print("enter your name :");
			name = sc.nextLine();
		}
		System.out.println("hello "+name);

	}

}