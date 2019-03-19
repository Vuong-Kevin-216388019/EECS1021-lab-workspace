package model;

public class StudentManagementSystem {

	
	public final int MAX_NUM_OF_STUDENTS = 50;
	public Student[] students;
	public Student[] student = new Student[MAX_NUM_OF_STUDENTS];
	public int nos = 0;

	public StudentManagementSystem() {
		this.students = new Student[this.nos];
	}

	public String getDescription() {
		String result = "";
		if (this.nos == 0) {
			result += "Student management system currenlty stores no students.";
		}
		else {
			result += "Student management system currently stores " + nos + " students.";
		}
		return result;
	}

	public Student[] getStudents() {
		return this.students;
	}

	public void addStudent(Student c) { 
		this.student[this.nos] = c;
		this.nos ++;
		this.students = new Student[nos];
		for (int i = 0; i < students.length; i++) {
			this.students[i] = student[i];
		}
	}

	public void addStudent(String string) { 
		Student c = new Student(string);
		this.student[this.nos] = c;
		this.nos ++;
		this.students = new Student[nos];
		for (int i = 0; i < students.length; i++) {
			this.students[i] = student[i];
		}
	}

	public int getMarks(String string, String string2) {
		int marks = -1;
		boolean found = false;
		for (int i = 0; i < this.nos && !found; i++) {
			if (this.students[i].getName().equals(string)) {
				found = true;
				marks = this.students[i].getMarks(string2);
			}
		}
		return marks;
	}

	public void setMarks(String name, String courseName, int mark) {
		boolean found = false;
		for (int i = 0; i < this.nos && !found; i++) {
			if (this.student[i].getName().equals(name)) {
				found = true;
				this.student[i].setMarks(courseName, mark);
			}
		}
	}

	public double getGPA(String name) {
		double gpa = 0.0;
		boolean found = false;
		for (int i = 0; i < this.nos && !found; i++) {
			if (this.student[i].getName().equals(name)) {
				found = true;
				gpa = this.student[i].getGPA();
			}
		}
		return gpa;
	}

	public void addCourse(String name, CourseRecord course) {
		boolean found = false;
		for (int i = 0; i < this.nos && !found; i++) {
			if (this.students[i].getName().equals(name)) {
				found = true;
				this.students[i].addCourse(course);
			}
		}

	}



}
