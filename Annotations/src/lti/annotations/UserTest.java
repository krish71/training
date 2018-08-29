package lti.annotations;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

public class UserTest {

	Session session = HibernateUtil.getSession();
	Transaction tx = session.beginTransaction();

	@Test
	public void testCase() {
		User u = new User();
		u.setFirstname("Polo");
		u.setLastname("Mint");
		u.setUsername("polo");
		u.setPassword("polo123");

		Address address = new Address();
		address.setCity("Mumbai");
		address.setStreet("Powai");
		address.setZipcode("400083");

		u.setAddress(address);
		address.setUser(u);

		session.save(u);
		tx.commit();
	}
}
