
public class TestEmployee {

	public static void main(String[] args) {
//		Employee e1 = new Employee("Polo", 5000);
//		e1.payslip();
		Manager mgr = new Manager("lilli", 7000, 2000);
		showSalary(mgr);
		Executive exc = new Executive("Pinto", 5000, 6000);
		showSalary(exc);

	}

	private static void showSalary(Employee emp) {
		if (emp instanceof Manager)
			System.out.println("Manager Salary:" + emp.getSalary());
		else
			System.out.println("Executive salary: " + emp.getSalary());
	}

	// private static void showSalary(Executive exc) {
	// System.out.println("Executive salary: " + exc.getSalary());
	// }
	//
	// private static void showSalary(Manager mgr) {
	// System.out.println("Manager salary: " + mgr.getSalary());
	//
	// }

}
