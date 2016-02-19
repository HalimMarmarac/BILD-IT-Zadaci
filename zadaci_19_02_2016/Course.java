package zadaci_19_02_2016;

/*
 * Course class
 */

public class Course implements Cloneable {
	private String courseName;
	private String[] students = new String[10];
	private int numberOfStudents;
	// constructor for course class
	public Course(String courseName) {
		this.courseName = courseName;
	}
	// add new student
	public void addStudent(String student) {
		if (numberOfStudents >= students.length) {
			String[] temp = new String[students.length * 2];
			System.arraycopy(students, 0, temp, 0, students.length);
			students = temp;
		}
		students[numberOfStudents++] = student;
	}
	// next lines getters
	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public String getCourseName() {
		return courseName;
	}
	// removes student from array
	public void dropStudent(String student) {
		for (int i = 0; i < students.length; i++) {
			if (student.equalsIgnoreCase(students[i])) {
				students[i] = null; // sets dropped student's value to null
				numberOfStudents--;
				while (i < numberOfStudents) {
					students[i] = students[i + 1];
					i++;
				}
				break;
			}
		}
	}
	// clear method
	public void clear() {
		students = new String[25];
		numberOfStudents = 0;
	}
	// clone method
	public Object clone() {
		Course course = null;
		try {
			course = (Course) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		course.students = students.clone();
		course.courseName = new String(courseName);

		return course;
	}

}
