import java.util.Scanner;

public class ComputeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String name = input.nextLine();
		System.out.println(name + ", enter your filing status (1 - Single filing; 2 - Married Filing):");
		int status = input.nextInt();
		
		
		if(status != 1 && status != 2) {
			System.out.println("Illegal status: " + status);
		}	
		else if(status == 1) {
			System.out.println(name + ", enter your taxable income:");
			double singleTax1 = 835;
			double singleFinalTax = 0;
			double singleIncome = input.nextDouble();
				if(singleIncome > 0 && singleIncome <= 8350) {
					singleTax1 = singleIncome * 0.1;
					System.out.println(name + ", you should pay $" + singleTax1);
					System.out.println("Calculation is based on the scheme of Single Filing:");
					System.out.println("Part I: $" + singleTax1);
				}
				else if(singleIncome > 8350 && singleIncome <= 33950) {
					double singleTax2 = (singleIncome - 8350) * 0.15;
					singleFinalTax = singleTax2 + singleTax1;	
					System.out.println(name + ", you shoudl pay $" + singleFinalTax);
					System.out.println("Calculation is based on the scheme of Married Filing:");
					System.out.println("Part I: $" + singleTax1);
					System.out.println("Part II: $" + singleTax2);
				}
				else {
					double singleTax3 = (singleIncome - 33950) * 0.25;
					double singleTax2 = (33950 - 8350) * 0.15;
					singleFinalTax = singleTax1 + singleTax2 + singleTax3;
					System.out.println(name + ", you shoudl pay $" + singleFinalTax);
					System.out.println("Calculation is based on the scheme of Married Filing:");
					System.out.println("Part I: $" + singleTax1);
					System.out.println("Part II: $" + singleTax2);
					System.out.println("Part III: $" + singleTax3);
				}
					
		}
		else {
			System.out.println(name + ", enter your taxable income:");
			double marriedIncome = input.nextDouble();
			double marriedTax1 = 1670;
			double marriedFinalTax = 0;
				if(marriedIncome > 0 && marriedIncome <= 16700){
					marriedTax1 = marriedIncome * 0.10;
					System.out.println(name + ", you should pay $" + marriedTax1);
					System.out.println("Calculation is based on the scheme of Married Filing:");
					System.out.println("Part I: $" + marriedTax1);
				}
				else if(marriedIncome > 16700 && marriedIncome <= 67900) {
					double marriedTax2 = (marriedIncome - 16700) * 0.15;
					marriedFinalTax = marriedTax2 + marriedTax1;
					System.out.println(name + ", you shoudl pay $" + marriedFinalTax);
					System.out.println("Calculation is based on the scheme of Married Filing:");
					System.out.println("Part I: $" + marriedTax1);
					System.out.println("Part II: $" + marriedTax2);
				}
				else {
					double marriedTax2 = (67900 - 16700) * 0.15;
					double marriedTax3 = (marriedIncome - 67900) * 0.25;
					marriedFinalTax = marriedTax2 + marriedTax3 + marriedTax1;
					System.out.println(name + ", you shoudl pay $" + marriedFinalTax);
					System.out.println("Calculation is based on the scheme of Married Filing:");
					System.out.println("Part I: $" + marriedTax1);
					System.out.println("Part II: $" + marriedTax2);
					System.out.println("Part III: $" + marriedTax3);
				}
		}
		
		
		
		
		
		
			
		
		input.close();
	
	}
	
}