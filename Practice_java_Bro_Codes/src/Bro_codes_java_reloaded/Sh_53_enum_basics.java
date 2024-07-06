package Bro_codes_java_reloaded;

enum Planet{
	MERCURY(1),
	VENUS(2),
	EARTH(3),
	MARS(4),
	JUPITER(5),
	SATURN(6),
	URANUS(7),
	NEPTUNE(8),
	PLUTO(9);

	int number;
	
	Planet(int number) {
		this.number = number;
	}
}

public class Sh_53_enum_basics {
	public static void main(String[] args) {
		
		// enum = enumerated (ordered listing of items in a collection)
		// grouping of constants that behave similarly to objects
		
		Planet myPlanet = Planet.EARTH;
		canILiveHere(myPlanet);
	
	}
	
	 static void canILiveHere(Planet myPlanet){
		
		 switch(myPlanet) {
		 	case EARTH:
		 		System.out.println("you can live here :)");
		 		System.out.println("Planet #" + myPlanet.number);
		 		break;
		 	default : 
		 		System.out.println("you can not live here yet");
		 		System.out.println("Planet #" + myPlanet.number);
		 		break;}
		 
	}
}
