package lti.transactions;

import java.util.HashSet;
import java.util.Set;


public class Account {

	private int accountNo;
	private String name;
	private double initBalance;

	//private Set<Deposit> deposit = new HashSet<Deposit>();

	public Account() {
		super();
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getInitBalance() {
		return initBalance;
	}

	public void setInitBalance(double initBalance) {
		this.initBalance = initBalance;
	}

//	public Set<Deposit> getDeposit() {
//		return deposit;
//	}
//
//	public void setDeposit(Set<Deposit> deposit) {
//		this.deposit = deposit;
//	}

	
}
