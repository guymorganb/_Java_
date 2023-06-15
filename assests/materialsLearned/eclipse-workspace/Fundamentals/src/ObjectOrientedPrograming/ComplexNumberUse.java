package ObjectOrientedPrograming;
import java.util.Scanner;
public class ComplexNumberUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner s = new Scanner(System.in);

			int real1 = s.nextInt();
			int imaginary1 = s.nextInt();

			int real2 = s.nextInt();
			int imaginary2 = s.nextInt();

			ComplexNumber c1 = new ComplexNumber(real1, imaginary1);
			ComplexNumber c2 = new ComplexNumber(real2, imaginary2);

			int choice = s.nextInt();
			 
			if(choice == 1) {
				// Add
				c1.plus(c2);
				c1.print();
			}
			else if(choice == 2) {
				// Multiply
				c1.multiply(c2);
				c1.print();
			}
			else {
				return;
			}
		
	}

}
//While complex and imaginary numbers are related, they are not the same.
//
//Imaginary numbers are a subset of complex numbers.
//
//Imaginary Numbers: These are numbers that when squared, result in a negative number. They're based on the imaginary unit, which is denoted by the symbol "i", where i is the square root of -1. Any multiple of "i" is considered an imaginary number. For instance, 2i, 5i, and -3i are all imaginary numbers.
//
//Complex Numbers: A complex number is a number that can be expressed in the form a + bi, where 'a' and 'b' are real numbers, and 'i' is the imaginary unit. The 'a' part is known as the real part, while 'bi' is known as the imaginary part. If b is not zero, then the complex number is said to have both a real part and an imaginary part. If b is zero, then it's just a real number. If 'a' is zero and 'b' is not, then it's an imaginary number.
//
//So while all imaginary numbers are complex numbers, not all complex numbers are imaginary numbers because complex numbers also include real numbers.
