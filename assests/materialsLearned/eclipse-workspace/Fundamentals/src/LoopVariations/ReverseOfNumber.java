package LoopVariations;
import java.util.Scanner;
public class ReverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s. nextInt();
//       
//        
//
//        String reversedString = new StringBuilder(String.valueOf(n)).reverse().toString();
//        
//        String nonTrailingZerosString = reversedString.replaceAll("0*$", "");
//        
//        int nonTrailingZerosNumber = Integer.parseInt(nonTrailingZerosString);
//
//        System.out.println("The reverse of the number is " + nonTrailingZerosNumber);
//        
//        alternatives:
		
//        int reverse = 0;
//        while (n > 0) {
//            int digit = n % 10;
//            if (digit != 0) {
//                reverse = reverse * 10 + digit;
//            }
//            n /= 10;
//        }
//
//        System.out.println("The reverse of the number is " + reverse);
        
        
        int reverse = 0;
        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }

        System.out.println("The reverse of the number is " + reverse);
	}

}
