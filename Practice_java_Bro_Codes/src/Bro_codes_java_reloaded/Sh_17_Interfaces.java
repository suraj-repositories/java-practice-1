package Bro_codes_java_reloaded;

interface Animals{
	void eating();
}
interface PetAnimals{
	void pet();
}

class Dogs implements Animals,PetAnimals{
	
	@Override				// this is an overrided method of interface
	public void eating() {
		System.out.println("Dog is eating the food.");
	}
	
	// this is not an Overrided method
	public void bark() {
		System.out.println("The dog is barking.");
	}
	
	@Override
	public void pet() {
		System.out.println("Dog is a pet animal.");
	}
}

public class Sh_17_Interfaces {
	public static void main(String[] args) {
		
//		Interfaces = a template that can be applied to a class
//					similar to inheritance , but specifies what the class has/must do
//					classes can apply more than 1 interface , inheritance is limited to one super
		
		Dogs dog = new Dogs();
		
		dog.eating();
		dog.bark();
		dog.pet();
	}
}
