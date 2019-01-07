import java.util.Scanner;

public class ConvertSecondsIntoMinutes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("What's your name?");
		String name = input.nextLine();
		
		
		System.out.println("Enter an integer for seconds");
		int seconds = input.nextInt();
		input.nextLine();
		
		
		double minutes = seconds / 60;
		double secondss = seconds % 60;
		
		
		System.out.println(name + ", your input is " + seconds + " seconds can be divided into " + minutes + " minutes and " + secondss + " seconds");
		
		input.close();
	}

}
