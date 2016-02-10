package zadaci_10_02_2016;

import java.util.*;

/*
 * MyDate class
 */

public class MyDate {

	private int year;
	private int month;
	private int day;

	public MyDate() {
		// new calendar object
		GregorianCalendar cal = new GregorianCalendar();
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH);
		day = cal.get(Calendar.DAY_OF_MONTH);

	}
	// date with elapsed time
	public MyDate(long elapsedTime) {
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTimeInMillis(elapsedTime);
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH);
		day = cal.get(Calendar.DAY_OF_MONTH);
	}
	// new date object constructor with day, month and year 
	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	/*getters and setters*/
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	// set new date
	public void setDate(long elapsedTime) {
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTimeInMillis(elapsedTime);
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH);
		day = cal.get(Calendar.DAY_OF_MONTH);
	}
	// return date in string form
	public String toString() {
		return year + "." + month + "." + day + ".";
	}
	
}
