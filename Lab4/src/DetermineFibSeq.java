import java.util.Scanner;

public class DetermineFibSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int[] fibArray = new int [20];
		String choice  = "Y";
		int counter = 0;
		
		// while the choice of user is Y, user will continue to be prompted for numbers
		while(choice.equals("Y")) {
			counter = 0;
			Boolean fibCheck = true;

			// asks for values up to a maximum of 20 numbers and counter is counting how many are entered
			for(int i = 0; i < fibArray.length; i ++) {
					System.out.println("Enter a positive integer value, or -1 to stop");
					fibArray[i] = input.nextInt();
					counter ++;
				
				// if most recent value entered is -1 then determining fib sequence will begin and conditions based on size will begin
				if(fibArray[i] == -1) {
					if(counter == 2 && fibArray[0] == 1) {
						System.out.println("The sequence < 1 > is from the fibonnaci sequence");
					}
					else if(counter == 3 && fibArray[1] + fibArray[0] == 2) {
						System.out.println("The sequence < 1, 1 > is from the fibonnaci sequence");
					}
					else {
						if(fibArray[0] == 1 && fibArray[1] == 1) {
							for(int k = 2; k < counter - 1 && fibCheck; k ++) {
								fibCheck = fibArray[k] > 0 && (fibArray[k] == fibArray[k - 1] + fibArray[k - 2]);
							}
							if(fibCheck == true) {
								
								System.out.print("The sequence you entered < ");
								for(int j = 0; j < counter - 1; j ++) {
									System.out.print(fibArray[j] + ", ");
								}
								System.out.println(">");
								System.out.println("is the first " + (counter - 1) + " numbers of the fibonnaci sequence");
							}
							
						}
						else {
							System.out.println("This is not a fib sequence");
						}
					}
					System.out.println("Do you want to enter another sequence? (Y/N)");
					choice = input.next();
					break;
				}
				
			}
		}
		
		System.out.println("Bye!");
		
		
		
		input.close();
	}

}
