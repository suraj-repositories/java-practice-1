package Data_Structures_BroCodes;

import java.util.Arrays;

public class DS_09_BinarySearch {

	public static void main(String[] args) {
		
		// Binary search : Search algorithm that finds the position of a target value within a sorted array.
		//				   Half of array is eliminated during each "step"
		
	// INBUILD METHOD TO PERFORM BINARY SEARCH ----------------------------------------------	
		
//		int array[] = new int[100];
//		int target = 42;
//		
//		for(int i=0;i < array.length; i++) {			// just giving values to the array
//			array[i] = i;
//		}
//		
//		int index = Arrays.binarySearch(array, target);		// two values required array | value_what we want to find  -
//		
//		if(index == -1) {
//			System.out.println(target + " not found");
//		}
//		else {
//			System.out.println("Element found at: "+ index);
//		}
		
		
		// MY METHOD TO PERFORM BINARY SEARCH ----------------------------------------------	

		int array[] = new int[100];
		int target = 42;
		
		for(int i=0;i < array.length; i++) {			// just giving values to the array
			array[i] = i;
		}
		
		int index = binarySearch(array, target);	// custom mehod
		
		if(index == -1) {
			System.out.println(target + " not found");
		}
		else {
			System.out.println("Element found at: "+ index);
		}
		
	}

	private static int binarySearch(int[] array, int target) {
		
		int low = 0;
		int high = array.length - 1;
		
		while(low <= high) {
			
			int middle = low + (high - low) / 2;
			int value = array[middle];
			
			System.out.println("middle : " + value);
			
			if(value < target) low = middle + 1;
			else if(value > target) high = middle -1;
			else return middle;		// target found
		}
	
		return -1;     // target not found
	}

}
