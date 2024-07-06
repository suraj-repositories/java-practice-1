package Data_Structures_BroCodes;

public class DS_15_MergeSort {

	 			// O(n log n) = quasilinear time
				// 		* quickSort
				// 		* mergeSort
				// 		* heapSort
	
				// 	O(n) = linear space			---- It takes more memory 
				// 	* mergeSort 
	
				// faster tham bubble,selection,insertion Sort
	
	public static void main(String[] args) {

		int [] array = {9, 7, 5, 3, 1, 2, 4, 6, 8};
		
		mergeSort(array);
		
		for(int i : array) {
			System.out.print(i + " ");
		}

	}

	private static void mergeSort(int[] array) {
		int length = array.length;
		if(length <= 1) return;			// base case 
		
		int middle = length / 2;
		int[] leftArray = new int[middle];
		int[] rightArray = new int[length - middle];
		
		int i = 0;		// left array
		int j = 0;		// right array
		
		for (;i<length;i++) {
			if(i < middle) {
				leftArray[i] = array[i];
			}
			else {
				rightArray[j] = array[i];
				j++;
			}
		}
		mergeSort(leftArray);		// recursive case
		mergeSort(rightArray);
		merge(leftArray, rightArray, array);
		
	}
	private static void merge(int[] leftArray , int[] rightArray , int[] array) {
		
		int leftSize = array.length / 2;
		int rightSize = array.length - leftSize;
		int i = 0, l = 0, r = 0;		// indices
		
		// check the condition for mergeing
		while(l < leftSize && r < rightSize) {
			if(leftArray[l] < rightArray[r]) {
				array[i] = leftArray[l];
				i++;
				l++;
			}
			else {
				array[i] = rightArray[r];
				i++;
				r++;
			}
		}
		while(l < leftSize) {
			array[i] = leftArray[l];
			i++;
			l++;
		}
		while(r < rightSize) {
			array[i] = rightArray[r];
			i++;
			r++;
		}
		
		
		
	}

}
