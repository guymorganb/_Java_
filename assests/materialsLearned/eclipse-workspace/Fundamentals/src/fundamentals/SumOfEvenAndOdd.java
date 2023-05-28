//package fundamentals;
//import java.util.Scanner;
//public class SumOfEvenAndOdd {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner s = new Scanner(System.in);
//		
//		  int n = s.nextInt();
//	        
//	        int evenSum = 0;
//	        int oddSum = 0;
//	        while (n > 0) {
//	            int digit = n % 10;		// modulo extracts the last digit off the input, because dividing it by 10 leaves a remainder
//	            if (digit % 2 == 0) {
//	                evenSum += digit;
//	            } else {
//	                oddSum += digit;
//	            }
//	            n /= 10;				// because n is of type 'int' dividing it by 10 will cut off the decimal value remainder we targeted
//	        }  System.out.println(evenSum + " " + oddSum);
//	}
//
//}
