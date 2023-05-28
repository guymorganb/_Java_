package LoopVariations;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i = 2; i <= n; i++) {
			
			for(int j = 2; j <= i; j++) {
				
				int k = i % j;
				
				if ( j < i && k == 0) {
					
					break;
				}else if(j == i) {
				System.out.println(i);
				}
			}
		}
	}

}
