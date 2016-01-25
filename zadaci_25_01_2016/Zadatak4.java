package zadaci_25_01_2016;

import java.util.*;

public class Zadatak4 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); // za unos od korisnika

		long min = 0; // br minuta
		boolean q = true; // za while loop sa exceptionom
		while (q) {
			// unos podataka od korisnika
			try {
				System.out.println("Unesite br. minuta: ");
				min = in.nextLong();
				// sve dok je broj manji od 0 unosimo ponovo
				while (min < 0) {
					System.out.println("\nGreska!");
					System.out.println("Unesite br. minuta ponovo: ");
					min = in.nextInt();
				}
				q = false;

				// ukoliko korisnik unese sve osim long integera
			} catch (InputMismatchException e) {
				System.out.println("\nPogresan unos! Samo cijeli brojevi!");
				in.nextLine();
			}
		}
		// racunanje broja sati
		long sati = min / 60;
		// racunanje ukupnog broja dana
		long dani = sati / 24;
		// racunanje broja godina od ukupnog broja dana
		long god = dani / 365;
		// racunanje broja dana koji su ostali nakon racuna godina (manje od 365 uvijek)
		long preostaliDani = dani % 365;
		// ispis rezultata
		System.out.println("\n" + min + " minuta = " + god + " godina i " + preostaliDani + " dana.");

		in.close();
	}
}
