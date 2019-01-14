import java.util.Scanner;
public class GradeReport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
// 		prompting user for name and quizzes		
		System.out.println("What is your name?");
		String name = input.nextLine();
		
		System.out.println(name + ", what is your score for quiz 1 (out of 100)?");
		int quiz1 = input.nextInt();
		
		System.out.println(name + ", what is your score for quiz 2 (out of 100)?");
		int quiz2 = input.nextInt();

		System.out.println(name + ", what is your score for quiz 3 (out of 100)?");
		int quiz3 = input.nextInt();
		
		System.out.println(name + ", what is your score for quiz 4 (out of 100)?");
		int quiz4 = input.nextInt();
		
		System.out.println(name + ", what is your score for quiz 5 (out of 100)?");
		int quiz5 = input.nextInt();
		
		System.out.println(name + ", what is your score for quiz 6 (out of 100)?");
		int quiz6 = input.nextInt();
		
		System.out.println(name + ", what is your score for quiz 7 (out of 100)?");
		int quiz7 = input.nextInt();
		
		System.out.println(name + ", what is your score for quiz 8 (out of 100)?");
		int quiz8 = input.nextInt();
		
		System.out.println(name + ", what is your score for quiz 9 (out of 100)?");
		int quiz9 = input.nextInt();
		
		
// prompting user for assignments
		System.out.println(name + ", what is your score for Assignment 1 (out of 100)?");
		int a1 = input.nextInt();
		
		System.out.println(name + ", what is your score for Assignment 2 (out of 100)?");
		int a2 = input.nextInt();
		
		System.out.println(name + ", what is your score for Assignment 3 (out of 100)?");
		int a3 = input.nextInt();
		
		System.out.println(name + ", what is your score for Assignment 4 (out of 100)?");
		int a4 = input.nextInt();
		
		System.out.println(name + ", what is your score for Assignment 5 (out of 100)?");
		int a5 = input.nextInt();
		
		System.out.println(name + ", what is your score for Assignment 6 (out of 100)?");
		int a6 = input.nextInt();
		
		System.out.println(name + ", what is your score for Assignment 7 (out of 100)?");
		int a7 = input.nextInt();
		
		System.out.println(name + ", what is your score for Assignment 8 (out of 100)?");
		int a8 = input.nextInt();
		
		System.out.println(name + ", what is your score for Assignment 9 (out of 100)?");
		int a9 = input.nextInt();
		
		System.out.println(name + ", what is your score for Assignment 10 (out of 100)?");
		int a10 = input.nextInt();
		
		
// prompting user for labs
		System.out.println(name + ", what is your score for Lab Test 1 (out of 100)?");
		int lab1 = input.nextInt();
		
		System.out.println(name + ", what is your score for Lab Test 2 (out of 100)?");
		int lab2 = input.nextInt();

		System.out.println(name + ", what is your score for Lab Test 3 (out of 100)?");
		int lab3 = input.nextInt();
		

// 		prompting user for big tests, courses and displaying all information
		System.out.println(name + ", what is your midterm score (out of 100)?");
		int mid = input.nextInt();
		
		System.out.println(name + ", what is your final exam score (out of 100)?");
		int finalExam = input.nextInt();
		
		System.out.println(name + ", which course are you talking about?");
		String courseTaking = input.next();
		
		System.out.println(name + ", here is your grading report for " + courseTaking + ":");
		
		
// 		displaying of all users info, but before doing so, checks if there are any invalid marks entered
		if(quiz1 < 0 || quiz2 < 0 || quiz3 < 0 || quiz4 < 0 || quiz5 < 0 || quiz6 < 0 || quiz7 < 0 || quiz8 < 0 || quiz9 < 0 || a1 < 0 || a2 < 0 || a3 < 0 || a4 < 0 || a5 < 0 || a6 < 0 || a7 < 0 || a8 < 0 || a9 < 0 || a10 < 0 || lab1 < 0 || lab2 < 0 || lab3 < 0 || mid < 0 || finalExam < 0) {
			System.out.println("---------------------------------------------------------");
			System.out.println("Please note: You have entered an invalid mark proceed to restart and enter all grades that are valid");
			}
		
		else {
		System.out.println("---------------------------------------------------------");
		System.out.println("Quiz 1: " + quiz1);
		System.out.println("Quiz 2: " + quiz2);
		System.out.println("Quiz 3: " + quiz3);
		System.out.println("Quiz 4: " + quiz4);
		System.out.println("Quiz 5: " + quiz5);
		System.out.println("Quiz 6: " + quiz6);
		System.out.println("Quiz 7: " + quiz7);
		System.out.println("Quiz 8: " + quiz8);
		System.out.println("Quiz 9: " + quiz9);
		
		System.out.println("---------------------------------------------------------");
		System.out.println("Assignment 1: " + a1);
		System.out.println("Assignment 2: " + a2);
		System.out.println("Assignment 3: " + a3);
		System.out.println("Assignment 4: " + a4);
		System.out.println("Assignment 5: " + a5);
		System.out.println("Assignment 6: " + a6);
		System.out.println("Assignment 7: " + a7);
		System.out.println("Assignment 8: " + a8);
		System.out.println("Assignment 9: " + a9);
		System.out.println("Assignment 10: " + a10);
		
		System.out.println("---------------------------------------------------------");
		System.out.println("Lab Test 1: " + lab1);
		System.out.println("Lab Test 2: " + lab2);
		System.out.println("Lab Test 3: " + lab3);
		
		System.out.println("---------------------------------------------------------");
		System.out.println("Midterm Test: " + mid);
		System.out.println("Final Exam: " + finalExam);
		}
		
		
//      gets average of the quizzes
		System.out.println("---------------------------------------------------------");
		double sumQuiz = quiz1 + quiz2 + quiz3 + quiz4 + quiz5 + quiz6 + quiz7 + quiz8 + quiz9;
		double avgQuiz = sumQuiz / 9.0;
		System.out.println("Average of quizzes: " + avgQuiz);
		
		
//		gets average of assignment grades 		
		double sumA = a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10;
		double avgA = sumA / 10.0;
		System.out.println("Average of assignments: " + avgA);
		
//		gets the average of lab tests 
		double sumL = lab1 + lab2 + lab3;
		double avgL = sumL / 3.0;
		System.out.println("Average of lab tests: " + avgL);

//		displays final raw marks
		double finalMark = (avgQuiz * 0.18) + (avgA * 0.2) + (avgL * 0.12) + (mid * 0.15) + (finalExam * 0.35);
		System.out.println("Final raw marks: " + finalMark);
		
		input.close();
	}

}
