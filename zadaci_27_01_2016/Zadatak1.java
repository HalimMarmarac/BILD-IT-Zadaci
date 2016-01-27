package zadaci_27_01_2016;

import java.util.*;

public class Zadatak1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); // za unos od korisnika

		double racun = 0; // za unos i racunanje iznosa racuna
		double napojnica = 0; // za unos i racunanje napojnice
		boolean q = true; // za while loop sa exceptionom
		while (q) {
			// unos podataka od korisnika
			try {
				System.out.println("Unesite iznos racuna: ");
				racun = in.nextDouble();

				q = false;

				// ukoliko korisnik unese slova ili znak
			} catch (InputMismatchException e) {
				System.out.println("\nPogresan unos!");
				in.nextLine();
			}
		}
		q = true;
		while (q) {
			// unos podataka od korisnika
			try {
				System.out.println("Unesite napojnicu u procentima (%): ");
				napojnica = in.nextDouble();

				q = false;

				// ukoliko korisnik unese slova ili znak
			} catch (InputMismatchException e) {
				System.out.println("\nPogresan unos!");
				in.nextLine();
			}
		}
		// racunjanje iznosa napojnice
		napojnica = (racun / 100) * napojnica;
		// racunanje ukupnog iznosa racuna za platiti
		racun = racun + napojnica;
		// ispis rezultata
		System.out.println("\nUkupan racun za uplatiti: " + racun);
		System.out.println("Napojnica: " + napojnica);

		in.close();
	}

}
