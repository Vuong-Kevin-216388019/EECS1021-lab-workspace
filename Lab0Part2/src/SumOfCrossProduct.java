import java.util.Scanner;
public class SumOfCrossProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the 1st integer in sequence 1:");
		int one = input.nextInt();
				
		System.out.println("Enter the 2nd integer in sequence 1:");
		int two = input.nextInt();
		
		System.out.println("Enter the 3rd integer in sequence 1:");
		int three = input.nextInt();
		
		System.out.println("Enter the 4th integer in sequence 1:");
		int four = input.nextInt();
		
		System.out.println("Enter the 1st integer in sequence 2:");
		int number1 = input.nextInt();
		
		System.out.println("Enter the 2nd integer in sequence 2:");
		int number2 = input.nextInt();
		
		System.out.println("Enter the 3rd integer in sequence 2:");
		int number3 = input.nextInt();
		
		System.out.println("Enter the 4th integer in sequence 2:");
		int number4 = input.nextInt();
		
		int firstNumber = (one * number1);
		int secondNumber = (two * number2);
		int thirdNumber = (three * number3);
		int fourthNumber = (four * number4);
		
		int sum = firstNumber + secondNumber + thirdNumber + fourthNumber;
		
		System.out.print("sum([" + one + ", " + two + ", " + three + ", " + four + "] * ");
		System.out.println("[" + number1 + ", " + number2 + ", " + number3 + ", " + number4 + "]) = " + sum);
		
		input.close();
	}

}
