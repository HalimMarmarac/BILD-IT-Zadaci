package zadaci_21_01_2016;

import java.util.*;

public class Zadatak3 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); // za unos od korisnika

		int god = 0; // godina za unos od korisnika
		String mjesec = ""; // mjesec za unos od korisnika

		// unos podataka od korisnika
		System.out.println("Unesite prva 3 slova mjeseca sa pocetnim velikim slovom\n"
				+ "(Jan, Feb, Mar, Apr, Maj, Jun, Jul, Aug/Avg, Sep, Okt, Nov, Dec): ");
		mjesec = in.next();

		boolean q = true; // za while loop sa exceptionom
		while (q) {
			// unos podataka od korisnika
			try {
				System.out.println("Unesite godinu: ");
				god = in.nextInt();

				q = false;

				// ukoliko korisnik unese sve osim integera
			} catch (InputMismatchException e) {
				System.out.println("\nPogresan unos! Samo cijeli brojevi!");
				in.nextLine();
			}
		}

		int numOfDays = 0; // br dana u mjesecu koji ce se popuniti u switchu
		// swith za svaka prva 3 slova mjeseca odredjuje broj mjeseci
		switch (mjesec) {
		case "Jan":
			numOfDays = 31;
			break;
		case "Feb":
			if ((god % 4 == 0 && god % 100 != 0) || god % 400 == 0)
				numOfDays = 29;
			else
				numOfDays = 28;
			break;
		case "Mar":
			numOfDays = 31;
			break;
		case "Apr":
			numOfDays = 30;
			break;
		case "Maj":
			numOfDays = 31;
			break;
		case "Jun":
			numOfDays = 30;
			break;
		case "Jul":
			numOfDays = 31;
			break;
		case "Aug":
			numOfDays = 31;
			break;
		case "Avg":
			numOfDays = 31;
			break;
		case "Sep":
			numOfDays = 30;
			break;
		case "Okt":
			numOfDays = 31;
			break;
		case "Nov":
			numOfDays = 30;
			break;
		case "Dec":
			numOfDays = 31;
			break;
		}

		System.out.println("\n" + mjesec + " " + god + " ima " + numOfDays + " dan/a.");

		in.close();
	}

}
