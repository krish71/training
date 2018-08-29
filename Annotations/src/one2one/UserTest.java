package one2one;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

//import lti.util.HibernateUtil;

public class UserTest {

	Session session = HibernateUtil.getSession();
	Transaction tx = session.beginTransaction();

	@Test
	public void testCase() {
		User u = new User();
		u.setFirstname("rosemerta");
		u.setLastname("kon");
		u.setUsername("roso");
		u.setPassword("roso123");

		Address address = new Address();
		address.setCity("Hogsmeade");
		address.setStreet("threebroomsticks");
		address.setZipcode("400644");

		u.setAddress(address);
		address.setUser(u);

		session.save(u);
		tx.commit();
	}
}
