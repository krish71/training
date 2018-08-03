package training;

/**
 * This class represent general bank account
 * 
 * @author Nilesh and Krishna
 * @version 1.0
 */
public abstract class Account implements Bank {
	private int acntNo;
	private String holder;
	protected double balance;

	private static int autogen = INIT_ACNT_NO;
	protected double od = OVERDRAFT_AMT;
	protected Transactions[] txns;
	protected int idx;

	public CurrentTransactions[] curtxns;
	protected int index;

	public Account() {

	}

	public Account(String holder, double balance) {
		this.acntNo = autogen++;
		this.holder = holder;
		this.balance = balance;

		txns = new Transactions[10];

		txns[idx++] = new Transactions("OB", balance, balance);

		curtxns = new CurrentTransactions[10];
		curtxns[index++] = new CurrentTransactions("OB", balance, balance, od);

	}

	public void summary() {
		System.out.println("A/c No" + acntNo);
		System.out.println("Holder:" + holder);
		System.out.println("Balance:" + balance);
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
		txns[idx++] = new Transactions("Cr", amount, balance);
	}

	public void withdraw(double amount) throws BalanceException {
	}

	public void statement() {
		System.out.println("Statement of A/c:" + acntNo);
		for (int i = 0; i < idx; i++) {
			System.out.println(txns[i]);
		}
	}

	public void currentstatement() {
		System.out.println("Statement of current A/c:" + acntNo);
		for (int i = 0; i < index; i++) {
			System.out.println(curtxns[i]);
			System.out.println("hello");
		}
	}
}
