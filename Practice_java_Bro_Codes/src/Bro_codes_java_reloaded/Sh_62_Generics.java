package Bro_codes_java_reloaded;

public class Sh_62_Generics {
	public static void main(String[] args) {
		
		/* 	generics =  enables types (classes and interfaces) to be parameters when defining:
						classes, interfaces and methods
						a banefit is fo eliminate the need to create multiple versions
						of methods or classes for various data types.
						Use 1 version for all refernce data types		
		*/		
		
		Integer[] intArray = {1, 2, 3, 4, 5};
		Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};
		Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
		String[] stringArray = {"B", "Y", "E"};
		
		displayArray(intArray);
		displayArray(doubleArray);
		displayArray(charArray);
		displayArray(stringArray);
		
//		System.out.println(getFirstElement(intArray));
//		System.out.println(getFirstElement(doubleArray));
//		System.out.println(getFirstElement(charArray));
//		System.out.println(getFirstElement(stringArray));
		
		
	}

	/* WE DO NOT NEED TO WRITE THIS MANY MORE TIMES FOR DIFFERENT DATATYPES */
	
//	public static void displayArray(Integer[] array) {
//		for(Integer x :array) {
//			System.out.print(x + " ");
//		}
//		System.out.println();
//	}
//	public static void displayArray(Double[] array) {					
//		for(Double x :array) {
//			System.out.print(x + " ");
//		}
//		System.out.println();
//	}
//	public static void displayArray(Character[] array) {
//		for(Character x :array) {
//			System.out.print(x + " ");
//		}
//		System.out.println();
//	}
//	public static void displayArray(String[] array) {
//		for(String x :array) {
//			System.out.print(x + " ");
//		}
//		System.out.println();
//	}
	
	public static <T> void displayArray(T[] array) {			// T is things --- this is a shorter way to do this
		for(T x :array) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	
	public static <T> T getFirstElement(T[] array) {
		return array[0];
	}
}
