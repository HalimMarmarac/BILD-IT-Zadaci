package zadaci_19_01_2016;

import java.util.*;

public class Zadatak1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); // za unos od korisnika

		int mjesec = 0; // za unos mjeseci nakon kojih zelimo stanje
		double stanje = 0; // stanje racuna
		double stednja = 0; // iznos mjesecne stednje
		double kamata = 1.00417; // kamata
		boolean q = true; // za while loop sa exception-om
		while (q) {
			// unos podataka od korisnika
			try {
				System.out.println("Unesite mjesecni iznos stednje: ");
				stednja = in.nextDouble();
				q = false;

				// ukoliko korisnik unese slova ili neki znak
			} catch (InputMismatchException e) {
				System.out.println("Pogresan unos!\nUneite brojcanu vrijednost!");
				in.nextLine();
			}
		}
		q = true;
		while (q) {
			try {
				System.out.println("Unesite broj mjeseci nakon kojeg zelite znati stanje racuna: ");
				mjesec = in.nextInt();
				q = false;

				// ukoliko je broj sve osim integera unesi ponovo
			} catch (InputMismatchException e) {
				System.out.println("Pogresan unos!\nUneite cijeli broj!");
				in.nextLine();
			}

		}

		// racunanje stanja nakon unesenog broja mjeseci
		for (int i = 0; i < mjesec; i++) {
			stanje = ((stednja + stanje) * kamata);
		}
		// zaokruzivanje stanja na 3 decimale
		stanje = Math.round(stanje * 1000) / 1000;
		stanje = Math.abs(stanje);

		// ispis rezultata
		System.out.println("\nStanje racuna nakon " + mjesec + " mjeseca/ci iznosi " + stanje + " $.");

		in.close();
	}
}
