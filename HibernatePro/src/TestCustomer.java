import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.pojo.Customer;
import lti.util.HibernateUtil;

public class TestCustomer {
	@Test
	public void testSaveCustomer() {
		Session session = HibernateUtil.getSession();
		Transaction txn = session.getTransaction();
		try {
			txn.begin(); // Starting db transaction
			Customer cust = new Customer();
			cust.setCustName("Mojo");
			cust.setCreditLimit(5000);
			session.save(cust); // saving customer object
			txn.commit(); // ending transaction with commit
		} catch (Exception e) {
			txn.rollback(); // transaction failed hence rolled back
			e.printStackTrace();
		}
	}
	
	@Test
	public void testGetCustomer() {
		Session session = HibernateUtil.getSession();
		Customer cust = (Customer) session.get(Customer.class, 9);
		System.out.println("Name:"+cust.getCustName());
	}

}
