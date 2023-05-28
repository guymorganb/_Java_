package Arrays;

import java.util.Scanner;

public class takingInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] userData = new int[n];
		
		// go to each element 1 by 
		for(int i = 0; i < n; i++) {
			System.out.println("Enter element at" + i + "th index");
			
			userData[i] = s.nextInt();
		}
		for(int i = 0; i < n; i++) {
			System.out.println(userData[i]);
		}
				
	}

}
