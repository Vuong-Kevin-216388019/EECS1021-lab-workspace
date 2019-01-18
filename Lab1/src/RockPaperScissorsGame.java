import java.util.Scanner;
public class RockPaperScissorsGame {

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
		
		System.out.println("============");
		System.out.println("Round 2:");
		System.out.println("============");
		
		System.out.println("What does " + p1 + " play? (R, P 0r S)");
		String play11 = input.nextLine();
		
		System.out.println("What does " + p2 + " play? (R, P 0r S)");
		String play22 = input.nextLine();
		
		System.out.println("============");
		System.out.println("Round 3:");
		System.out.println("============");
		
		System.out.println("What does " + p1 + " play? (R, P 0r S)");
		String play111 = input.nextLine();
		
		System.out.println("What does " + p2 + " play? (R, P 0r S)");
		String play222 = input.nextLine();
		
/**		counting wins from the first round by comparing player 1 to player 2, if player one wins then counter will go up by one but if there 
		is a tie, a tie counter will have value of one and lastly everything else will increase player 2's winning counter by one 
*/
		int player1Result1 = 0;
		int tieResult1 = 0;
		int player2Result1 = 0;
		
		if(play1.equals("R") && play2.equals("P") || play1.equals("S") && play2.equals("P") || play1.equals("P")  && play2.equals("R")) {
			 player1Result1 = 1;
		}
		else if(play1.equals(play2)) {
			 tieResult1 = 1;
		}	
		else {
			 player2Result1 = 1;
		}
		
		
//------------------------------------------------------------------------------------------------------------------------------	
		int player1Result2 = 0;
		int tieResult2 = 0;
		int player2Result2 = 0;
		
		if(play11 == "R" && play22 == "P" || play11 == "S" && play22 == "P" || play11 == "P" && play22 == "R") {
			 player1Result2 = 1;
		}
		else if(play11 == play22) {
			 tieResult2 = 1;
		}	
		else {
			 player2Result2 = 1;
		}
		

//------------------------------------------------------------------------------------------------------------------------------		
		int player1Result3 = 0;
		int tieResult3 = 0;
		int player2Result3 = 0;
		
		if(play111 == "R" && play222 == "P" || play111 == "S" && play222 == "P" || play111 == "P" && play222 == "R") {
			 player1Result3 = 1;
		}
		else if(play111 == play222) {
			 tieResult3 = 1;
		}	
		else {
			 player2Result3 = 1;
		}

//		comapres the final results, if player1Results
		int finalResult1 = player1Result1 + player1Result2 + player1Result3;
		int finalResult2 = player2Result1 + player2Result2 + player2Result3;
		int finalTieResult = tieResult1 + tieResult2 + tieResult3;
		
		if(finalResult1 > finalResult2) {
			System.out.println("Game over: " + p1 + " wins!");
		}
		else if(finalTieResult == 3) {
			System.out.println("Game over: a tie between " + p1 + " and  " + p2);
		}
		else if(finalResult1 < finalResult2) {
			System.out.println("Game over: " + p2 + " wins!");
		}
		else {
			System.out.println("Game over: a tie between " + p1 + " and  " + p2);
		}
		
		
		
		
		input.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
