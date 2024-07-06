package Bro_codes_java_reloaded;

class Cars{
	String name;
	Cars(String name){
		this.name = name;
//		System.out.println("this is a constructor");		// what happen when we apply the print line statement
	}
}
class Garage{
	
	void park(Cars cars) {
		System.out.println("The "+cars.name+" is parked in garage");
	}
}

public class Sh_13_Pass_objectsAsArguments {
	public static void main(String[] args) {
	
		Cars cars1 = new Cars("BMW");
		Cars cars2 = new Cars("Tesla");
		
		Garage garage = new Garage();
		garage.park(cars1);
		garage.park(cars2);
	}
}
