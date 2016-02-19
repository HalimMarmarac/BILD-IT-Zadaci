package zadaci_19_02_2016;

import zadaci_19_02_2016.Course;

public class Zadatak5 {

	public static void main(String[] args) {
		// create new course with 2 students
		Course course1 = new Course("JAVA");
		course1.addStudent("student1");
		course1.addStudent("student2");
		// create clone course
		Course course2 = (Course) course1.clone();
		System.out.println(course1.getCourseName());
		System.out.println(course2.getCourseName());
	}

}
