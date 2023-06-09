package Functions;
import java.util.Arrays;
public class sumOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// integers are single digits
		int[] a = {1,3,5,4};
		int[] b = {2,1,3,5,9,6};
		int[] c = new int[a.length + b.length];
		
		int i = a.length - 1;
		int j= b.length -1;
		int k = (a.length > b.length) ? a.length : b.length;
		
		int carry = 0;
	
		while(i >= 0 && j >= 0) {
			int total = a[i] + b[j] +carry;
			c[k] = total % 10;
			carry = total/10;
			
			i-=1;
			j-=1;
			k-=1;
		
		}
		while(i >= 0) {
			int total = a[i] + carry;
			c[k] = total %10;
			carry = total/10;
			i-=1;
			k-=1;
		}
		while(j>=0) {
			int total = b[j] + carry;
			c[k] = total %10;
			carry = total/10;
			j-=1;
			k-=1;
		}
		c[0]=carry;
		System.out.print(Arrays.toString(c));
	}

}
