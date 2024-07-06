package Data_Structures_BroCodes;

import java.util.ArrayList;
import java.util.LinkedList;

public class DS_06_LinkedList_VS_ArrayList {
	public static void main(String[] args) {
		
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		long startTime;
		long endTime;
		long elapsedTime;
		
		for(int i= 0 ;i< 1000000 ;i++) {
			linkedList.add(i);
			arrayList.add(i);
		}
		
		//******************** LINKED LIST **********************
		startTime = System.nanoTime();
	
//		linkedList.get(0);			// first index
//		linkedList.get(500000);		// middle index
//		linkedList.get(999999);		// last index 
		
		linkedList.remove(0);
//		linkedList.remove(500000);
//		linkedList.remove(999999);
		
		endTime = System.nanoTime();
		
		elapsedTime = endTime - startTime;
		
		System.out.println("LinkedList : \t"+ elapsedTime +" ns");
		
		//******************** ARRAY LIST **********************
		startTime = System.nanoTime();
		
//		arrayList.get(0);		// first index
//		arrayList.get(500000);	// middle index
//		arrayList.get(999999);	// last index 
		
		arrayList.remove(0);
//		arrayList.remove(500000);
//		arrayList.remove(999999);
		
		endTime = System.nanoTime();
		
		elapsedTime = endTime - startTime;
		
		System.out.println("ArrayList : \t"+ elapsedTime +" ns");
	}
}
