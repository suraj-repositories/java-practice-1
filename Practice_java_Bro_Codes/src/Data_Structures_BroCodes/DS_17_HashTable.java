package Data_Structures_BroCodes;

import java.util.Hashtable;

/*	Hashtable = A data structure that stores unique keys to values ex. <Integer, String>
				Each key/value pair is known asa an Entry
				FAST insertion , look up, deletion of key/value pairs
				Not ideal for small data sets, great with large data sets
				
	hashing = takes a key and computes an integer(formula will vary based on key & data type)
			  In a Hashtable, we use the hash % capacity to calculate an index number
				  
				  key.hashCode() % capacity = index
				  
	bucket = an indexed storage location for one or more Entries
			can store multiple Entries in case of a collision (linked similarly a LinkedList)
					 
	collision = hash function generates the same index for more than one key
				less collision = more efficiency
				
	Runtime complexity : Best Case O(1)
						 Worst Case O(n)
*/					 
public class DS_17_HashTable {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> table = new Hashtable<>(10);

		table.put(100, "shubham");
		table.put(101, "suraj");
		table.put(103, "praveen");
		table.put(104, "saurabh");
		table.put(105, "tushar");
		
//		table.remove(103);
		
//		System.out.println(table.get(100));
		
		for(Integer key : table.keySet()) {
			System.out.println(table.get(key));
		}
		
//		Hashtable<String, String> table2 = new Hashtable<>(10);
//
//		table2.put("100", "shubham");
//		table2.put("101", "suraj");
//		table2.put("102", "praveen");
//		table2.put("103", "saurabh");
//		table2.put("104", "tushar");
//		
//		for(String key : table2.keySet()) {
//			System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table2.get(key));		// % capacity to find the index 
//		} 
	}

}
