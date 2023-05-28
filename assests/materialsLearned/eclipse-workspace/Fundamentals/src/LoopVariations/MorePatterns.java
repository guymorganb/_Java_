package LoopVariations;
import java.util.Scanner;
public class MorePatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
//		int i = 1;
//		while(i <= n) {
//			int j = n;
//			while (j > i) {
//				if(i == n) {
//					j--;
//				}
//				System.out.print(j);
//				j--;
//				}int k = j;
//				while(k == i) {
//				System.out.print("*");
//				k--;
//				j--;
//				}while(j >=1) {			
//				System.out.print(j);
//				j--;
//				}
//			System.out.println();
//			i++;
//		}
		int i = 0;
		while (i < n) {
		    int j = 0;
		    while (j < i) {
		        System.out.print(" ");
		        j++;
		    }
		    int k = i;
		    while (k < n) {
		        System.out.print("*");
		        k++;
		    }
		    System.out.println();
		    i++;
		}
		
	}

}
