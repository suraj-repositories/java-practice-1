package Bro_codes_java_reloaded;

class Car{
	
	String make = "Ford";
	String model = "Mustang";
	String color = "red";
	int year = 2021;
	
	public String toString() {
		return make+"\n"+model+"\n"+color+"\n"+year;
	}
}

public class Sh_11_toString_Method {
	public static void main(String[] args) {
		
		// toString() = special method that all objects inherit,
		// 				that returns a string that "textually represented" an object.
		// 				can be used both implicity and explicity
		
		Car car = new Car();
		
		// use this with commenting toString() method -> it will gives the memory where the data was stored
		System.out.println(car.toString());
		System.out.println();
		
		 System.out.println(car);				// this is also represent same thing
		
		
	}
}
