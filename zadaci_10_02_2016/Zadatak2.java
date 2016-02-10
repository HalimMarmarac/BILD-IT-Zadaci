package zadaci_10_02_2016;

import zadaci_10_02_2016.Employee;
import zadaci_10_02_2016.Faculty;
import zadaci_10_02_2016.Person;
import zadaci_10_02_2016.Staff;
import zadaci_10_02_2016.Student;
import zadaci_10_02_2016.MyDate;

public class Zadatak2 {

	public static void main(String[] args) {
		// creating new object for each class
		Person person = new Person("Person1", "address1", "01234567", "person1@gmail.com");
		Student student = new Student("Student1", "address2", "00124588", "student1@gmail.com", "Sophomore");
		Employee employee = new Employee("Employee1", "address3", "45214544", "employee1@gmail.com", 1200, "Office1",(new MyDate(2015, 3, 20)));
		Faculty faculty = new Faculty("FacultyMember1", "address4", "452525688", "faculty1@gmail.com", 1500, "Office7",(new MyDate(2010, 5, 12)), "h7-16", "Professor");
		Staff staff = new Staff("StaffMember1", "address5", "124587900", "staff1@gmail.com", 800, "Office9",(new MyDate(2015, 3, 20)), "janitor");
		// printing data oabout each object with ther toString methods
		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());

	}

}
