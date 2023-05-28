//
//package Patterns;
//import java.util.Scanner;
//public class PrintDiamond {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//	      Scanner s = new Scanner(System.in);
//	        
//	        int n = s.nextInt();
//
////	        int i = 1;
////	        int spaces, stars;
////
////	        while (i <= n) {
////	            spaces = Math.abs((n- 1) / 2 - i + 1);
////	            stars = n - 2 * spaces;
////
////	            int j= 1;
////	            while (j <= spaces) {
////	                System.out.print(" ");
////	                j++;
////	            }
////
////	            int m = 1;
////	            while (m <= stars) {
////	                System.out.print("*");
////	                m++;
////	            }
////
////	            System.out.println();
////	            i++;
////	        }
////	        print this pattern: n=3
////	        *
////	        *1*
////	        *121*
////	        *12321*
////	        *121*
////	        *1*
////	        *
//	        System.out.println('*');
//	        // first half
//	        int currRow = 1;
//	        
//	        while(currRow <= n) {
//	        	System.out.print('*');
//	        	int currCol = 1;
//	        	
//	        	while (currCol <= currRow) {
//	        		System.out.print(currCol);
//	        		currCol += 1;
//	        	}
//	        	currCol = currCol - 2;
//	        	while(currCol >= 1) {
//	        		System.out.print(currCol);
//	        		currCol -= 1;
//	        	}
//	        	System.out.println('*');
//	        	currRow ++;
//	        }
//	        // Second half
//	        currRow = 1;
//	        
//	        while(currRow <= n - 1) {
//	        	System.out.print('*');
//	        	
//	        	int currCol = 1;
//	        	while(currCol <= n - currRow) {
//	        		System.out.print(currCol);
//	        		currCol += 1;
//	        	}
//	        	currCol = currCol - 2;
//	        	while(currCol >= 1) {
//	        		System.out.print(currCol);
//	        		currCol -=  1;
//	        	}
//	        	
//	        	System.out.println('*');
//	        	currRow ++;
//	        }
//	        System.out.print('*');
//	}
//
//}
