package zadaci_26_01_2016;

import java.util.*;

public class Zadatak5 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); // za unos od korisnika
		// lista za smjestanje unesenih brojeva
		ArrayList<Integer> brojevi = new ArrayList<Integer>();
		int broj = 1; // broj za unos
		boolean q = true; // za while loop sa exceptionom
		while (q) {
			// unos podataka od korisnika
			try {
				//unosi sve dok je unos razlicit od 0
				while (broj != 0) {
					// unos broja
					System.out.println("Unesite broj 1-100: ");
					broj = in.nextInt();
					// ako je broj negativan ili veci od 100 ispisi da je greska
					if ((broj < 0) || (broj > 100)) {
						System.out.println("\nGreska!");
						// ukoliko je broj 1-100 dodaj u listu
					} else {
						brojevi.add(broj);
					}
				}
				q = false;

				// ukoliko korisnik unese sve osim integera
			} catch (InputMismatchException e) {
				System.out.println("\nPogresan unos! Samo cijeli brojevi!");
				in.nextLine();
			}
		}
		// niza kao brojac svih brojeva 1-100
		int cnt[] = new int[101];
		// postavljanje svih vrijednosti indexa brojaca na 0
		for (int i = 0; i < cnt.length; i++) {
			cnt[i] = 0;
		}
		// prolazak kroz listu unesenih brojeva te brojanje svakog pojedinog unesenog broja
		for (int i = 0; i < brojevi.size(); i++) {
			// ova for petlja uporedjuje clan liste unesenih brojeva sa brojem 1-100
			for (int k = 1; k <= 100; k++) {
				// ukoliko je broj u listi unesenih jednak broju iz intervala 1-100
				// inkrementiraj brojac na indexu koji je jednak broju u listi unesenih
				if (brojevi.get(i) == k) {
					cnt[k]++;
				}
			}
		}
		// ispis unesenih brojeva
		System.out.println("\nIspis unesenih brojeva:");
		for (int i = 0; i < brojevi.size() - 1; i++) {
			System.out.print(brojevi.get(i) + " ");
		}
		// ispis rezultata tj broja ponavljanja pojedinih brojeva
		System.out.println("\n\nIspis broja ponavljanja brojeva:");
		for (int i = 1; i < cnt.length; i++) {
			if (cnt[i] != 0) {
				System.out.println("Broj " + i + " >> " + cnt[i] + " puta.");
			}
		}

		in.close();
	}

}
