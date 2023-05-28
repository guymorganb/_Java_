package Patterns;
import java.util.Scanner;
public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int val1 = 1;
		int val2 = 1;
		int next = 0;
		for(int i = 1; i < n-1; i++) {
			next = val1 + val2;
			val1 = val2;
			val2 = next;
		}System.out.println(val2);
	}

}
