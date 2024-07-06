package Bro_codes_java_reloaded;

@FunctionalInterface			// functional interfaces have only one abstract method
interface MyInterface{
	
	public void message(String name,char symbol);
	
}

public class Sh_60_Lambda {
	public static void main(String[] args) {
		
		/*	Lambda expression =   feature for java 8 and above
							  	also known as an anonymous method
							  	a shorter way to write anonymous classes with only one method
							  
							  	need to use a functional interface or use a pre-defined functional interface
							  	they contains only one abstract method
							  	ex- ActionListener , Runnable, (user-defined)
							  
							  	A lambda expression can be used in any place where a functional interface
							  	How to use a lambda expression:
							  		(arguments) -> {statements/s}
		*/
		
		String name = "Shubham";
		char symbol = '!';
		
		MyInterface myInterface = (x,y) -> {
			System.out.println("hello world");
			System.out.println("It is a nice day "+ x + y);

		};
		MyInterface myInterface2 = (x,y) -> {
			System.out.println("hello "+x+y);
		};

		myInterface.message(name, symbol);
		myInterface2.message(name, symbol);
	}
}
