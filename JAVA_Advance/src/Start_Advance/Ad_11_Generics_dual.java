package Start_Advance;

class DualGenericHolder<T, U>{
	T obj1;
	U obj2;
	
	DualGenericHolder(T obj1 , U obj2){
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	public void display() {
		System.out.println(obj1);
		System.out.println(obj2);
	}
	
}

public class Ad_11_Generics_dual {

	public static void main(String[] args) {
		
		DualGenericHolder<Integer, String> myObj1 = new DualGenericHolder<Integer, String>(101, "shubham");
		myObj1.display();
		
		
		
	}

}
