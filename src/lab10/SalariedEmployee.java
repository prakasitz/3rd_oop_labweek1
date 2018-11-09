package lab10;

public class SalariedEmployee extends Employee {
	private double weeklySalary;
	public SalariedEmployee(String first, String last, String ssn, double salary) {
		super(first, last, ssn);
		setWeeklySalary(salary);
		// TODO Auto-generated constructor stub
	}
	
	public void setWeeklySalary(double salary) {
		weeklySalary = (salary < 0.0) ? 0.0 : salary;
	} // end method setBaseSalary
	
	//return base salary 
	public double getWeeklySalary() {
		return weeklySalary;
	} // end method getBaseSalary

	
	//return String representation of BasePlusCommissionEmployee
	public String toString() {
		return String.format("salaried employee: %s\n%s: $%,.2f", super.toString(), "weekly salary", getWeeklySalary());
	}

	@Override
	public double earings() {
		// TODO Auto-generated method stub
		return getWeeklySalary();
	}

}
