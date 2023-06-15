package ObjectOrientedPrograming;

public class FractionUse {

	public static void main(String[] args) {
		
		Fraction f1 = new Fraction(4,6);
		
		f1.print();
		
//		f1.increment(3);
//		f1.print();

		Fraction f2 = new Fraction(4,8);
		
//		f1.addFractions(f2);
		f2.print();
		
//		f1.addFractions(f2);
		f1.print();
		
//		f1.subtractFractions(f2);
		f1.print();
		
		f1.multiply(f2);
		f1.print();
		
//		Fraction f3 = Fraction.multiplyFractions(f1, f2);
//		f3.print();

	}

}
