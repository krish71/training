package training.reflect;

import java.security.BasicPermission;

public class Customer {
	private String name;
	public Customer() {
		
	}

	public Customer(String name) {
		this.name = name;
	}

	private void print() {
		SecurityManager mgr = new SecurityManager();
		mgr.checkPermission( new BasicPermission("Stay Away ") {});
		System.out.println("Name:"+name);
	}

	@Override
	public String toString() {
		return "name:\t"+name;
	}
	

}
