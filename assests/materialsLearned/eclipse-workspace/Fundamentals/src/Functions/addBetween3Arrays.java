package Functions;
import java.util.Arrays;
public class addBetween3Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/// Array out of bounds needs to be fixed
		
		int n = 6; 
		
		int x = 16;
		
		int[] p1 = {8, 1, 2, 3, 2, 5}; 
		
		int[] p2 = {9, 5, 6, 7, 7, 6}; 
		
		int[] f = new int[n];
		int R = 0;
		int sum = 0;
	    for(int i = 0; i<n; i++){
	    	
	    	sum = p1[i]+ p2[i];
	    	
	    	if(sum > x){
	    		
	    		R = sum - x;// working R=1
	    		sum = x;	// working sum = 16
	    		f[i+1] = R; // working f[i+1] = 1
	    		//System.out.println("in if "+ f[i+1]);
	    		//System.out.println("at R in if"+ R);
	    		
	    	}else{
	    	  
	    		R = 0;
	    	}
	    	//System.out.println("at end b4 assignment "+ f[i]);
	    	//System.out.println("end sum "+ sum);
	    	//System.out.println("at R "+ R);
	    	f[i] = f[i] + sum;
	    	//System.out.println("at end "+ f[i]);
	    	
	   }System.out.print(Arrays.toString(f));
	}

}
