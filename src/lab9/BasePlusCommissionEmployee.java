package lab9;

//BasePlusCommissionEmployee class declaration. 
public class BasePlusCommissionEmployee extends CommissionEmployee {
	private double baseSalary; // base salary per week
// six-argument constructor 

	public BasePlusCommissionEmployee(String first, String last, String ssn, double sales, double rate, double salary) {
		super(first,last,ssn,sales,rate);
		setBaseSalary(salary);

		System.out.printf("\n\n%s\n", this);
		//implicit call to CommissionEmployee constructor occurs here 
	} // end six-argument BasePlusCommissionEmployee constructor
	
	//set base salary 
	public void setBaseSalary(double salary) {
		baseSalary = (salary < 0.0) ? 0.0 : salary;
	} // end method setBaseSalary
	
	//return base salary 
	public double getBaseSalary() {
		return baseSalary;
	} // end method getBaseSalary

	//calculate earnings 
	public double earnings() {
		return baseSalary + super.earnings();
	} // end method earnings
	
	//return String representation of BasePlusCommissionEmployee
	public String toString() {
		return String.format("%s %s\n%s: %.2f", "base-salaried", super.toString(), "base salary", earnings());
	}
} // end class BasePlusCommissionEmployee
