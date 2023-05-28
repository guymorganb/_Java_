//package fundamentals;
//
//public class TypeCasting {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
////		We are converting a character to an integer;
//		char ch = 'a';			// char has size 2 bytes
//		int b = ch;				// int holds 4 bytes, this is an implicit conversion
//		ch = b;			// Error: you can't store a type like long, in an int, because long is bigger. Unless you explicitly convert it
//		System.out.println(b);  // its OK to put a smaller 2 byte value into a larger 4byte space
//
//		
////		Explicit typecast: to explicitly convert and force the conversion you may loose data;
//		ch =(char)b;			// this is explicit type conversion, warning: data loss may occur
//		int i = 10.6; 			// Error: any decimal number is a double and this wont work, unless you typecast it
//		int j = (int)10.6;		// here we have typecasted j, and forced it to hold 10.6, warning: data loss can occur
//		
////		Floats: all decimal numbers by default are doubles, doubles are 8 bytes long, and floats are 4 bytes.
//		float f = 1.7;			// Error: 1.7 is a 8 byte double and float is a 4byte type, can't do this unless you explicitly say
////		2 ways to declare 1.7 as a float:
//		float g = 1.7f;
////		or explicitly typecast it
//		float h = (float)1.7;
////		working with differing types
//		System.out.println(4 + 4);			// here, 2 ints will produce an int
//		System.out.println(4 + 4.5);		// here, an int and a double will produce the larger data type: double
//		System.out.println(4.1 + 4.4);		// here, two doubles will produce a double
//		System.out.println(2/5);			// here, the result will be 0 unless its typecast into a double
//		System.out.println((double)2/5);	// here, we typecast into a double to get output of a double = 0.4
//		System.out.println(2.0/5);			// here, is another way to get the same result = 0.4
//	}
//
//}
