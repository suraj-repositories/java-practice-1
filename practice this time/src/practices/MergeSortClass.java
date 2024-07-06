package practices;

public class MergeSortClass {

	public static void main(String[] args) {

		int[] array = {2,1,4,3,6,5,8,7,9};
		
		mergeSort(array);
		
		for(int i : array) {
			System.out.print(i+ " ");
		}
	}

	private static void mergeSort(int[] array) {
		
		if(array.length <= 1) return;
		
		int leftSize = array.length/2;
		int rightSize = array.length - leftSize;
		
		int[] leftArray = new int[leftSize];
		int[] rightArray = new int[rightSize];
		
		int i = 0;
		
		
		while(i < leftSize) {
			leftArray[i] = array[i];
			i++;
		}
		int j = leftSize;
		int k = 0 ; 
		while(j < array.length) {
			rightArray[k] = array[j];
			j++;
			k++;
		}
		
//		for(int ito : leftArray) {
//			System.out.print(ito+ "! ");
//		}
//		System.out.println();
//		System.out.println("printing line");

		mergeSort(leftArray);
		mergeSort(rightArray);
		merge(leftArray, rightArray,array);
		
		
	}

	private static void merge(int[] leftArray, int[] rightArray, int[] array) {
		
		int leftSize = array.length / 2;
		int rightSize = array.length - leftSize;
		
		int l = 0 , r = 0 , mA = 0;
		
		while ( l < leftSize && r < rightSize) {
			if(leftArray[l] < rightArray[r]) {
				array[mA] = leftArray[l];
				mA++;
				l++;
			}
			else {
				array[mA] = rightArray[r];
				mA++;
				r++;
			}
		}
		while(l < leftSize) {
			array[mA] = leftArray[l];
			mA++;
			l++;
		}
		while( r < rightSize) {
			array[mA] = rightArray[r];
			mA++;
			r++;
			
		}
	
		
	}

}
