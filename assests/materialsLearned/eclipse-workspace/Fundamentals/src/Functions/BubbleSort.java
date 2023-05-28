package Functions;
import java.util.Arrays;
public class BubbleSort {
	public static void printArray(int[] arr) {
		int n = arr.length;
		for(int i = 0; i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

    public static int[] bubbleSort(int[] array){
        for(int i = 0; i< array.length-1; i++){
            for(int j = 0; j< array.length -1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
		return array;
    }
        public static void main(String[] args) {
        	
        	int[] arr = {4, 11, 7, 12, 2, 6, 3, 5, 10, 9};
    		bubbleSort(arr);
    		
    		printArray(arr);
    	
    			
        }
    }