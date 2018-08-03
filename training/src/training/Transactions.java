package training;

public class Transactions {
	protected  String type;
	protected  double amount;
	protected  double balance;

	public Transactions() {

	}

	public Transactions(String type, double amount, double balance) {
		this.type = type;
		this.amount = amount;
		this.balance = balance;
	}

	public String toString() {
		return "type:" + type + "Amount" + amount + "balance" + balance;
	}

}
