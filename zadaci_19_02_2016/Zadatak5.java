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
		// printing course1 name and it's students
		System.out.println("Course1***");
		System.out.println(course1.getCourseName());
		String[] students1 = course1.getStudents();
		for (int i = 0; i < students1.length; i++) {
			if (students1[i] != null) {
				System.out.println(students1[i]);
			}
		}
		// printing course2 name and it's students
		System.out.println("\n(Clone) Course2***");
		System.out.println(course2.getCourseName());
		String[] students2 = course2.getStudents();
		for (int i = 0; i < students2.length; i++) {
			if (students2[i] != null) {
				System.out.println(students2[i]);
			}
		}
	}

}
