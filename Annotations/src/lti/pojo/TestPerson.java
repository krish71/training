package lti.pojo;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.pojo.Person;


public class TestPerson {
	
	@Test
	public void testSavePerson() {
		Session session = HibernateUtil.getSession();
		Transaction txn = (Transaction) session.beginTransaction();
		
		Person p = new Person(new Person.Id("Bangladesh", 19873), "David" ,51);
		session.save(p);
		
		txn.commit();
	}
}
