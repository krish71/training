package lti.transactions;
import org.junit.Test;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TestAccount {
	Account a1 = new Account();
	
	@Test
	public void addAccount() 
	{
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		
		a1.setAccountNo(10024);
		a1.setName("Majrul");
		a1.setInitBalance(1000);
		session.save(a1);
		tx.commit();
		
	}
	
	@Test
	public void addDeposit() {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		Deposit d1 = new Deposit();
		d1.setAcnt(a1);
		d1.setAmount(5000);
		System.out.println(d1.getBalance());
	}

}
