import java.util.Scanner;

public class ComputePerimeterAndAreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer for radius");
		int radius = input.nextInt();
		input.nextLine();
		
		System.out.println("What's your name?");
		String name = input.nextLine();
		
		
		double perimeter = 2 * 3.14 * radius;
		double area = 3.14 * Math.pow(radius, 2); 
		
		
		System.out.println(name + ", your input circle with radius " + radius + " has a perimeter " + perimeter + " and area " + area);
		
		input.close();
		
	}

}
