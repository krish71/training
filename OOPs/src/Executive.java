
public class Executive extends Employee {
	private double bonus;
	
	public Executive() {
	}
	
	public Executive(String empName, double salary, double bonus) {
		super(empName, salary);
		this.bonus= bonus;
	}

	@Override
	public void payslip() {
		// TODO Auto-generated method stub
		super.payslip();
		System.out.println("Bonus: " + bonus);
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary() + bonus;
		
	}
	
}
