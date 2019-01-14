import java.util.Scanner;
public class ComputeAndInterpretBMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String name = input.nextLine();
		
		System.out.println(name + ", enter your height in inches:");
		double height = input.nextDouble();
		double heightCon = height * 0.0254;
		
		System.out.println(name + ", enter your weight in pounds:");
		double weight = input.nextDouble();
		double weightCon = weight * 0.45359237;
		
		double bmi = 0;
		if(weight > 0 && height > 0) {
			bmi = weightCon / (Math.pow(heightCon, 2));
	}
		String bmiResult;
		if(bmi < 18.5 && bmi > 0) {
			 bmiResult = "Underweight";
		}
		else if(bmi >= 18.5 && bmi < 25.0){
			 bmiResult = "Normal";
		}
		else if(bmi >= 25.0 && bmi < 30.0) {
			 bmiResult = "Overweight";
		}
		else { 
			 bmiResult = "Obese";
		}
			
		System.out.println(name + ", your BMI is " + bmi);
		System.out.println("You are " + bmiResult);
			
		

		
		
		
		input.close();
	}
}