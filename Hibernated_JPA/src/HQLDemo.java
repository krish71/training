import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import lti.pojo.Customer;
import lti.util.HibernateUtil;

public class HQLDemo {

	public static void main(String args[]) {
		Session session = HibernateUtil.getSession();

		String hql = "from customer";
		Query query = session.createQuery(hql);
		List<Customer> customers = query.list();

		for (Customer cust : customers)
			System.out.println(cust.getCustId() + "\t" + cust.getCustName());

	}

}
