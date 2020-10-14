package Facade;

public class FundsAvailableChecker {
	
	// simulate existing bank account 
	private double fundsInAccount = 1000;
	
	public double getFundsInAccount() {
		return fundsInAccount;
	}
	
	public void decreaseCashInAccount(double cashToWithdraw) {
		fundsInAccount -= cashToWithdraw;
	}
	
	public void increaseCashInAccount(double cashToDeposit) {
		fundsInAccount += cashToDeposit;
	}
	
	public boolean AreFundsAvailable(double cashToWithdraw) {
		
		if (cashToWithdraw < fundsInAccount && !(fundsInAccount <= 0)) {
			return true;
		} 
		
		return false;
	}
}
