package zadaci_10_02_2016;

/*
 * Zadatak2
 * Student class
 */

public class Student extends Person {

	public static final String FRESHMAN = "Freshman";
	public static final String SOPHOMORE = "Sophomore";
	public static final String JUNIOR = "Junior";
	public static final String SENIOR = "Senior";

	protected String status;

	// constructor...
	public Student(String name, String address, String phoneNumber, String email, String status) {
		super(name, address, phoneNumber, email);
		this.status = status;
	}
	// return status
	public String getStatus() {
		return status;
	}
	// set status
	public void setStatus(String status) {
		this.status = status;
	}
	//...
	public String toString() {
		return "Name: " + getName() + "  Address: " + getAddress() + "  Phone number: " + getPhoneNumber() + "  Email: "
				+ getEmail() + "  Status: " + getStatus();
	}

}
