import java.util.Scanner;
public class Combinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the 1st string:");
		String one = input.nextLine();
				
		System.out.println("Enter the 2nd string:");
		String two = input.nextLine();
		
		System.out.println("Enter the 3rd string:");
		String three = input.nextLine();
		
		System.out.println("Enter the 4th string:");
		String four = input.nextLine();
		
		System.out.println("Enter the 1st integer:");
		int number1 = input.nextInt();
		
		System.out.println("Enter the 2nd integer:");
		int number2 = input.nextInt();
		
		System.out.println("Enter the 3rd integer:");
		int number3 = input.nextInt();
		
		System.out.println("Enter the 4th integer:");
		int number4 = input.nextInt();
		
		
		System.out.println("Here are all 16 possible combinations:");
		System.out.println("(" + one + ", " + number1 + ")");
		System.out.println("(" + one + ", " + number2 + ")");
		System.out.println("(" + one + ", " + number3 + ")");
		System.out.println("(" + one + ", " + number4 + ")");
		
		System.out.println("(" + two + ", " + number1 + ")");
		System.out.println("(" + two + ", " + number2 + ")");
		System.out.println("(" + two + ", " + number3 + ")");
		System.out.println("(" + two + ", " + number4 + ")");
		
		System.out.println("(" + three + ", " + number1 + ")");
		System.out.println("(" + three + ", " + number2 + ")");
		System.out.println("(" + three + ", " + number3 + ")");
		System.out.println("(" + three + ", " + number4 + ")");

		System.out.println("(" + four + ", " + number1 + ")");
		System.out.println("(" + four + ", " + number2 + ")");
		System.out.println("(" + four + ", " + number3 + ")");
		System.out.println("(" + four + ", " + number4 + ")");
		
		
		
		
		
	}

}
