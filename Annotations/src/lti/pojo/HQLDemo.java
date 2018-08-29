package lti.pojo;

import java.util.List;

import javax.persistence.NamedQuery;

import org.hibernate.Query;
import org.hibernate.Session;

import lti.pojo.Customer;

public class HQLDemo {

	public static void main(String args[]) {
		Session session = HibernateUtil.getSession();

//		String hql = "from customer";
//		Query query = session.createQuery(hql);
//		List<Customer> customers = query.list();

//		for (Customer cust : customers)
//			System.out.println(cust.getCustId() + "\t" + cust.getCustName());
		
//		List<Customer> customers = session.createQuery("from Customer where creditLimit>2000").list();
//		
//		for(Customer cust : customers)
//			System.out.println(cust.getCustId() + "\t" + cust.getCustName());
//		Customer cust =(Customer) session.createQuery("from Customer where custId=50").uniqueResult();
//		System.out.println(cust.getCustId()+"\t"+cust.getCustName());
		
//		
//		Query query = session.createQuery("from Customer where custName=:cname");
//		query.setString("cname", "Abram");
//		Customer cust =(Customer)query.uniqueResult();
//		System.out.println(cust.getCustId()+"\t"+cust.getCustName());
//		
		Query query = session.getNamedQuery("getAllCust");
		for(Customer cust:(List<Customer>)query.list())
			System.out.println(cust.getCustId()+"\t"+cust.getCustName());
		
	}

}
