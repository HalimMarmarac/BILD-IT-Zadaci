package zadaci_21_01_2016;

import java.util.*;

public class Zadatak2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); // za unos od korisnika

		int god = 0; // godina za unos od korisnika
		int mjesec = 0; // mjesec za unos od korisnika
		boolean q = true; // za while loop sa exceptionom
		while (q) {
			// unos podataka od korisnika
			try {
				System.out.println("Unesite br. mjeseca: ");
				mjesec = in.nextInt();
				// sve dok je mjesec manji od 1 ili veci od 12
				while ((mjesec < 1) || (mjesec > 12)) {
					System.out.println("\nMjesec moze biti samo 1-12!");
					System.out.println("Upisite mjesec ponovo: ");
					mjesec = in.nextInt();
				}
				q = false;

				// ukoliko korisnik unese sve osim integera
			} catch (InputMismatchException e) {
				System.out.println("\nPogresan unos! Samo cijeli brojevi!");
				in.nextLine();
			}
		}
		q = true;
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

		String month = ""; // ime mjeseca koje ce se popuniti u switchu
		int numOfDays = 0; // br dana u mjesecu koji ce se popuniti u switchu
		// swith za svaki broj mjeseca stringu daje ime i odredjuje broj mjeseci
		switch (mjesec) {
		case 1:
			month = "Januar ";
			numOfDays = 31;
			break;
		case 2:
			month = "Februar ";
			if ((god % 4 == 0 && god % 100 != 0) || god % 400 == 0)
				numOfDays = 29;
			else
				numOfDays = 28;
			break;
		case 3:
			month = "Mart ";
			numOfDays = 31;
			break;
		case 4:
			month = "April ";
			numOfDays = 30;
			break;
		case 5:
			month = "Maj ";
			numOfDays = 31;
			break;
		case 6:
			month = "Juni ";
			numOfDays = 30;
			break;
		case 7:
			month = "Juli ";
			numOfDays = 31;
			break;
		case 8:
			month = "August ";
			numOfDays = 31;
			break;
		case 9:
			month = "Septembar ";
			numOfDays = 30;
			break;
		case 10:
			month = "Oktobar ";
			numOfDays = 31;
			break;
		case 11:
			month = "Novembar ";
			numOfDays = 30;
			break;
		case 12:
			month = "Decembar ";
			numOfDays = 31;
			break;
		}

		// ispis rezultata pri pokretanju u januaru 2016g
		if ((mjesec > 1) && (god >= 2016)) {
			System.out.println("\n" + month + god + " ce imati " + numOfDays + " dan/a.");
		} else {
			System.out.println("\n" + month + god + " je imao " + numOfDays + " dan/a.");
		}

		in.close();
	}

}
