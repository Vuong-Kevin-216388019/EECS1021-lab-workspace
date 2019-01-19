import java.util.Scanner;
public class RockPaperScissorsGame2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the name of player 1");
		String p1 = input.nextLine();
		
		System.out.println("Enter the name of player 2");
		String p2 = input.nextLine();
		
		System.out.println("============");
		System.out.println("Round 1:");
		System.out.println("============");
		
		System.out.println("What does " + p1 + " play? (R, P 0r S)");
		String play1 = input.nextLine();
		
		System.out.println("What does " + p2 + " play? (R, P 0r S)");
		String play2 = input.nextLine();
		
		int player1Result = 0;
		int tieResult = 0;
		int player2Result = 0;
		
		if((play1.equals("P") && play2.equals("R")) || (play1.equals("S") && play2.equals("P")) || (play1.equals("R")  && play2.equals("S"))) {
			 player1Result = 1;
		}
		else if(play1.equals(play2)) {
			 tieResult = 1;
		}	
		else {
			 player2Result = 1;
		}
		
		System.out.println("============");
		System.out.println("Round 2:");
		System.out.println("============");
		
		System.out.println("What does " + p1 + " play? (R, P 0r S)");
		String play11 = input.nextLine();
		
		System.out.println("What does " + p2 + " play? (R, P 0r S)");
		String play22 = input.nextLine();
		
		
		if(play11.equals("P") && play22.equals("R") || play11.equals("S") && play22.equals("P") || play11.equals("R") && play22.equals("S")) {
			 player1Result = player1Result + 1;
		}
		else if(play11.equals(play22)) {
			 tieResult = tieResult + 1;
		}	
		else {
			 player2Result = player2Result + 1;
		}
		
		System.out.println("============");
		System.out.println("Round 3:");
		System.out.println("============");
		
		System.out.println("What does " + p1 + " play? (R, P 0r S)");
		String play111 = input.nextLine();
		
		System.out.println("What does " + p2 + " play? (R, P 0r S)");
		String play222 = input.nextLine();
		
		if(player1Result == 2) {
			System.out.println("Game over: " + p1 + " wins!");
		}
			else if(player2Result == 2) {
				System.out.println("Game over: " + p2 + " wins!");	
			}	
		else if(play111.equals("P") && play222.equals("R") || play111.equals("S") && play222.equals("P") || play111.equals("R") && play222.equals("S")) {
			 player1Result = player1Result + 1;
		}
		else if(play111.equals(play222)) {
			 tieResult = tieResult + 1;
		}	
		else {
			 player2Result = player2Result + 1;
		}
			
//------------------------------------------------------------------------------------------------------------------------------	
		

//------------------------------------------------------------------------------------------------------------------------------		
		


		if(player1Result > player2Result) {
			System.out.println("Game over: " + p1 + " wins!");
		}
		else if(tieResult == 3) {
			System.out.println("Game over: a tie between " + p1 + " and  " + p2);
		}
		else if(player1Result < player2Result) {
			System.out.println("Game over: " + p2 + " wins!");
		}
		else {
			System.out.println("Game over: a tie between " + p1 + " and  " + p2);
		}
		
		
		
		
		input.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
