package training;

public class Currents extends Account {
	private double od = OVERDRAFT_AMT;

	public Currents() {

	}

	public Currents(String holder) {
		super("Ramsay", INIT_CUR_BAL);
	}

	@Override
	public void summary() {
		super.summary();
		System.out.println("Overdarft: " + od);
	}

	@Override
	public void withdraw(double amount) throws BalanceException {
		if (amount <= (balance + od) && amount <= super.balance) {
			super.balance -= amount;
			curtxns[index++] = new CurrentTransactions("db",amount,balance,od);
		}
		else if (amount <= (balance + od) && amount > super.balance) {
			amount = amount - super.balance;
			od = od - amount;
			super.balance = MIN_CUR_BAL;
			curtxns[index++] = new CurrentTransactions("Cr",amount,balance,od);
		} else
			throw new BalanceException("Insufficient funds!");
	}

	@Override
	public void deposit(double amount) {
		if (amount > (OVERDRAFT_AMT - od)) {
			amount = amount - (OVERDRAFT_AMT - od);
			od = od + (OVERDRAFT_AMT - od);
			balance = balance + amount;
			curtxns[index++] = new CurrentTransactions("OD",amount,balance,od);
		} else
			{od = od + amount;
		    curtxns[index++] = new CurrentTransactions("Cr",amount,balance,od);}
	}

}
