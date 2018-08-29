package lti.pojo;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

//import lti.pojo.Customer;

public class TestCustomer {
	@Test
	public void testSaveCustomer() {
		Session session = HibernateUtil.getSession();
		Transaction txn = session.getTransaction();
		try {
			txn.begin(); // Starting db transaction
			Customer cust = new Customer();
			cust.setCustName("Abram");
			cust.setCreditLimit(50000);
			session.save(cust); // saving customer object
			txn.commit(); // ending transaction with commit
			
			Customer cust1 = new Customer();
			cust.setCustName("Govind");
			cust.setCreditLimit(1000);
			session.save(cust); // saving customer object
			txn.commit();
		} catch (Exception e) {
			txn.rollback(); // transaction failed hence rolled back
			e.printStackTrace();
		}
	}
	
	@Test
	public void testGetCustomer() {
		Session session = HibernateUtil.getSession();
		Customer cust = (Customer) session.get(Customer.class, 4);
		System.out.println("Name:"+cust.getCustName());
	}

}
