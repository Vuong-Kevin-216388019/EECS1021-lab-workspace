import java.util.Scanner;

public class BankApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a balance (e.g, 200.45):");
		double balance = input.nextDouble();
		input.nextLine();
		if(0 < balance && balance <= 1000) {
			
		}
		else { 
			System.out.println("Error: initial balance " + balance + " is not in (0, 1000].");
		}
		
		
		System.out.println("Enter a transaction type: (\"d\" or \"w\"):");
		String type = input.nextLine();
		if(type.equals("d")) {
			
		}
		else if(type.equals("w")) {
			
		}
		else {
			System.out.println("Error: transaction type " + type + " is neither d nor w");
		}
		
		
		
		
		
		
		
		
		input.close();
	}

}
