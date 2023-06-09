package ObjectOrientedPrograming;

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	public Fraction( int numerator,int denominator) {
		if(denominator == 0) {
			denominator = 1;
			return;
		}
		this.denominator = denominator;
		this.numerator = numerator;
		simplify();
	}
	
	public void setNumerator(int num) {
		this.numerator = num;
		simplify();
	}
	
	public void setDenominator(int num) {
		if(num == 0) {
			return;
		}
		this.denominator = num;
		simplify();
	}
	
	public int getNumerator() {
		return numerator;
	
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	private void simplify() {
//		int smallestNum = numerator > denominator ? denominator : numerator == denominator ? denominator : numerator < denominator ? numerator : null;
		int smallestNum = Math.min(numerator, denominator);   //alternative approach
		int gcd = 1;
		for(int i = 1; i <= smallestNum; i++) {
			if(numerator % i == 0 && denominator % i == 0) {
				gcd = i;
			}
		}
		numerator /= gcd;
		denominator /= gcd;
	}
	
	public void print() {
		System.out.println(numerator + "/" + denominator);
	}
	
	public void increment(int num) {
		num *= denominator;
		numerator += num;
		simplify();
	}
	
	public void addFractions(Fraction f2) {
		// first fraction is the fraction which this method is called on, so we must use "this" to reference the first fraction
		// second fraction is passed as an argument
		this.numerator = this.numerator * f2.denominator + this.denominator * f2.numerator;
		this.denominator = this.denominator * f2.denominator;
		simplify();
		
	}
//	add 2 fractions together
//	pass it the 2 fractions we want to add
//	this is static because its being used between multiple objects in the class
//	return type is Fraction object
	public static Fraction add(Fraction f1, Fraction f2) {
//		this is taking 2 objects as parameters and returning a new object after calculating them
		int newNum = f1.numerator * f2.denominator + f1.denominator * f2.numerator;
		int newDenominator = f1.denominator * f2.denominator;
		Fraction f3 = new Fraction(newNum, newDenominator);
		return f3;
	}
	public void subtractFractions(Fraction f2) {
		// first fraction is the fraction which this method is called on, so we must use "this" to reference the first fraction
		// second fraction is passed as an argument
		this.numerator = this.numerator * f2.denominator - this.denominator * f2.numerator;
		this.denominator = this.denominator * f2.denominator;
		simplify();
	}
	
	public static Fraction subtract(Fraction f1, Fraction f2) {
//		this is taking 2 objects as parameters and returning a new object after calculating them
		int newNumerat = f1.numerator * f2.denominator - f1.denominator * f2.numerator;
		int newDenominat = f1.denominator * f2.denominator;
		Fraction f3 = new Fraction(newNumerat,newDenominat);
		return f3;
	}
	public void multiply(Fraction f2) {
		// first fraction is the fraction which this method is called on, so we must use "this" to reference the first fraction
		// second fraction is passed as an argument
		this.numerator = this.numerator * f2.numerator;
		this.denominator = this.denominator * f2.denominator;
		simplify();
	}
	public static Fraction multiplyFractions(Fraction f1, Fraction f2) {
		int newNumerator = f1.numerator * f2.numerator;
		int newDenominator = f1.denominator * f2.denominator;
		Fraction f3 = new Fraction(newNumerator, newDenominator);
		return f3;
	}
}
