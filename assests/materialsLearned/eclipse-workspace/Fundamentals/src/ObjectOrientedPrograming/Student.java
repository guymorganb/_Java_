package ObjectOrientedPrograming;

public class Student {
//	access modifiers: add private before an attribute to prevent access outside of the class
//	private String email;	// restricts access to only within the class

	private String name;		// private only allows access within the class// use private when you want to control access to the variable
	final  private int rollNumber;
	double gpa;
	public final static double conversionFactor = 0.95;	// final keyword wont allow the value to be changed. for variables who's value is assigned only once.
	private static int numStudents;		// static properties are shared by all objects. makes this property one property that is not multiple copies for each object, keeps track of quantity of students

	
	public Student(String n) {	//	constructor function, does not take a return type. Constructor must match the class name.
		name = n;
		numStudents++;	// keeps count of total number of students
		rollNumber = numStudents; // doing this will increment rollNumber for each student
		
	}
	
	public static int getNumStudents() {		// this variable is shared, therefore its static
//		System.out.println(rollNumber);			// cannot access non-static properties within a static function
		return numStudents;					
	}
	//to allow flexibility to not require rollNUmber we need to make another constructor function
	
//	public Student(String n) {
//		name = n;
////		using only this constructor rollNumber will default to 0
//	}
	
//	function to print
	
	public void print() {
		System.out.println(name + " " + rollNumber);
	}
	
	
//	getter and setter methods
	
	public int getRollNumber() {
		return rollNumber;
	}
	
//	public void setRollNumber(int rollNumber) {
//		if(rollNumber <= 0) {
//			return;
//		}
//	this.rollNumber = rollNumber;	// this references the current object.property and sets it 
//	}
//	
}
