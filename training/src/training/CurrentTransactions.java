package training;

public class CurrentTransactions extends Transactions {
	private double overdraft;

	public CurrentTransactions() {

	}

	public CurrentTransactions(String string, double balance, double balance2, double od) {
		super(string, balance, balance2);
		this.overdraft = od;
	}

	public String toString() {
		return "type:" + type + "Amount" + amount + "balance" + balance + "Overdraft" + overdraft;
	}

}
