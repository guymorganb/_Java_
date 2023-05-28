package LoopVariations;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s. nextInt();
//		// convert binary to decimal
//		int result = 0;
//		for(int i = 0; n > 0; i++ ) {
//			int lastDigit = n % 10;
//			int convert = lastDigit * (int)Math.pow(2, i);
//			result = result + convert;
//			
//			n /= 10;
//		}System.out.println(result);
		
		
		// convert decimal to binary
		String result = Integer.toBinaryString(n);
		System.out.println(result);
		
		// square root
		//System.out.println((int)Math.floor((Math.sqrt(n))));
	}

}
