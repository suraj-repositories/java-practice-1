package company_package;


//parent class
abstract class animal{ 						// a class who contains abstract method called abstract class 
	public void janvar() {
		System.out.println("this is a janvar method ");
	}
	public	abstract void eating();       	// abstract method -> an abstract method don't have body
}

// child class using inheritance
// it is required to use abstract method with the body in this method or you can also make this class abstract class
class dog extends animal{
	public void eating() {
		System.out.println("dog is eating food");
	}
}
// another child class using inheritance
class cat extends animal{
	public void eating() {
		System.out.println("cat is eating food ");
		
	}
}
public class Java_practice_abstraction_Inharitance {
	public static void main(String[] args) {
		
		animal a=new dog();			// creating object  ! we do not create abstract class object
		// animal dg=new animal();		// throw error 
		// dog() d= new animal(); 		// it is not allowed
		animal b=new cat();
		
		a.eating();
		a.janvar();
		b.eating();
		b.janvar();
		
		
		dog d=new dog();          //we can creating reference of child class and accessing method of parent class
		d.eating();
		d.janvar();
	}
}
