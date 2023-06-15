package ObjectOrientedPrograming;

public class ComplexNumber {

		// Complete this class
		int real;
	    int imag;

	    // Constructor
	    public ComplexNumber(int real, int imag) {
	        this.real = real;
	        this.imag = imag;
	    }

	    // Plus
	    public void plus(ComplexNumber c2) {
	        this.real += c2.real;
	        this.imag += c2.imag;
	    }

	    // Multiply
	    public void multiply(ComplexNumber c2) {
	        int real = this.real * c2.real - this.imag * c2.imag;
	        int imag = this.imag * c2.real + this.real * c2.imag;
	        this.real = real;
	        this.imag = imag;
	    }

	    // Print
	    public void print() {
	        System.out.println(this.real + " + i" + this.imag);
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
//----------------------------------------------------------------------------------------------------------------------------------
//Complex numbers are essential in many fields of science and engineering. Some of the primary use cases include:
//
//Electrical Engineering: Complex numbers are used extensively in electrical engineering, especially in signal analysis and electronics. The imaginary part of a complex number is used to represent the amplitude of a signal's oscillation, while the real part represents the phase shift. This is often used in analysis of AC circuits and signal processing.
//
//Physics: In quantum mechanics, complex numbers are used to calculate the probability of different outcomes. The wave function, which describes the state of a quantum system, is a complex-valued function.
//
//Control Theory: Complex numbers are used to analyze system stability in control theory. In this context, the roots of a certain characteristic equation determine the system's behavior over time.
//
//Mathematics: Complex numbers are used to find solutions to equations that have no solutions in the real numbers. For example, the equation x² + 1 = 0 has no solution when only real numbers are considered, but it does when complex numbers are used.
//
//Computer Science: Complex numbers are often used in graphics, simulations, and calculations involving rotations. They are also used in certain algorithms, like the Fast Fourier Transform (FFT), which is essential in signal and image processing.
//
//Engineering: They are used in fluid dynamics, electromagnetic field theory, and other similar domains.