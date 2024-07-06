package Bro_codes_java_reloaded;

import java.util.ArrayList;
import java.util.HashMap;

class MyGenericsClass2 <Thing, Thing2> {
	Thing x;
	Thing2 y;
	MyGenericsClass2(Thing x,Thing2 y){
		this.x = x;
		this.y = y;
	}
	
	public Thing2 getValue() {
		return y;
	}
}
/* BOUNDED TYPES */
class MyGenericsClass3 <Thing extends Number, Thing2> {
	Thing x;
	Thing2 y;
	MyGenericsClass3(Thing x,Thing2 y){
		this.x = x;
		this.y = y;
	}
	
	public Thing2 getValue() {
		return y;
	}
}

public class Sh_64_generics_classes_2 {
	public static void main(String[] args) {
		MyGenericsClass2<Integer,Integer> myInt = new MyGenericsClass2<>(1,9);
		MyGenericsClass2<Double,Double> myDouble = new MyGenericsClass2<>(3.14,10.2);
		MyGenericsClass2<Character,Character> myChar = new MyGenericsClass2<>('@','#');
		MyGenericsClass2<String,Character> myString = new MyGenericsClass2<>("hello",'#');
		
//		ArrayList<Integer> friends = new ArrayList<>();
//		HashMap<Integer,String> users = new HashMap<>();
		
		System.out.println(myInt.getValue());
		System.out.println(myDouble.getValue());
		System.out.println(myChar.getValue());
		System.out.println(myString.getValue());
		
		// bounded types = you can create the objects of a genterics class to have data 
		//				specific derived types ex- Number
		
		MyGenericsClass3<Integer,Integer> myInt2 = new MyGenericsClass3<>(1,9);
		MyGenericsClass3<Double,Double> myDouble2 = new MyGenericsClass3<>(3.14,10.2);
		// they are not allowed
//		MyGenericsClass3<Character,Character> myChar2 = new MyGenericsClass3<>('@','#');
//		MyGenericsClass3<String,Character> myString2 = new MyGenericsClass3<>("hello",'#');
		
		System.out.println(myInt2.getValue());
		System.out.println(myDouble2.getValue());
	}
}