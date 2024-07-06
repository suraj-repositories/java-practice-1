package company_package;
import java.util.HashSet;

// for more detail go to jdk documentation
// it add element in the location of  value % initial capacity

public class Java_Practice_Hashset_methods {

	public static void main(String[] args) {
		System.out.println("--HASH SET--");
		
		HashSet<String> hs1 = new HashSet<> ();		// create a hash-set with default capacity 16 and load-factor 0.75
		// HashSet<Integer> hs1 = new HashSet<> (23);		// create a hash-set with needed capacity  and load-factor 0.75
		// HashSet<Integer> hs1 = new HashSet<> (26,0.50f);// create a hash-set with needed capacity and needed capacity load-factor 
		
		hs1.add("shubham");		// add value in hash-set
		hs1.add("kumar");
		hs1.add("maurya");
		hs1.add("time"); 
		
	
		
		// hs1.clear(); 		// delete all elements
		// hs1.clone();			// it return a copy of hash set
		// System.out.print(hs1.clone());	// surprising
		
		// System.out.println(hs1.contains("kumar")); // if match found it returns true otherwise false
		// System.out.println(hs1.isEmpty()); 			// if hash set is empty it returns true otherwise false
		// System.out.println(hs1.iterator());
		
		// hs1.remove("kumar");  			// it removes the given element to the hash set
		// System.out.println(hs1.size());	// returns the size of hash-set
		// System.out.println(hs1.spliterator());
		
		System.out.println(hs1);
		
	}
}
