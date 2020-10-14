package Facade;

public class SecurityCodeChecker {

	// simulation of valid security code
	private int validCode = 5678;
	
	public boolean IsValidCode(int codeToChekc) {
		
		if (codeToChekc == validCode) {
			return true;
		}
		
		return false;
	}
}
