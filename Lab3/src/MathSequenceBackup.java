import java.util.Arrays;
import java.util.Scanner;

public class MathSequenceBackup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); 
		
		System.out.println("What kind of processing task would you like to perform?");
		System.out.println("1: Generate an arithmetic sequence.");
		System.out.println("2: Generate a geometric sequence.");
		System.out.println("3: Determine an arithmetic sequence.");
		int perform = input.nextInt();
		String choice = "Y";
		
		
		while(choice.equals("Y")) {
			int sum = 0;
		if(perform == 1) {
				System.out.println("Enter the first term in the arithmetic sequence:");
				int first = input.nextInt();
				System.out.println("Enter the common difference in the arithmetic sequence:");
				int commonDiff = input.nextInt();
				System.out.println("Enter the number of terms in the arithmetic sequence:");
				int terms = input.nextInt();
				int[] arithmeticArray = new int [terms];
				
				if(terms > 1) {
					for(int i = 0;i < terms; i ++) {
						arithmeticArray[i] = first;
						sum = sum + first;
						first = first + commonDiff;
					}
					System.out.print("<");
					for(int i = 0; i < arithmeticArray.length - 1; i ++) {
					System.out.print(" " + arithmeticArray[i] + ", ");
					}
					System.out.println(arithmeticArray[terms - 1] + " >");
					System.out.println("Sum of arithmetic sequence: " + sum);
				}
				else { 
					System.out.println("<" + first + ">");
					System.out.println("Sum of geometric sequence: " + first);
				}
				System.out.println("Would you like to process another sequence? (Y/N)");
				choice = input.next();
				if(choice.equals("Y")) {
					System.out.println("What kind of processing task would you like to perform?");
					System.out.println("1: Generate an arithmetic sequence.");
					System.out.println("2: Generate a geometric sequence.");
					System.out.println("3: Determine an arithmetic sequence.");
					perform = input.nextInt();
				}
				else {
					
				}
			
		}
		else if(perform == 2) {
			System.out.println("Enter the first term in the geometric sequence:");
			int first = input.nextInt();
			System.out.println("Enter the common ratio in the geometric sequence:");
			int commonRatio = input.nextInt();
			System.out.println("Enter the number of terms in the geometric sequence:");
			int terms = input.nextInt();
			int[] geometricArray = new int [terms];
			
			if(terms > 1) {
				for(int i = 0;i < terms; i ++) {
					geometricArray[i] = first;
					sum = sum + first;
					first = first * commonRatio;
				}
				System.out.print("<");
				for(int i = 0; i < geometricArray.length - 1; i ++) {
				System.out.print(" " + geometricArray[i] + ", ");
				}
				System.out.println(geometricArray[terms - 1] + " >");
				System.out.println("Sum of geometric sequence: " + sum);
			}
			else { 
				System.out.println("<" + first + ">");
				System.out.println("Sum of geometric sequence: " + first);
			}
			System.out.println("Would you like to process another sequence? (Y/N)");
			choice = input.next();
			if(choice.equals("Y")) {
				System.out.println("What kind of processing task would you like to perform?");
				System.out.println("1: Generate an arithmetic sequence.");
				System.out.println("2: Generate a geometric sequence.");
				System.out.println("3: Determine an arithmetic sequence.");
				perform = input.nextInt();
			}
			
		}
		else if(perform == 3) {
			int[] determineArray = new int [10];
			int counter = 0;
			String choice2 = "Y";
				while(counter < 10 && choice2.equals("Y")) {
					System.out.println("Enter a new number.");
					determineArray[counter] = input.nextInt();
					counter = counter + 1;
					System.out.println(counter);
					if(counter == 10) {
						System.out.println("You have entered 10 numbers we will now compute sequence.");
					}
					else {
						System.out.println("You may still enter another " + (10 - counter) + " numbers.");
						System.out.println("You have entered " + (counter) + " numbers.");
						System.out.println("Would you like to enter another new number? (Y/N)");
						choice2 = input.next();
					}
					
				}	
				/*if(counter == 9) {
					System.out.println("Enter a new number.");
					determineArray[9] = input.nextInt();
					System.out.println("You have entered 10 numbers we will now compute sequence.");
					System.out.println(Arrays.toString(determineArray));
					int comCounter = 0;
					int comDiff = determineArray[1] - determineArray[0];
					for(int i = 0; i < 9; i ++) {
						sum = sum + determineArray[i];
						if(determineArray[i + 1] - determineArray[i] == comDiff) {
							comCounter ++;
						}
					}
					sum = sum + determineArray[9];
					if(comCounter == 9) {
						System.out.println("first term " + determineArray[0] + ", common difference " + comDiff + ", length " + determineArray.length + ", and sum " + sum);
					}
					else {
						System.out.println("This is not an arithmetic sequence.");
					}
					
				}*/
				if(counter == 1 && choice2.equals("N")) {
					System.out.println("Error: we cannot infer the common difference from a sequence of size one.");
				}
				else {
					int comCounter = 0;
					int comDiff = determineArray[1] - determineArray[0];
					for(int i = 0; i < counter - 1; i ++) {
						sum = sum + determineArray[i];
						if(determineArray[i + 1] - determineArray[i] == comDiff) {
							comCounter ++;
						}
					}
					sum = sum + determineArray[counter - 1];
					if(comCounter == counter - 1) {
						System.out.println("first term " + determineArray[0] + ", common difference " + comDiff + ", length " + counter + ", and sum " + sum);
					}
					else {
						System.out.println("This is not an arithmetic sequence.");
					}
				}
				System.out.println("Would you like to process another sequence? (Y/N)");
				choice = input.next();
				if(choice.equals("Y")) {
					System.out.println("What kind of processing task would you like to perform?");
					System.out.println("1: Generate an arithmetic sequence.");
					System.out.println("2: Generate a geometric sequence.");
					System.out.println("3: Determine an arithmetic sequence.");
					perform = input.nextInt();
				}
		}
		
		
		else {
			System.out.println("Error: task number must be 1, 2 or 3.");
		
		}
		}
		System.out.println("Bye!");
		
		
		
		input.close();
		
	

	}
}
