//package Patterns;
//import java.util.Scanner;
//public class AlphabetPatterns {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner s = new Scanner(System.in);
//		
//		int n = s.nextInt();
////		Print this pattern: for n=4:
////		ABCD
////		ABCD
////		ABCD
////		ABCD
//		int i = 1;
//		while(i <= n) {
//			int j = 1;
//			while(j <= n) {
//				System.out.print((char)('A'+j-1));	// here we are explicitly typecasting 'A'+1 into a char to print the letter from the ASCII table
//				System.out.print('.');
//				j++;
//			}System.out.println();
//			i++;
//		}
//		System.out.println();     // print new line for spacing
////		Print this pattern: using n as input:
////		A
////		AB
////		ABC
//		int a = 1;
//		while (a <= n) {
//			int b = 1;
//			while (b <= a) {
//				System.out.print((char)('A' + b-1));
//				b++;
//			}System.out.println();
//			a++;
//		}
//		System.out.println();     // print new line for spacing
////		Print this pattern: using n as input:
////		ABCD
////		BCDE
////		CDEF
////		DEFG
//		int c = 1;
//		while(c <= n) {
//			int d = 1;
//			char ch = (char)('A'+ c -1);
//			while (d <= n) {
//				System.out.print(ch);
//				ch = (char)(ch+1);
//				d++;
//			}System.out.println();
//			c++;
//		}
//	}	
//
//}
