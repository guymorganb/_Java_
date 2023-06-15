package DemoOfPassingBetweenPackages;

import ObjectOrientedPrograming.Student;

public class StudentUse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		System.out.println(s1.name);	// name isn't visible from original package because its access modifier is set to default
		// to make this available, go back to Student file and set name to public.
	
	}

}
