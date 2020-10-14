package Facade;

public class Main {

	public static void main(String[] args) {
		
		ATMFacade atmFacade = new ATMFacade(123456, 5678);
		
		atmFacade.getCurrentBalance();
		
		atmFacade.withdrawCash(1200);
		atmFacade.withdrawCash(500);
		
		atmFacade.getCurrentBalance();
		
		atmFacade.depositCash(500);
		
		atmFacade.getCurrentBalance();
	}

}
