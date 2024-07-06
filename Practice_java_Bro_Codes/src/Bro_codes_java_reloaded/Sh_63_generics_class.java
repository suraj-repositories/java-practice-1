package Bro_codes_java_reloaded;

class MyGenericsClass <Thing> {
	Thing x;
	MyGenericsClass(Thing x){
		this.x = x;
	}
	
	public Thing getValue() {
		return x;
	}
}

/* INSTEAD OF CREATING MANY CLASSES WE CAN CREATE A GENERICS CLASS  */

//class MyIntegerClass{
//	Integer x;
//	MyIntegerClass(Integer x){
//		this.x=x;
//	}
//	public Integer getValue() {
//		return x;
//	}
//}
//class MyDoubleClass{
//	Double x;
//	MyDoubleClass(Double x){
//		this.x = x;
//	}
//	public Double getValue() {
//		return x;
//	}
//}
//class MyCharacterClass{
//	Character x;
//	MyCharacterClass(Character x){
//		this.x = x;
//	}
//	public Character getValue() {
//		return x;
//	}
//}
//class MyStringClass{
//	String x;
//	MyStringClass(String x){	
//		this.x=x;
//	}
//	public String getValue() {
//		return x;
//	}
//}
public class Sh_63_generics_class {
	public static void main(String[] args) {
	
		MyGenericsClass<Integer> myInt = new MyGenericsClass<>(1);
		MyGenericsClass<Double> myDouble = new MyGenericsClass<>(3.14);
		MyGenericsClass<Character> myChar = new MyGenericsClass<>('@');
		MyGenericsClass<String> myString = new MyGenericsClass<>("hello");
		
		System.out.println(myInt.getValue());
		System.out.println(myDouble.getValue());
		System.out.println(myChar.getValue());
		System.out.println(myString.getValue());
		
	}

}
