package zadaci_22_01_2016;

import java.util.*;

public class Zadatak1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); // za unos od korisnika

		// dani u sedmici
		String[] dani = { "ponedjeljak", "utorak", "srijeda", "cetvrtak", "petak", "subota", "nedjelja" };

		int dan = 0; // danasnji dan
		int dan1 = 0; // broj dana nakon danasnjeg
		boolean q = true; // za while loop sa exceptionom
		while (q) {
			// unos podataka od korisnika
			try {
				System.out.println("Unesite br. dana (0 za ponedjeljak, 1 za utorak...): ");
				dan = in.nextInt();
				// sve dok je dan manji od 0 ili veci od 6
				while ((dan < 0) || (dan > 6)) {
					System.out.println("\nDan moze biti samo 0-6!");
					System.out.println("Unesite br. dana ponovo: ");
					dan = in.nextInt();
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
				System.out.println("Unesite broj dana nakon prvog dana: ");
				dan1 = in.nextInt();
				// nisu dozvoljeni negativni brojevi
				while (dan1 < 0) {
					System.out.println("\nUnesite pozitivan cio broj!");
					System.out.println("Unesite broj dana nakon prvog dana ponovo: ");
					dan1 = in.nextInt();
				}
				q = false;

				// ukoliko korisnik unese sve osim integera
			} catch (InputMismatchException e) {
				System.out.println("\nPogresan unos! Samo cijeli brojevi!");
				in.nextLine();
			}
		}
		// ispis rezultata
		if ((dan + dan1) < 7) {
			System.out.println("\nDanas je " + dani[dan] + " a dan u buducnosti je " + dani[(dan + dan1)] + ".");
		}
		else {
			System.out.println("\nDanas je " + dani[dan] + " a dan u buducnosti je "
								+ dani[(dan + dan1) % 7] + ".");
		}
		in.close();
	}

}
