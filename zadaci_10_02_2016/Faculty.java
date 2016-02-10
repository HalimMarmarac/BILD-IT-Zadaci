package zadaci_10_02_2016;

/*
 * Zadatak2 
 * Faculty class
 */

public class Faculty extends Employee {
	// rank
	public static String LECTURER = "Lecturer";
	public static String ASSISTANT_PROFESSOR = "Assistant Professor";
	public static String ASSOCIATE_PROFESSOR = "Associate Professor";
	public static String PROFESSOR = "Professor";

	protected String officeHours;
	protected String rank;
	// constructor
	public Faculty(String name, String address, String phoneNumber, String email, double salary, String office, MyDate dateHired, String officeHours, String rank) {
		super(name, address, phoneNumber, email, salary, office, dateHired);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	/*getters and setters*/
	public String getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
	// to string...
	public String toString() {
		return "Name: " + getName() + "  Address: " + getAddress() + "  Phone number: " + getPhoneNumber() + "  Email: "
				+ getEmail() + "  Office: " + getOffice() + "  Salary: " + getSalary() + "  Date hired: "
				+ getDateHired() + "  Rank: " + getRank() + "  Office hours: " + getOfficeHours();
	}
	
}
