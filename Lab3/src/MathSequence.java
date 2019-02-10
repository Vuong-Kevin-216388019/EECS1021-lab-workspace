import java.util.Scanner;

public class MathSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); 
		
		System.out.println("What kind of processing task would you like to perform?");
		System.out.println("1: Generate an arithmetic sequence.");
		System.out.println("2: Generate a geometric sequence.");
		System.out.println("3: Determine an arithmetic sequence.");
		int perform = input.nextInt();
		String choice = "Y";
		int sum = 0;
		
		while(choice.equals("Y")) {
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
			
		}
		else if(perform == 3) {
			System.out.println("Enter a new number:");
			
			
			
			
			
		}
		else
			System.out.println("Error: task number must be 1, 2 or 3.");
		
		}
		System.out.println("Bye!");
		
		
		
		input.close();
		
	}

}
