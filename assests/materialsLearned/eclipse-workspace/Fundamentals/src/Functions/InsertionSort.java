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
		int[] arr = {4, 11, 7, 12, 2, 6, 3, 5, 10, 9};
		insertionSort(arr);
		
		printArray(arr);
	}

}