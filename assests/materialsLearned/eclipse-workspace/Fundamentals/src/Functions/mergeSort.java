package Functions;

public class mergeSort {
	public static int[] split(int[] arr, int start, int end) {
		int middleIndex = (start + end)/2;
		int [] arr1 = new int[middleIndex];
		int [] arr2 = new int[end-arr1.length];
				
		for(int i = start, j = 0; i < end; i++) {
			if(i < middleIndex) {
				arr1[i]=arr[i];
			}else {
				arr2[j]=arr[i];
				j++;
			}
		}
//		for (int element : arr1) {
//	          System.out.println("arr1: " + element);
//	      }
//		for (int element : arr2) {
//	          System.out.println("arr2: " + element);
//	      }
		int[] sortedArr1 = insertionSort(arr1);
		int[] sortedArr2 = insertionSort(arr2);
		return merge2SortedArrays(sortedArr1, sortedArr2);
	}
		
	public static int[] insertionSort(int[] arr) {
		
		for(int i = 1; i<arr.length; i++) {
			// insert the i'th element in the sorted array
			int j = i-1;
			int temp = arr[i];
			
			while(j >= 0 && arr[j] > temp) {
				arr[j+1] = arr[j]; // shifts the elements to the right
				j--;
			}
			
			arr[j+1]=temp;
		}
//		for (int element : arr) {
//	          System.out.println("arr: " + element);
//	      }
		return arr;
	}
	
	public static int[] merge2SortedArrays(int[] arr1, int[] arr2) {
		int[] sortedArray = new int[arr1.length + arr2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while(i < arr1.length && j < arr2.length) {
			if(arr1[i] <= arr2[j]) {
				sortedArray[k] = arr1[i];
				i++;
				k++;
			}else {
				sortedArray[k] = arr2[j];
				k++;
				j++;
			}
		}
		while(i < arr1.length) {
			sortedArray[k] = arr1[i];
			i++;
			k++;
		}
		while(j < arr2.length) {
			sortedArray[k] = arr2[j];
			j++;
			k++;
		}
//		for (int element : sortedArray) {
//	          System.out.println("arr: " + element);
//	      }
		return sortedArray;
	}
	
	public static void main(String[] args) {
		// breaks 1 array into 2 halves, sorts each half, and merges them back together sorted
		int[] array = {90, 31, 94, 80, 46, 28, 48, 31, 28, 90, 9, 27, 81, 43, 94, 5, 56, 13, 1, 23, 85, 71, 93, 53, 82 };
	
		int[] sorted = split(array, 0, array.length);
		for (int element : sorted) {
        System.out.println("arr: " + element);
    }
	}

}
