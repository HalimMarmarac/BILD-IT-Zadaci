package zadaci_10_02_2016;

/*
 * Zadatak2
 * Employee class
 */

public class Employee extends Person {

	protected double salary;
	protected String office;
	protected MyDate dateHired;
	// constructor
	public Employee(String name, String address, String phoneNumber, String email, double salary, String office, MyDate dateHired) {
		super(name, address, phoneNumber, email);
		this.salary = salary;
		this.office = office;
		this.dateHired = dateHired;
	}
	/*next lines getters and setters*/
	// return salary
	public double getSalary() {
		return salary;
	}
	// set new salary
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public MyDate getDateHired() {
		return dateHired;
	}

	public void setDateHired(MyDate dateHired) {
		this.dateHired = dateHired;
	}
	// to string method returns data in string form
	public String toString() {
		return "Name: " + getName() + "  Address: " + getAddress() + "  Phone number: " + getPhoneNumber() + "  Email: "
				+ getEmail() + "  Office: " + getOffice() + "  Salary: " + getSalary() + "  Date hired: "
				+ getDateHired();
	}
}
