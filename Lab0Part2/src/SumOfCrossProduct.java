import java.util.Scanner;
public class SumOfCrossProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
//		prompts user for all integers
		System.out.println("Enter the 1st integer in sequence 1:");
		int one = input.nextInt();
				
		System.out.println("Enter the 2nd integer in sequence 1:");
		int two = input.nextInt();
		
		System.out.println("Enter the 3rd integer in sequence 1:");
		int three = input.nextInt();
		
		System.out.println("Enter the 4th integer in sequence 1:");
		int four = input.nextInt();
		
		System.out.println("Enter the 5th integer in sequence 1:");
		int five = input.nextInt();
		
		System.out.println("Enter the 1st integer in sequence 2:");
		int number1 = input.nextInt();
		
		System.out.println("Enter the 2nd integer in sequence 2:");
		int number2 = input.nextInt();
		
		System.out.println("Enter the 3rd integer in sequence 2:");
		int number3 = input.nextInt();		
		
		System.out.println("Enter the 4th integer in sequence 2:");
		int number4 = input.nextInt();
		
		System.out.println("Enter the 5th integer in sequence 2:");
		int number5 = input.nextInt();
//		computes the 4 different values that are needed to sum and get cross product
		int firstNumber = (one * number1);
		int secondNumber = (two * number2);
		int thirdNumber = (three * number3);
		int fourthNumber = (four * number4);
		int fifthNumber = (five * number5);
//		adds all the values to compute the final cross product
		int sum = firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber;
//		prints out the final result
		System.out.print("sum([" + one + ", " + two + ", " + three + ", " + four + ", " + five +"] * ");
		System.out.println("[" + number1 + ", " + number2 + ", " + number3 + ", " + number4 + ", " + number5 + "])" + " = " + sum);
		
		input.close();
	}

}
