package Functions;

import java.util.Scanner;

public class linearSearch {
    // takes user input//////////////////////////////////////////////
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
	// completes a linear search//////////////////////////////////////
	public static int linearSearch(int arr[], int x) {
		//Your code goes here
	    for(int i = 0; i < arr.length; i++){
	      if (arr[i] == x){
	        return i;
	      }
	      else{
	        continue;
	      }
	    }
    return -1;
    }
////////////////////////////////////////////////////////
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = takeInput();
		
		int searchResult = linearSearch(array, 6); 
		
		System.out.println(searchResult);
	}

}
