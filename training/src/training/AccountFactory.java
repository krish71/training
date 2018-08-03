package training;

public final class AccountFactory {
	private AccountFactory(){
		
	}
	
	public static Bank openAccount(String type, String holder) {
		Bank acnt = null;
		if (type.equalsIgnoreCase("savings"))
			acnt = new Savings(holder);
		else
			acnt = new Currents(holder);
		return acnt;
	}
}
