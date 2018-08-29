package lti.transactions;

public class Deposit extends Account {
	private int dId;
	private double amount;
	private double balance;
	
	private Account acnt;
	
	
	public Deposit() {
		super();
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.balance = this.balance+amount;
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
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	
	

}
