package zadaci_24_01_2016;

import java.util.*;

public class Zadatak1 {

	public static int numberOfDayInAYear(int year) {

		// ukoliko je god prestupna br dana je 366 u suprotnom 365
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			return 366;
		}
		return 365;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); // za unos brojeva od korisnika

		int pgod = 0; // pocetna godina
		int kgod = 0; // krajnja godina
		boolean q = true; // za while loop sa exception-om
		while (q) {
			// unos podataka od korisnika
			try {
				System.out.println("Unesite pocetnu godinu: ");
				pgod = in.nextInt();
				q = false;

				// ukoliko korisnik unese sve osim integera
			} catch (InputMismatchException e) {
				System.out.println("Pogresan unos!\nUneite cijeli broj!");
				in.nextLine();
			}
		}
		q = true;
		while (q) {
			try {
				System.out.println("Unesite krajnju godinu: ");
				kgod = in.nextInt();
				q = false;

				// ukoliko je broj sve osim integera unesi ponovo
			} catch (InputMismatchException e) {
				System.out.println("Pogresan unos!\nUneite cijeli broj!");
				in.nextLine();
			}
		}

		// ispis dana u godini
		System.out.println("\nISPIS DANA U GODINI***\n");
		// od - do
		for (int i = pgod; i <= kgod; i++) {
			// ispis rezultata pozivanjem metode koja vraca br dana u god
			System.out.println(i + " god. -> " + numberOfDayInAYear(i) + " dana.");
		}

		in.close();
	}

}
