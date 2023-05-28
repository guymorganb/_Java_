package Functions;

import java.util.Scanner;

public class AnotherWayToRotateArrays {
	
	public static void swap(int[] a, int l, int r) {
		int temp = a[l];
			a[l] = a[r];
			a[r] = temp;
	}
	
	public static void reverse(int[] a, int l, int r) {
		r--;
		int len = (r-1)/2;
		for(int i=0;i<=len;i++) {
			swap(a,l,r);
			l++;
			r--;
		}
	}
	
	public static void rotateRight(int[] a, int n, int x) {
		reverse(a,0,n);
		reverse(a,0,x);
		reverse(a,x,n);
	}
	
	public static void rotateLeft( int[] a, int n, int x) {
		reverse(a,0,n);
		reverse(a,0,n-x);
		reverse(a,n-x,n);
	}
	
	
	public static void rotateArray(int[] a, int n, int x, String dir) {
		x = x%n;
		if(x>0 && dir.equals("LEFT")) {
			rotateLeft(a,n,x);
		}
		else if(x>0 && dir.equals("right")) {
			rotateRight(a,n,x);
		}
		for(int i=0; i<n;i++) {
			System.out.print(a[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		int x = s.nextInt();
		String dir = s.next();
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = s.nextInt();
		}
		rotateArray(a, n, x, dir);
	}

}
