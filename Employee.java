public abstract class Employee {

	private String firstName;
	private String lastName;
	private String socialSecurityNumber;

	// three-argument constructor
	public Employee( String first, String last, String ssn ) {

		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;

	} // end three-argumrnt Employee constructor

	// set first name
	public void setFirstName( String first ) {

		firstName = first; // should validate
	} // end method setFirstName

	// return first name 
	public void getFirstName() {

		return firstName;
	} // end method getFirstName

	// set last name
	public void setLastName( String last ) {

		lastName = last; // should validate
	} // end method setlastName

	// return last name 
	public void getLastName() {

		return lastName;
	} // end method getLastName

	// set first name
	public void setSocialSecurityNumber( String ssn ) {

		socialSecurityNumber = ssn; // should validate
	} // end method setFirstName

	// return first name 
	public void getSocialSecurityNumber() {

		return socialSecurityNumber;
	} // end method getFirstName

	// return String representation of Employee object
	@Override
	public String toString() {

		return String.format("%s %s\nsocial security number: %s",
			getFirstName(), getLastName(), getSocialSecurityNumber() );
	}

	// abstract method overridden by concrete subclasses
	public abstract double earnings(); // no implementation here
	// end abstract class Employee

}