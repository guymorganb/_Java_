package Functions;

public class ArrayRotation {
		
	public static void printArray(int[] array) {
		int n = array.length;
		for(int i = 0; i < n; i++) {
			System.out.print(array[i]+ " ");
		}
	}
	
	public static int[] rotateArray(int[] array) {
		for(int i = 0, j = array.length-1; j >= (int) Math.floor((array.length/2)); i++, j--) {
			int temp = array[i];
			array[i]= array[j];
			array[j] = temp;
		}return array;
	}
	
	public static int[] rotateRight(int[] array, int Rotation) {
		Rotation = Rotation % array.length; // handles case where rotation is greater than array.length
		int j = array.length - 1;
		int k = array.length - (array.length - Rotation); // corrected
		for(int i = 0, m = Rotation-1; i < m; i++, m--) {
			int temp = array[m];
			array[m] = array[i];
			array[i] = temp;
			while(j > k) { // corrected
				int temp1 = array[j];
				array[j] = array[k];
				array[k] = temp1;
				j--;
				k++;
			}
		}return array;
	}
	// rotate left and rotate right are very similar except, rotate right takes the rotation factor from the front of the array 
	// rotate left takes the rotation factor from the back of the array
	public static int[] rotateLeft(int[] array, int Rotation) {
		Rotation = Rotation % array.length; // handles case where rotation is greater than array.length
		int j = 0;
		int k = array.length-(Rotation+1);
		for(int i = array.length-1, m = array.length - Rotation; i > m; i--, m++) {
			int temp = array[i];
			array[i] = array[m];
			array[m] = temp;
			while(j < k) {
				int temp1 = array[k];
				array[k] = array[j];
				array[j] = temp1;
				j++;
				k--;
			}
		}return array;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,5,3}; // length 8
		boolean rotateRight = false;
		int rotationFactor = 2;
		//printArray(arr);
		int [] rotated = rotateArray(arr);
		//printArray(rotated);
		if(rotateRight) {
			int[] rightShift = rotateRight(rotated, rotationFactor);
			printArray(rightShift);
		}else if(!rotateRight) {
			int [] leftShift = rotateLeft(rotated, rotationFactor);
			printArray(leftShift);
		}
	}

}
