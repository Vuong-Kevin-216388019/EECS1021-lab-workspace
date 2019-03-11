package Account;

public class Account {
	
	String name;
	char typeAccount;
	double balance;
	
	Account(String name, char typeAccount, double balance){
		this.name = name;
		this.typeAccount = typeAccount;
		this.balance = balance;
	}
	
	Account(String name, char typeAccount){
		this.name = name;
		this.typeAccount = typeAccount;
	}
	
	double getBalance() {
		double balance = 0;
				
		balance = this.balance;
		
		return balance;
	}
	
	
	String getDescription() {
		String description = "";
		if(this.typeAccount == 'i') {
			description = "International account: with owner " + this.name + " has current balance $" + this.balance;
		}
		else {
			description = "Domestic account: with owner " + this.name + " has current balance $" + this.balance;
		}
		
		return description;
	}
	
	
	double setBalance(double setAmount) {
		//double set = 0;
		
		this.balance = setAmount;
		
		return this.balance;
	}
	
	double deposit(double amountDeposit) {
		double deposit = 0;
		
		if(this.typeAccount == 'i') {
			deposit = amountDeposit * 0.9;
			this.balance = this.balance + deposit;
		}
		else {
			this.balance = this.balance + amountDeposit;
		}
		
		
		return this.balance;
	}
	
	
	double withdraw(double amountWithdraw) {
		double withdraw = 0;
		
		if(this.typeAccount == 'i') {
			withdraw = amountWithdraw * 1.10;
			this.balance = this.balance - withdraw;
		}
		else {
			this.balance = this.balance - amountWithdraw;
		}
		
		
		return this.balance;
	}
	
	void transferTo(Account other, double amountTransfer) {
		
		
		if(this.typeAccount == 'i' && other.typeAccount == 'i') {
			this.balance = this.balance - amountTransfer * 1.10;
			other.balance = other.balance + amountTransfer * 0.9;
			
		}
		else if(this.typeAccount == 'd' && other.typeAccount == 'd') {
			this.balance = this.balance - amountTransfer;
			other.balance = other.balance + amountTransfer;
		}
		else if(this.typeAccount == 'd' && other.typeAccount == 'i') {
			this.balance = this.balance - amountTransfer;
			other.balance = other.balance + amountTransfer * 0.9;
		}
		else {
			this.balance = this.balance - amountTransfer * 1.10;
			other.balance = other.balance + amountTransfer;
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
