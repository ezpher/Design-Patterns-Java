package Facade;

public class AccountNumChecker {
	
	// simulation of valid account number
	private int validAccNumFormat = 123456;
	
	public boolean IsValidAccNum(int accNumToCheck) {
		
		if (accNumToCheck == validAccNumFormat) {
			return true;
		}
		
		return false;
	}
}
