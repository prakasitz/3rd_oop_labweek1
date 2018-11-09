package lab10;

public abstract class Employee {
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	// five-argument constructor

// set first name 

	public Employee(String first, String last, String ssn) {
		// TODO Auto-generated constructor stub
		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;
	}

	public void setFirstName(String first) {
		firstName = first;
	} // end method setFirstName
// return first name 

	public String getFirstName() {
		return firstName;
	}// end method getFirstName
// set last name 

	public void setLastName(String last) {
		lastName = last;
	}

	public String getLastName() {

		return lastName;
	} // end method getLastName
		// set social security number

	public void setSocialSecurityNumber(String ssn) {
		socialSecurityNumber = ssn;
	} // should validate
		// end method setSocialSecurtyNumber
	
	// return social security number
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	} // end method getSocialSecurityNumber
	
	// set gross sales amount

	public String toString() {
		return String.format("%s %s\nsocial security number: %s", getFirstName(),
				getLastName(), getSocialSecurityNumber());
	}
	
	public abstract double earings();
	// end method toString
}
