package LoopVariations;
import java.util.Scanner;
public class SumOrProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
//		int choice = s.nextInt();
//		
//		if(choice == 1) {
//			int sum = 0, num = 1;
//			while(num <= n) {
//				sum += num;
//				num++;
//			}
//			System.out.println(sum);
//		}
//		else if(choice ==2) {
//			int product = 1, num = 1;
//			while(num <= n) {
//				product *= num;
//			}
//			System.out.println(product);
//		}
//		else {
//			System.out.println("-1");
//		}
//		print first n terms, of 3x+2 but omit multiples of 4.
		for(int i = 1, j = 1; j <= n; i++, j++){
			int x = (3*i)+2;
			if (x % 4 == 0){
				j--;
				continue;
			}else{
				System.out.print(x + " ");
			}
		}
	}

}
