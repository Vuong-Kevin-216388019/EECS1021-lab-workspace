import java.util.Scanner;

public class GenerateFibSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String choice = "Y";
		while(choice.equals("Y")) {
			System.out.println("Enter the size of the Fibonacci sequence:");
			int size = input.nextInt();
			
			if(size >= 1) {
				int[] fibArray = new int [size];
				int a = 0;
				int b = 1;
				fibArray[0] = 1;
				for(int i = 1; i < fibArray.length; i ++) {
					fibArray[i] = a + b;
					a = b;
					b = fibArray[i];
				}
				System.out.print("< ");
				for(int k = 0; k < fibArray.length - 1; k++) {
					System.out.print(fibArray[k] + ", ");
				}
				System.out.println(fibArray[fibArray.length - 1] + " >");
				System.out.println("Would you like to continue? (Y/N)");
				choice = input.next();
			}
			else {
				System.out.println("Error: Fibonnaci sequence must have size >= 1");
				System.out.println("Would you like to continue? (Y/N)");
				choice = input.next();
			}
			
			
		}
		System.out.println("Bye");
		
		
		input.close();
	}

}
