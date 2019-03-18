package Model;

public class StudentManagementSystem {

	public Student name;
	public CourseRecord title;
	public int mark;
	public double gpa;
	public int nos;
	public Student[] student;
	public CourseRecord course;
	
	public String getDescription() {
		String result = "";
				
				
		return result;
	}
	
	
	public int getStudents() {
		int result = -1;
		
		return result;
	}
	
	public void addStudent(Student student) {
		this.student[this.nos] = student;
		this.nos ++;
	}
	
	public int getMarks(Student name, CourseRecord title) {
		int result = -1;
		
		return result;
	}
	
	public int setMarks(Student name, CourseRecord title, int marks) {
		int result = -1;
		
		return result;
	}
	
	public int getGPA(Student name) {
		int result = -1;
		
		return result;
	}
	
	public String addCourse(Student name, CourseRecord Course) {
		String result = "";
				
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
