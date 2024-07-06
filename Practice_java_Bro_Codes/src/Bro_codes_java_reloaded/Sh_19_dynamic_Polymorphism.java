package Bro_codes_java_reloaded;

import java.util.Scanner;

class NewAnimal{
	public void speek() {
		System.out.println("every Animal says");	
	}
}
class NewDog extends NewAnimal{
	@Override
	public void speek() {
		System.out.println("Dog says *bark*");
		
	}
}
class NewCat extends NewAnimal{
	@Override
	public void speek() {
		System.out.println("Cat3 says *meow*");
		
	}
}


public class Sh_19_dynamic_Polymorphism {
	public static void main(String[] args) {
		

		// polymorphism = many shapes/ forms
		// dynamic = after compilation (during runtime)
		
		Scanner sc = new Scanner(System.in);
		NewAnimal newAnimal;
		
		System.out.println("what Animal3 do you want :");
		System.out.println("(1 : Dog  |  2 : Cat)");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			newAnimal = new NewDog();
			newAnimal.speek();
		}
		else if(choice == 2) {
			newAnimal = new NewCat();
			newAnimal.speek();
		}
		else {
			newAnimal = new NewAnimal();
			System.out.println("this choice is invalid  !!!");
			newAnimal.speek();
		}
	}
}
