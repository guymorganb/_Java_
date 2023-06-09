package Arrays;

public class declareArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int name[] = new int[10];
		// this is an array that holds type 'int' called 'name', which gets enough continuous 
		// memory to hold 10 integers, (40bytes)
		int[] name2 = new int[10];
		// can also be written like this
		// by default empty values are assigned to 0
		// assign values
		name[0] = 5;
		name[5] = 10;
		// negative indexing doesn't exist
		
		char[] cArray = new char[10];
		double[] dArray = new double[10];
		
		System.out.println(cArray[1]);	// prints nothing (equivalent to null) default unassigned values are null
		System.out.println(dArray[3]);	// prints 0.0 for double, for type long prints 0 for unassigned values
	
		boolean arr[] = new boolean[5];	// boolean arrays have false as initial values
		System.out.println(arr[3]);
	}

}
