package company_package;

interface Animal2{				// interface class are default abstract
	void sleep();				// all methods are also abstract
	void voice();				// does not have an constructor
	
	/* method with body is not allowed in interface but default,static methods can carry body*/
//	void goods() {
//		System.out.println("it is not allowed");
//	}
}

interface RunAnimal{			// creating another interface 
	void animalRun();
}
class Pig2 implements Animal2 , RunAnimal { 	// here we define more than one interface

	// here it is must to use implement all methods of interfaces 
	
	public void sleep() {
		System.out.println("Zzzzzz");
	}
	public void voice() {
		System.out.println("this is bzz bzz");
	}
	
	public void animalRun() {
		System.out.println("running");
	}
	
	public void eating() {
		System.out.println("animal is now eating the food");
	}
	
	// and you can also add extra methods here
}
public class Java_Practice_interfaces {
	public static void main(String[] args) {
		
		
		// creating an object with the name of child class 
		Pig2 p=new Pig2();			// we can not use name of interface to create object
		Animal2 a= new Pig2();		// we can use parent class as a reference and  create object of child class
		
		
		
		p.sleep();
		p.voice();
		p.animalRun();
		
		// we can use only the parent class methods
		a.sleep();
		a.voice();
		// a.animalRun();		// we cannot use the other class methods
		// a.eating();
		
	}
}
