package tests;

import model.CourseRecord;
import model.Student;

public class StudentTester3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student("Heeyeon");
		
		//Use of version 1 of addCourse(CourseRecord)
		CourseRecord cr = new CourseRecord("1021");
		s1.addCourse(cr);
		System.out.println(s1.getDescription());
		
		//Use of version 2 of addCourse(String
		s1.addCourse("2030");
		System.out.println(s1.getDescription());
		
		cr.setMarks(79); 
		s1.courses[1].setMarks(60);
		
		System.out.println(s1.getDescription());
		
	}

}
