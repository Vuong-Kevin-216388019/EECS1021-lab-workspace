import java.util.Scanner;

public class ComputeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String name = input.nextLine();
		System.out.println(name + ", enter your filing status (1 - Single filing; 2 - Married Filing):");
		double status = input.nextInt();
		
		double income = 0;
		if(status == 1 || status == 2) {
			System.out.println(name + ", enter your taxable income");
			income = input.nextDouble();
		}	
	//		if(status = 1 && (income > 0 || income < 8350)) {
				System.out.println();
		}
		
		
			
			
			
			
		//else{
				//System.out.println("Illegal status:" + status);
		//}
		
		
		
	//	System.out.println("Illegal status:" + status);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//input.close();
	}

//}
