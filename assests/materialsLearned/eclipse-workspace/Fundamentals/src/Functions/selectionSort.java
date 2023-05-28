package Functions;
import java.util.Arrays;
public class selectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// the trick to sorting is to use the indexes, to compare the values, making to many stand in variable gets confusing
		int[] arr = {4, 11, 7, 4, 2, 6, 3, 4, 10, 9};
			
		int n = arr.length;
			
		for(int i = 0; i < n; i++) {
				
			int Val = arr[i];
			int minIndex = i;
				
				for(int j = i; j<n; j++) {
					
					if(Val > arr[j]) {
						Val = arr[j];
						minIndex = j;
					}
				}
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
						
			}System.out.println(Arrays.toString(arr));
	    }    

	}
