package company_package;
import java.util.*;

public class Java_Practice_Arraylist_someBasicMethods {
	public static void main(String[] args) {
		System.out.println("Using Arraylist Methods");
		// 2 methods
//		ArrayList<Integer> l1 = new ArrayList<>();
//		l1.add(10);  		// add method to add element in any specific location in ArrayList
//		l1.add(11);
//		l1.add(21);
//		l1.add(11);
//		l1.add(45);
//		
//		for(int i=0;i<l1.size();i++) {
//			System.out.println(l1.get(i)); 			// get method to get an element from arrayList
//		}
		
		// add on specific position 
//		ArrayList<Integer> l2 = new ArrayList<>();
//		l2.add(78);
//		l2.add(56);
//		l2.add(12);
//		l2.add(0,45);  		// add element in any specific index 
//		l2.add(0,25);		// if we add any number in the same index it will add before earlier element
//		l2.add(56);
//		for(int i=0;i<l2.size();i++) {
//			System.out.println(l2.get(i)); 			// get method to get an element from arrayList
//		}
		
		
		// add two ArrayList
//		ArrayList<Integer> l1= new ArrayList<>();
//		ArrayList<Integer> l2= new ArrayList<>();
//		l1.add(89);
//		l1.add(98);
//		l1.add(23);
//		
//		l2.add(2);
//		l2.add(0);
//		l2.add(4);
//		
//		l1.addAll(l2);  // it will add the list-2 in the last of list-1
//		// l1.addAll(0, l2);  // you can also add list to your wanted location 
//		
//		// l1.clear();			// to remove all elements of array-list
//		
//		
//		for(int i=0;i<l1.size();i++) {
//			System.out.print(l1.get(i));
//			System.out.print(", ");
//		}
		
		
		// some more methods
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(10);  		
		l1.add(11);
		l1.add(21);
		l1.add(11);
		l1.add(45);
		
		System.out.println(l1.contains(10));		// it returns true if value is available in array-list
		System.out.println(l1.contains(654654));	// it returns false if value is not available in array-list
		
		
		System.out.println(l1.indexOf(10));		// it returns the index of value
		System.out.println(l1.indexOf(11));		// if an element is available in two or more places it return location of begining element
		System.out.println(l1.lastIndexOf(11));	// last given element index
		System.out.println(l1.lastIndexOf(14651)); // it return -1 if element is not available
		
		// set any element in any random location
//		ArrayList<Integer> l1 = new ArrayList<>();
//		l1.add(10);  		
//		l1.add(11);
//		l1.add(21);
//		l1.add(11);
//		l1.add(45);
//		
//		
//		l1.set(1, 120);  // we can set any element in any random location _- previous element was deleted
		
	}
}
