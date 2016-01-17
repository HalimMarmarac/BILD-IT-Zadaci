package Mini1_Kalendar;

import java.io.*;
import java.time.*;
import java.util.*;

public class Kalendar {

	// this is prepared for easier multiple use
	private static final String LINE = "_____________________";
	private static final String WEEKDAYS = "Su Mo Tu We Th Fr Sa";
	private static final String NEW_LINE = "\n";
	private static final String EMPTY_STRING = " ";
	private static final String TRIPLE_EMPTY_STRING = "   ";

	// creating String for month calendar
	private static String getFormattedCalendar(final int year, final String month, final int firstDay,
			final int numOfDays) {

		// Switching from int to String for print
		String Year = Integer.toString(year);

		// Create StringBuilder
		final StringBuilder calendar = new StringBuilder();

		// Append weekdays to string header
		calendar.append(NEW_LINE).append(NEW_LINE).append(EMPTY_STRING).append(EMPTY_STRING).append(EMPTY_STRING)
				.append(EMPTY_STRING).append(month).append(Year).append(NEW_LINE).append(LINE).append(NEW_LINE)
				.append(WEEKDAYS).append(NEW_LINE);

		// This will keep track of days
		int day = 1;
		for (int i = 1; i <= 6; i++) // Week loop
		{
			for (int j = 1; j <= 7; j++) // Weekday loop
			{

				// These are the empty spaces for the beginning of
				// the first week
				if (i == 1 && j < firstDay) {
					// Just append empty space, then CONTINUE
					// to next iteration (j++)
					calendar.append(TRIPLE_EMPTY_STRING);
					continue;
				}

				// If we are on the last week of the month,
				// and we've reached the numOfDays of month,
				// simply return the assembled string
				if (day > numOfDays)
					return calendar.toString();

				// Check if the day is a single or double digit
				if (day / 10 >= 1)
					calendar.append(day++).append(EMPTY_STRING);
				else
					// If this is the first week, then it means that
					// we have single-digit days. Apply strings on each
					// side of the day for proper spacing of digits
					calendar.append(EMPTY_STRING).append(day++).append(EMPTY_STRING);
			}

			calendar.append(NEW_LINE);
		}
		calendar.append(NEW_LINE).append(NEW_LINE);

		return calendar.toString();

	}

	// creating String for saving notes
	private static String getNoteLine(final String month, final int day, final int year, final String noteText) {

		// Switching from int to String for print
		String Year = Integer.toString(year);
		String Day = Integer.toString(day);

		// Create StringBuilder
		final StringBuilder note = new StringBuilder();

		// Append notes date and text
		note.append(month).append(Day).append(EMPTY_STRING).append(Year).append(EMPTY_STRING).append(" note: ")
				.append(noteText);

		return note.toString();
	}

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in); // Scanner input from console
		File f = new File("notes.txt");	// creates file with notes
		int c = 3; // just for do/while
		do {
			// display menu
			System.out.println("\n\nCalendar -> 1");
			System.out.println("View notes -> 2");
			System.out.println("Exit -> 0");
			System.out.println("\nCHOICE: ");
			try {
				c = in.nextInt();
			// if input is incorrect type etc. letters
			} catch (InputMismatchException e) {
				System.out.println("Wrong input!\nTry again: ");
				in.nextLine();
			}
			// when input is 0 end the program
			if (c == 0) {
				System.out.println("END");
				System.exit(1);
			}
			if (c < 0 || c > 2) {
				// this while loop is for displayin menu after any operation
				while (c < 0 || c > 2) {
					System.out.println("\n\nCalendar -> 1");
					System.out.println("View notes -> 2");
					System.out.println("Exit -> 0");
					System.out.println("\nCHOICE: ");
					try {
						c = in.nextInt();
					} catch (InputMismatchException e) {
						System.out.println("Wrong input!\nTry again: ");
						in.nextLine();
					}
					if (c == 0) {
						System.out.println("END");
						System.exit(1);
					}
				}
			}
			// menu option #1
			if (c == 1) {
				try {
					// user input for month and year to how calendar for
					System.out.println("Month number: ");
					int Month = in.nextInt();
					System.out.println("Year: ");
					int year = in.nextInt();
					// taking real-time first day od the month
					YearMonth ym = YearMonth.of(year, Month);
					String firstDay = ym.atDay(2).getDayOfWeek().name();
					int day = 0; // initialising and setting day to 0
					// setting day to day name index
					if (firstDay.equals("MONDAY"))
						day = 1;
					else if (firstDay.equals("TUESDAY"))
						day = 2;
					else if (firstDay.equals("WEDNESDAY"))
						day = 3;
					else if (firstDay.equals("THURSDAY"))
						day = 4;
					else if (firstDay.equals("FRIDAY"))
						day = 5;
					else if (firstDay.equals("SATURDAY"))
						day = 6;
					else if (firstDay.equals("SUNDAY"))
						day = 7;
					
					// initialising month name and number of days in each month to null
					String month = "";
					int numOfDays = 0;
					// swith for each of months to set values of month and number of days i each month
					switch (Month) {
					case 1:
						month = "January ";
						numOfDays = 31;
						break;
					case 2:
						month = "February ";
						if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
							numOfDays = 29;
						else
							numOfDays = 28;
						break;
					case 3:
						month = "March ";
						numOfDays = 31;
						break;
					case 4:
						month = "April ";
						numOfDays = 30;
						break;
					case 5:
						month = "May ";
						numOfDays = 31;
						break;
					case 6:
						month = "June ";
						numOfDays = 30;
						break;
					case 7:
						month = "July ";
						numOfDays = 31;
						break;
					case 8:
						month = "August ";
						numOfDays = 31;
						break;
					case 9:
						month = "September ";
						numOfDays = 30;
						break;
					case 10:
						month = "October ";
						numOfDays = 31;
						break;
					case 11:
						month = "November ";
						numOfDays = 30;
						break;
					case 12:
						month = "December ";
						numOfDays = 31;
						break;
					}

					// calling for string from calendar StringBuilder
					final String calendarString = getFormattedCalendar(year, month, day, numOfDays);
					System.out.println(calendarString); // printing formated calendar to console
					
					// asking if for calendar shown in console, user want to ad note for specific date
					// if yes user enters y/Y if not user enters any key
					System.out.println("\n\nNew note(y or Y for new note / any key for cancel)? ");
					String note = in.next();
					if (note.equals("y") || note.equals("Y")) {
						System.out.println("\nDate: "); // ask user to input date from month shown in console
						int dayNum = in.nextInt();
						// ask user to input note
						System.out.println("\nWrite a note: ");
						in.nextLine(); // this line pick up \n when enter on keyboard is pressed
						String noteText = in.nextLine(); // this line is enabled with line before (get note from user)
						
						// writing note to file with month, date and year atributes
						try (PrintWriter output = new PrintWriter(new FileOutputStream(f, true));) {
							// calling for string from note StringBuilder with atributes
							output.println(getNoteLine(month, dayNum, year, noteText));
						}
					}
				} catch (InputMismatchException e) {
					System.out.println("Wrong input!\nTry again: ");
					in.nextLine();
				}
			}

			// menu option #2
			if (c == 2) {
				System.out.println("\n\nNotes:"); // notes heading
				// if any notes are in calendar print all of them to console 
				if (f.exists()) {
					Scanner input = new Scanner(f);
					while (input.hasNext()) {
						System.out.println(input.nextLine()); // reading line from file (one note)
					}
					input.close();
				}
				// if there are no notes in calendar
				else System.out.println("no notes...");
			}
		} while (c != 0);
		in.close();
	}
}
