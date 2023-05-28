package Functions;

import java.util.Scanner;
import java.util.Arrays;
public class arraySwapBetweenIndicies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// swap between user given indices (inclusive
		int[] arr = {2,5,8,5,9,0,1,3};
		Scanner s = new Scanner (System.in);
		System.out.print("Please enter a L index and R index between 0 and " + arr.length);
		int L = s.nextInt();
		int R = s.nextInt();
		// Alternatively you could use i < j instead of Math.floor()
		for(int i = L, j= R; i <= (int)Math.floor((L+R)/2); i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		System.out.print(Arrays.toString(arr));
	}

}
