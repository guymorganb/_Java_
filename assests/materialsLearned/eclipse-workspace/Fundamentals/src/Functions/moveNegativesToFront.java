package Functions;
import java.util.Arrays;
public class moveNegativesToFront {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2, 4, -5, 7, -9, 10, -11, -5};  
		
		for(int i= 0, j=0; i < a.length; i++){
	            if(a[i] < 0){
	                int temp = a[j];
	                a[j] = a[i];
	                a[i] = temp;
	                j++;
	            }
	        }System.out.println(Arrays.toString(a));
	}

}
