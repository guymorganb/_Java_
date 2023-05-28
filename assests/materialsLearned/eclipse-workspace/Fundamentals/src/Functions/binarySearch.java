package Functions;

public class binarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// this binary search wont return -1 if target doesn't exist
//		int[] arr = {1,3,4,5,6,7,8,9,11};
//		 int target = 2;
//		 int start = 0;
//		 int end = arr.length - 1;
//		 int middleIndex = (int)Math.floor((start+end)/2);
//		 int value = arr[middleIndex];
//		 
//		 while (start < end) {
//			 
//			 if (value < target) {
//				 
//				 start = middleIndex;
//				 middleIndex = (int)Math.floor((start+end)/2);
//				 value = arr[middleIndex];
//			 }else if(value > target) {
//				 end = middleIndex;
//				 middleIndex = (int)Math.floor((start+end)/2);
//				 value = arr[middleIndex];
//			 }else if( value == target ) {
//				 System.out.println(middleIndex);
//				 break;
//			 }
//		 }
	// this binary search should return -1 if the element doesnt exist.
			        int[] nums = {1, 3, 4, 5, 6, 7, 8, 9, 11};
			        // start by identifying the components needed to solve the problem
			        int target = 7;
			        int start = 0;
			        int end = nums.length -1;
			        int middleIndex;
			        int value;
			        int notFound = -1;
			        while ( start <= end){
			            middleIndex =(int)Math.floor((start + end)/2);
			            value = nums[middleIndex];
			            if (value < target){
			                start = middleIndex + 1;
			            }else if( value > target){
			                end = middleIndex-1;
			            }else if(value == target){
			                 System.out.println(middleIndex);
			                 return;
			            }
			        }
			        System.out.println(notFound); // Target not found
			}
}
	


