package zadaci_21_01_2016;

import java.util.*;

public class Zadatak5 {

	// metoda za ispitivanje uslova ispravnosti passworda
	public static boolean isValid(String password) {

		char[] p = password.toCharArray();

		int Dig = 0; // brojac cifara u passwordu
		// brojimo cifre u passwordu
		for (int i = 0; i < p.length; i++) {
			char c = p[i];
			if (Character.isDigit(c)) {
				Dig++;
			}
		}

		for (int i = 0; i < p.length; i++) {
			char c = p[i];
			// ukoliko je znak u paswordu bilo sta osim slova ibrojeva onda nije
			// ispravan (razmak se takodjer ne priznaje)
			if (Character.isLetterOrDigit(c) == false) {
				System.out.println("\nPassword smije da se sastoji samo od slova i brojeva!");
				return false;
				// ukoliko je duzina passworda manja od 8 znakova onda nije
				// ispravan
			} else if (p.length < 8) {
				System.out.println("\nPassword mora da bude duzine minimalno 8 karaktera!");
				return false;
				// ukoliko password nema minimalno 2 broja onda nije ispravan
			} else if (Dig < 2) {
				System.out.println("\nPassword mora da sadrzi bar 2 broja!");
				return false;
			}
		}
		return true; // u svim ostalim slucajevima password je ispravan
					// ukljucujuci password sa svim karakterima = brojevima
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); // za unos od korisnika

		String password; // prima uneseni string
		// unos stringa / passworda
		System.out.println("Unesite password: ");
		password = in.nextLine();
		// sve dok nije validan ponavljaj unos
		while (isValid(password) == false) {
			System.out.println("Password nije validan!");
			System.out.println("Unesite ponovo: ");
			password = in.nextLine();
		}
		// ako je validan ispisati poruku da je validan password
		if (isValid(password)) {
			System.out.println("\nPassword je validan.");
		}

		in.close();
	}

}
