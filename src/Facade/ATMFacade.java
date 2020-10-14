package Facade;

//The Facade Design Pattern decouples or separates the client 
//from all of the sub components

//The Facades aim is to simplify interfaces so you don't have 
//to worry about what is going on under the hood

public class ATMFacade {
		
	private int accountNum;
	private int securityCode;
	
	WelcomeToBank welcomeToBank;
	AccountNumChecker accountNumChecker;
	SecurityCodeChecker securityCodeChecker;
	FundsAvailableChecker fundsAvailableChecker;
	
	public ATMFacade(int accountNum, int securityCode) {
		this.accountNum = accountNum;
		this.securityCode = securityCode;
		
		this.welcomeToBank = new WelcomeToBank();
		
		this.accountNumChecker = new AccountNumChecker();
		this.securityCodeChecker = new SecurityCodeChecker();
		this.fundsAvailableChecker = new FundsAvailableChecker();
	}
	
	public void getCurrentBalance() {
		System.out.println("Current Balance: " + fundsAvailableChecker.getFundsInAccount());
		System.out.println();

	}
	
	public void withdrawCash(double cashToWithdraw) {
		if (accountNumChecker.IsValidAccNum(this.accountNum) &&
			securityCodeChecker.IsValidCode(this.securityCode) &&
			fundsAvailableChecker.AreFundsAvailable(cashToWithdraw)) {
			
			fundsAvailableChecker.decreaseCashInAccount(cashToWithdraw);
			
			System.out.println("Transaction Completed");
			System.out.println("Funds Withdrawn: " + cashToWithdraw);
			System.out.println();
			
		} else {
			
			System.out.println("Transaction Failed");
			System.out.println();

		}
	}
	
	public void depositCash(double cashToDeposit) {
		if (accountNumChecker.IsValidAccNum(this.accountNum) &&
			securityCodeChecker.IsValidCode(this.securityCode) &&
			!(cashToDeposit < 0)) {
			
			fundsAvailableChecker.increaseCashInAccount(cashToDeposit);

			System.out.println("Funds deposited " + cashToDeposit);
			System.out.println("Transaction Completed");
			System.out.println();
			
		} else {
			
			System.out.println("Transaction Failed");
			System.out.println();

		}
	}
}
