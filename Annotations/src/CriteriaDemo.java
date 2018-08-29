import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import lti.pojo.Customer;
import lti.pojo.HibernateUtil;

public class CriteriaDemo {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSession();
		Criteria criteria =session.createCriteria(Customer.class);
		
	criteria.add(Restrictions.between("creditLimit", 1000.0, 50000.0));
	criteria.add(Restrictions.like("custName", "Abrah%"));
		List<Customer> customers=criteria.list();
		for(Customer cust :customers)
			System.out.println(cust.getCustName()+"\t" +cust.getCreditLimit());
				
	
	}

}
