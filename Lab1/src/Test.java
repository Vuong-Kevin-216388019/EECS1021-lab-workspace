import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String one = "L";
		//String two = "L";
		
		String enter = input.nextLine();
		
		if(enter.equals(one)) {
			System.out.println("True" + (one == enter));
		}
		else {
			System.out.println("one" + (one == enter));
		}
		
		
		
		
		
		input.close();
	}

}
