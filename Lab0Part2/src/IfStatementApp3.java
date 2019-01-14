import java.util.Scanner;
public class IfStatementApp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer balance:");
		int initialBalance = input.nextInt();
		
		System.out.println("Enter an amount to withdraw:");
		int amount = input.nextInt();
		
		if(initialBalance < 0) {
			System.out.println("Error: initial balance should not be negative");
		}
		
		else if(amount < 0) {
			System.out.println("Error: amount to withdraw should not be negative");
		}
		
		else if(amount >= initialBalance) {
			System.out.println("Error: amount to withdraw should be smaller than balance");
		}
		else {
			int resultingBalance = initialBalance - amount; 
			System.out.print("Initial balance " + initialBalance + " after withdrawing " + amount);
			System.out.println(" has the resulting balance " + resultingBalance);
		}
		
		
		
		input.close();
	}

}
