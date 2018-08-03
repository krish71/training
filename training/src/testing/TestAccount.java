package testing;

import training.*;

public class TestAccount {

	public static void main(String[] args) {

		Bank sav = AccountFactory.openAccount("Savings", "Ramsay");
		sav.summary();

		sav.deposit(2000);
		sav.deposit(4000);
		sav.deposit(3000);
		sav.deposit(7000);

		sav.statement();

		Bank cur = AccountFactory.openAccount("Currents", "Ramsay");
		cur.summary();

		cur.currentstatement();

		cur.deposit(3000);
		try {
			cur.withdraw(7000);
			cur.withdraw(7000);
			cur.withdraw(1600);
			// System.exit(0);
		} catch (BalanceException e) {
			// e.printStackTrace(); //for developers to trouble shoot
			// System.out.println(e);//for logging purpose to audit
			System.out.println(e.getMessage());// for end users
		}
		// finally {
		// System.out.println("Finally executed.");
		// }
		//
		cur.deposit(2000);
		cur.currentstatement();
		//
	}

}