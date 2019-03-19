package model;

public class Student {
	public String name;
	public final int MAX_NUM_COURSES = 5;
	// each element (e.g., courses[0], courses[1], ..., course[courses.length-1]) in the array stores
	public CourseRecord[] courses; 
	public int noc;

	public Student(String name) {
		this.name = name;
		this.courses = new CourseRecord[MAX_NUM_COURSES];
		this.noc = 0; // so far zero courses registered; the next course is to be stored at index 0
	}
	
	// Version 1: Given a CourseRecord to be stored directly into the courses array.
	public void addCourse(CourseRecord c) {
		this.courses[this.noc] = c;
		this.noc ++;
	}
	
	// Version 2: Given title which is sufficient to create a new CourseRecord object.
	public void addCourse(String title) {
		CourseRecord c = new CourseRecord(title);
		this.addCourse(c);
		// this.courses[this.noc] = c;
		// this.noc ++;
	}
	
	
	public int getMarks(String title) {
		int marks = -1;
		
		int index = this.indexOf(title);
		if (index >= 0) {
			// CourseRecord c = this.courses[index];
			// marks = c.getMarks();
			marks = this.courses[index].getMarks();
		}
		
		return marks;
	}
	
	
	public void setMarks(String title, int marks) {
		int index = this.indexOf(title);
		if (index >= 0) {
			// CourseRecord c = this.courses[index];
			// c.setMarks(marks);
			this.courses[index].setMarks(marks);
		}
	}
	
	
	int indexOf(String title) {
		int index = -1;
		
		boolean found = false;
		for (int i = 0; i < this.noc && !found; i++) {
			if (this.courses[i].getTitle().equals(title)) {
				found = true;
				index = i;
			}
		}
		return index;
	}
	
	public double getGPA() {
		double gpa = 0.0;
		double gp = 0.0;
		
		for (int i = 0; i < this.noc; i++) {
			String lg = this.courses[i].getLetterGrade();
			if (lg.equals("A+")) {
				gp += 9;
			}
			else if (lg.equals("A")) {
				gp += 8;
			}
			else if (lg.equals("B")) {
				gp += 7;
			}
			else if (lg.equals("C")) {
				gp += 6;
			}
			else if (lg.equals("D")) {
				gp += 5;
			}
			else {
				gp += 0;
			}
		}
		
		if (gp == 0) {
			gpa = 0;
		}
		else {
			gpa = gp / this.noc;
		}
		
		return gpa;
	}
	
	public String getDescription() {
		String result = "";

		//Version 1: print out the addresses of courses array
		//		result += "Student " + this.name + " has registered " + this.noc + " courses:\n";
		//		for (int i = 0; i < this.courses.length; i++) {
		//			result += this.courses[i] + "\n";

		//Version 2: print out the description of courses array elements (by calling getDescription from CourseRecord)
		//This version may cause NullPointerException,
		//because there might be slots of the courses array storing null.
		//		result += "Student " + this.name + " has registered " + this.noc + " courses:\n";
		//		for (int i = 0; i < this.courses.length; i++) {
		//			result += this.courses[i].getDescription() + "\n";
		//		}
		
		//Version 3
		result += "Student " + this.name + " has registered " + this.noc + " courses (with GPA " + this.getGPA() + "):\n";
		for (int i = 0; i < this.noc; i++) {
			result += this.courses[i].getDescription() + "\n";
		}
		return result;
	}

	public String getName() {
		return this.name;
	}
}
