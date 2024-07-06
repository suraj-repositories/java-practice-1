package company_package;


interface Person{
	public void meth1();
	public void meth2();
}

// you can avoid these line of code

//class Neeraj implements Person{
//	public void meth1(){
//		System.out.println("This is method 1");
//	}
//public void meth2() {
//	System.out.println("This is method 2");
//}
//}

public class Java_Practice_anonymosClass {
	public static void main(String[] args) {
		
//		Neeraj n= new Neeraj();
//		n.meth1();
		
		// here we are creating object with the class by using anonymous class
		Person obj = new Person() {		// we can use anonymous class rather than making class
			public void meth1() {
				System.out.println(" ---- This is method 1 ---- ");
			}
			public void meth2() {
				System.out.println("This is method 2");
			}
		};
		obj.meth1();
		obj.meth2();
	}
}