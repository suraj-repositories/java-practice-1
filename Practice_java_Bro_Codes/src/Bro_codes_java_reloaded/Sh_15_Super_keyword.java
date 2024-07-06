package Bro_codes_java_reloaded;

class Person1{
	
	String name ;
	int age;
	
	Person1(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public String toString() {
		return this.name+"\n"+this.age;
	}
}


class Hero extends Person1{
	
	String power;
	
	Hero(String name ,int age ,String power){
//		this.name=name;
//		this.age=age;
		
		// here using this we have a better way to do this by using supwer keyword
		
		super(name,age);
		this.power=power;
	}
	
	public String toString() {
		return super.toString()+"\n"+this.power;
	}
	
}

public class Sh_15_Super_keyword {
	public static void main(String[] args) {
		
//		super = keywords refers to the superclass (parent) of an object
//				very similar to the "this" keyword
		
		Hero hero1 = new Hero("Batman",42,"$$$");
		Hero hero2 = new Hero("Superman",42,"everything");
		
//		System.out.println(hero1.name);
//		System.out.println(hero1.age);
//		System.out.println(hero1.power);
		
		
		System.out.println(hero2.toString());
	}
}
