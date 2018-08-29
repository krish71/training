import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.annotations.HibernateUtil;

public class TestOrder {
	Session session = HibernateUtil.getSession();
	Transaction tx = session.beginTransaction();
	
	@Test
	public void testCase() {
		Orders o = new Orders();
		o.setId(1);
		Date setorderDate = new Date();
		o.setOrderDate(setorderDate);
		o.setAmount(1000);
		o.setPromoCode("ABCD");
		session.save(o);
		tx.commit();
		
	}
	
	@Test
	public void testCase1() {
		Orders o = new Orders();
		int id=o.getId();
		Date setorderDate = new Date();
		Date b = o.getOrderDate();
		double x = o.getAmount(); 
		String q = o.getPromoCode();
		
		System.out.println(id +"\t"+ setorderDate+"\t" + b+"\t"+x+"\t" + q);
		
	}
}
