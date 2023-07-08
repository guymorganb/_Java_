package Functions;

public class InsertionSort {
	
	public static void printArray(int[] arr) {
		int n = arr.length;
		for(int i = 0; i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void insertionSort(int[] array) {
		
		for(int i=1; i<array.length; i++) {
			// insert the i'th element in the sorted array
			int j = i-1;
			int temp = array[i];
			
			while(j >= 0 && array[j] > temp) {
				array[j+1] = array[j]; // shifts the elements to the right
				j--;
			}
			
			array[j+1]=temp;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {90, 31, 94, 80, 46, 28, 48, 31, 28, 90, 9, 27, 81, 43, 94, 5, 56, 13, 1, 23, 85, 71, 93, 53, 82 };
		insertionSort(arr);
		
		printArray(arr);
	}

}
