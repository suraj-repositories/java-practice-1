package Bro_codes_java_reloaded;

class Vehicles{
	public void go() {
		
	}
}
class Boat extends Vehicles{
	@Override
	public void go() {
		System.out.println("The boat is moving");
	}
}
class Car1 extends Vehicles{
	@Override
	public void go() {
		System.out.println("The car is moving");
	}
}
class Bus extends Vehicles{
	@Override
	public void go() {
		System.out.println("The bus is moving");
	}
}

public class Sh_18_Polymorphism {
	public static void main(String[] args) {
		
		
		Boat boat = new Boat();
		Car1 cars = new Car1();
		Bus bus = new Bus();
		
//		boat.go();
//		cars.go();
//		bus.go();
		
		Vehicles [] racers = {boat,cars,bus};
//		Object [] racers = {boat,cars,bus};			// this will same as above
		
		// using enhanced for loop to access all methods
		for(Vehicles v : racers) {
			v.go();
		}
	}
}
