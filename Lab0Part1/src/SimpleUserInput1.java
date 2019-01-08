import java.util.Scanner;

public class SimpleUserInput1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer:");
		
		int i = input.nextInt();
		
		int square = i * i;
		
		System.out.println("The squre of " + i + " is " + square + ".");
		
		input.close();
		
	}

}
