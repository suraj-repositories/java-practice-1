package company_package;

interface sampleInterface{
	
	int x=423;			// you can declare variables in interface
	void method1();
	void method2();
	
	private void Greet() {
		System.out.println("GOOD MORNING");
	}
	// default method is available in related class
	default void newMethod() {
		Greet();
		System.out.println("this is a new method who applies in all classes directly");
	}
}

interface childInterface extends sampleInterface{
	void method3();
	void method4();
}

class exampleClass implements  childInterface{
	
//	int x=10;  		// overriding the field 
	public void method1() {
		System.out.println("METHOD 1");
		System.out.println(x);
	}
	public void method2() {
		System.out.println("METHOD 2");
	}
	public void method3() {
		System.out.println("METHOD 3");
	}
	public void method4() {
		System.out.println("METHOD 4");
	}
	
	// you can also override the default method of interface 
	// by overriding default method the new method will apply
//	public void newMethod() {
//		System.out.println("this is a overrided mehtod of default");
//	}
	
	
}
public class Java_practice_inheritence_Of_Interfaces {

	public static void main(String[] args) {
		
		exampleClass a=new exampleClass();
		
		a.method1();
		a.method2();
		a.method3();
		a.method4();
		
		a.newMethod();
	}
}
