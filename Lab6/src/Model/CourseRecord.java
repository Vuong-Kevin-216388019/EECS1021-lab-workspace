package Model;

public class CourseRecord {

	public String title;
	public int marks;
	public Faculty instructor;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Faculty getInstructor() {
		return instructor;
	}

	public void setInstructor(Faculty instructor) {
		this.instructor = instructor;
	}

	
	
	public CourseRecord() {
		//Version1 : no attributes will be initialized using input values, instead by default values 
		
	}
	
	public CourseRecord(String title) {
		this.title = title;
	}
	
	public CourseRecord(String title, int marks) {
		this.title = title;
		this.marks = marks;
	}
	
	String getLetterGrade() {
		String lg = "";
		
		if(this.marks >= 90) {
			lg = "A+";
		}
		else if(this.marks >= 80) {
			lg = "A";
		}
		else if(this.marks >= 70) {
			lg = "B";
		}
		else if(this.marks >= 60) {
			lg = "C";
		}
		else if(this.marks >= 50) {
			lg = "D";
		}
		else {
			lg = "F";
		}
		
		return lg;
	}
	
	public String getDescription(){
		//Version1
		//String result = "";
		//result = "Course " + this.title + " (raw marks: " + this.marks + ") has instructor " + this.instructor;
		//return result;
		String desc = "";
		if(this.instructor == null) {
			desc = "Course " + this.title + " (raw marks: " + this.marks + ") has no instructor ";
		}
		else {
			desc = "Course " + this.title + " (raw marks: " + this.marks + ") letter grade " + this.getLetterGrade();
		}
		return desc;
	}
	
	
	
	
	
	
	
	
	
	
	
}
