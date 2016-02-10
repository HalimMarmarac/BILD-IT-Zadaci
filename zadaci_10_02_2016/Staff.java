package zadaci_10_02_2016;

/*
 *  Zadatak2
 *  Staff class
 */

public class Staff extends Employee {

	protected String title;
	// constructor...
	public Staff(String name, String address, String phoneNumber, String email, double salary, String office, MyDate dateHired, String title) {
		super(name, address, phoneNumber, email, salary, office, dateHired);
		this.title = title;
	}

	/*getters and setters*/
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	// ...
	public String toString() {
		return "Name: " + getName() + "  Address: " + getAddress() + "  Phone number: " + getPhoneNumber() + "  Email: "
				+ getEmail() + "  Office: " + getOffice() + "  Salary: " + getSalary() + "  Date hired: "
				+ getDateHired() + "  Title: " + getTitle();
	}

}
