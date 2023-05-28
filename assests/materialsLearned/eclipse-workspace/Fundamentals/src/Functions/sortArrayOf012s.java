package Functions;
import java.util.Arrays;
public class sortArrayOf012s {

	public static int[] sort012(int[] arr) {
		for(int i = 1; i<arr.length; i++) {
			int temp = arr[i];
			int j=i-1;
			while(j >= 0 && arr[j] > arr[j+1]) {
				arr[j+1] = arr[j];
				arr[j]= temp;
				j--;
			}
		}return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,1,1,0,1,0,0,1};
		
		int[] arr2 = sort012(arr);
		
		System.out.print(Arrays.toString(arr2));
	}

}
