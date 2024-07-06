package Start_Advance;
/* 	
 * generics =  enables types (classes and interfaces) to be parameters when defining:
				classes, interfaces and methods
				a banefit is fo eliminate the need to create multiple versions
				of methods or classes for various data types.
				Use 1 version for all refernce data types		
*/

 class SingleGenricHolder<T>{
	T obj;
	
	SingleGenricHolder(T obj){
		this.obj = obj;
	}
	
	public T getObject() {
		return this.obj;
	}
}

public class Ad_10_Generics_single {
	public static void main(String[] args) {
		
		SingleGenricHolder<Integer> myObj = new SingleGenricHolder<Integer>(10);
		System.out.println(myObj.getObject());
		
		SingleGenricHolder<String> myObj2 = new SingleGenricHolder<String>("shubham kumar");
		System.out.println(myObj2.getObject());
		
	}
}
