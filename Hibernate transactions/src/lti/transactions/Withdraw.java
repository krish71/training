package lti.transactions;

public class Withdraw {
	private int wId;
	private double amount;
	private double balance;
	
	private Account acnt;

	public int getwId() {
		return wId;
	}

	public void setdId(int wId) {
		this.wId = wId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Account getAcnt() {
		return acnt;
	}

	public void setAcnt(Account acnt) {
		this.acnt = acnt;
	}
	
	

}
