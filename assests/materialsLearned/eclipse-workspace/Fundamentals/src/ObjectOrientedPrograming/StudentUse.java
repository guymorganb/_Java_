package ObjectOrientedPrograming;


public class StudentUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Creating a new student object
//		s1 and s2 are stored in the stack, while the student object is stored in the heap
//		System.out.println(Student.getNumStudents());
		
		Student s1 = new Student("Guy");		
		//s1.print(); // prints roll number as specified in student class
		
//		System.out.println(s1.name+ " " + s1.getRollNumber());
		
		// roll number is private but the getter and setter methods can still access it and change it
//		s1.rollNumber = 4;
		
		
		
		Student s2 = new Student("Morgan");

		//s2.print();
		System.out.println(s2.getRollNumber());
		
		System.out.println(s1.getNumStudents());
		System.out.println(s2.getNumStudents());
		Student s3 = new Student("Name");
		
		
	}

}
