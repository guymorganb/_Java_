package Functions;

public class mergeTwoSortedArrays {
	
	public static void printArray(int[] arr) {
		int n = arr.length;
		for(int i = 0; i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static int[] mergeSorted(int[] arr1, int[] arr2) {
		int m = arr1.length;
		int n = arr2.length;
		int[] arr3 = new int[m+n];
		int i = 0;
		int j = 0;
		int k = 0;
		while(i < m && j < n) {
			if(arr1[i] <= arr2[j]) {
				arr3[k] = arr1[i];
				i++;
				k++;
			}else {
				arr3[k] = arr2[j];
				k++;
				j++;
			}
		}
		while(i < m) {
			arr3[k] = arr1[i];
			i++;
			k++;
		}
		while(j < n) {
			arr3[k] = arr2[j];
			j++;
			k++;
		}
		return arr3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {2, 4, 5, 7, 9, 10, 11, 15};
		int[] arr2 = {1, 2, 3, 6, 8, 10, 13};
		
		int[] arr3 = mergeSorted(arr1,arr2);
		printArray(arr3);
	}

}
