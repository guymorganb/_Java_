package Functions;

import java.util.Scanner;

public class largestNumberinArray {

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++) {
			
			System.out.println("Enter element at index " + i);
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static int largest(int[] element) {
		int maxVal = Integer.MIN_VALUE;
		
		for(int i = 0; i < element.length; i++) {
			
			maxVal = (maxVal < element[i]) ? element[i] : maxVal;
			
		}
		return maxVal;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = takeInput();
		
		int lar = largest(array); 
		
		System.out.println(lar);

		
	}

}
