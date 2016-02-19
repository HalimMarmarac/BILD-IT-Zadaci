package zadaci_18_02_2016;

import java.util.*;
import zadaci_18_02_2016.MyCalendar;

public class Zadatak1 {

	// print the calendar for a month in a year */
	public static void printMonth(MyCalendar calendar) {
		// print the headings of the calendar
		printMonthTitle(calendar);
		// print the body of the calendar
		printMonthBody(calendar);
	}

	// print the month title
	public static void printMonthTitle(MyCalendar calendar) {
		System.out.println("         " + calendar.getMonthName() + " " + calendar.get(Calendar.YEAR));
		System.out.println("-----------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
	}

	// print month body
	public static void printMonthBody(MyCalendar calendar) {
		// get start day of the week for the first date in the month
		int startDay = calendar.get(Calendar.DAY_OF_WEEK) - 1;
		// get number of days in the month
		int numberOfDaysInMonth = calendar.daysInMonth();
		// pad space before the first day of the month
		int i = 0;
		for (i = 0; i < startDay; i++)
			System.out.print("    ");
		for (i = 1; i <= numberOfDaysInMonth; i++) {
			System.out.printf("%4d", i);
			if ((i + startDay) % 7 == 0)
				System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int year = 0;
		int month = 0;
		boolean q = true; // for while loop
		while (q) {
			// input year
			try {
				System.out.print("Enter year: ");
				year = in.nextInt();
				q = false;
				// if it is not integer
			} catch (InputMismatchException e) {
				System.out.println("Wrong input! Integers only!");
				in.nextLine();
			}
		}
		q = true;
		while (q) {
			// input year
			try {
				System.out.print("Enter month (0=January, 1=February..., 11=December): ");
				month = in.nextInt();
				while (month < 0 || month > 11) {
					System.out.print("Enter month (0=January, 1=February..., 11=December): ");
					month = in.nextInt();
				}
				q = false;
				// if it is not integer
			} catch (InputMismatchException e) {
				System.out.println("Wrong input! Integers only!");
				in.nextLine();
			}
		}
		// creatin new calendar object
		MyCalendar calendar = new MyCalendar(year, month, 1);
		calendar.set(Calendar.DATE, 1);
		System.out.println();
		// print calendar
		printMonth(calendar);
		
		in.close();
	}

}
