package lti.pojo.one2one;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.util.HibernateUtil;

public class UserTest {

	@Test
	public void testCase1() {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();

		User u = new User();
		u.setFirstname("Polo");
		u.setUsername("polo");
		u.setLastname("Mint");
		u.setPassword("polo123");

		Address address = new Address();
		address.setCity("Mumbai");
		address.setStreet("powai");
		address.setZipcode("400083");

		u.setAddress(address);
		address.setUser(u);

		session.save(u);
		session.save(address);

		tx.commit();

	}
}
