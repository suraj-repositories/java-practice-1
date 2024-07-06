package Data_Structures_BroCodes;

import java.util.Arrays;

public class DS_13_InsertionSort {

	// Insertion sort : after comparing elements to the left 
	//					shift elements to the right to make room to insert a value
						
	//			Quadratic time O(n^2)
	//			small data set = decent 
	// 			large data set = BAD
	
	// 			less steps than bubble sort 
	// 			Best case is O(n) compared to Selection Sort O(n^2)
	
	public static void main(String[] args) {
	
		int array[] = {9, 1, 8, 2, 7, 3, 6, 5, 4};
		
		insertionSort(array);
		
		for(int i : array) {
			System.out.print(i+" ");
		}
		
	}

	private static void insertionSort(int[] array) {
		
		for(int i = 1 ; i < array.length;i++) {		// start with second index and go to number of elements
			int temp = array[i];					// add second elment in temp variable
			int j = i-1;							
			
			while(j >= 0 && array[j] > temp) {		
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = temp;
		}
		
	}

}
