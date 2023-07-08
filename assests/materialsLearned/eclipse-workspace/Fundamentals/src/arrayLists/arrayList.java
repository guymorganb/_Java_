package arrayLists;

import java.util.ArrayList;

// array list create a dynamic array
public class arrayList {

	// remove consecutive duplicates from array
	public static ArrayList<Integer> removeConsecutiveDuplicates(int arr[]){
		ArrayList<Integer> result = new ArrayList<>();
		result.add(arr[0]);
		for(int i = 1; i < arr.length; i ++) {
			if(arr[i] != arr[i - 1]) {
				result.add(arr[i]);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(1, 80);	// will add 80 at index 1, and shift remaining elements
		arr.remove(2);	// removes index 2
		System.out.println(arr.size());
		System.out.println(arr.get(2));	// get the element at index 2
		
		// print all indices
		for(int i = 0; i < arr.size(); i++) {		// i is just an index
			System.out.println(arr.get(i));
		}
		
		// enhanced follow (for each loop)
		for(int i : arr) {			// i holds the value of the array list element
			System.out.println(i);
		}
		
		int[] arr1 = {10,10,20,20,30,40,40,50,10};
		
		ArrayList <Integer> result = removeConsecutiveDuplicates(arr1);
		
		for(int i : result) {
			System.out.println(i);
		}
		
	}

}
