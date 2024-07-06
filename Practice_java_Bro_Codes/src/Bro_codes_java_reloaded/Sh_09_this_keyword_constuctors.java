package Bro_codes_java_reloaded;

 class Person{
	String name ;
	int age;
	double weight;
	// constructor
	Person(String name,int age,double weight){
		this.name= name;			// to see the difference try to remove this 
		this.age=age;
		this.weight=weight;
	}
	
	void eat() {
		System.out.println(this.name+" is eating");
	}
	
	void drink() {
		System.out.println(this.name+" is drinking");
	}
}

public class Sh_09_this_keyword_constuctors {
	public static void main(String[] args) {
		
		Person p1=new Person("shubham",21,60.23);
		System.out.println(p1.name);
		p1.eat();
		p1.drink();
		
		System.out.println("\n");
		// we also create another object with different parameters
		Person p2=new Person("suraj",21,60.23);
		System.out.println(p2.name);
		p2.eat();
		p2.drink();
	}
}
