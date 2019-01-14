import java.util.Scanner;
public class LogicalOperationApp3a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer that is not between 1 and 10:");
		int i = input.nextInt();
		boolean isNotBetween1and10 = i < 10 || i > 10;
		System.out.println("The number you entered " + i + " is not between 1 and 10: " + isNotBetween1and10);
		
		input.close();
	}

}
