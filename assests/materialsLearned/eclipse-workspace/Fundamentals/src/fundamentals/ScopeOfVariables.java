//package fundamentals;
//
//public class ScopeOfVariables {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		
//		int a = 10;					// variable a can be used anywhere after this line in Main
//		
//		if(a >= 100) {
//			int b = 10;
//			System.out.println(b);
//			System.out.println(a);
//			
//		}else {
//			int b = 20;
//			System.out.println(b); 	// you can re-assign b here because 'else' has different scope than 'if'. 
//			int c = 20;				// c only has scope within 'else'.
//		}
////		System.out.println(b);		// cant print b here because its outside the scope of if statement
//		
//		int i = 1;
//		while(i <=5) {
//			int j = 10;
//			System.out.println(j);		// j will always be 10 because each time the loop goes around j will be reassigned to 10.
//			i++;
//			j++;
//			
//		}
//	}
//
//}
