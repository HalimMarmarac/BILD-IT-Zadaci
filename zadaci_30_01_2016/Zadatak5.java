package zadaci_30_01_2016;

import java.util.*;

public class Zadatak5 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); // za unos brojeva od korisnika

		int num = 0;
		boolean q = true; // za while loop sa exception-om
		while (q) {
			// unos podataka od korisnika
			try {
				System.out.println("Unesite cijeli broj za visinu piramide: ");
				num = in.nextInt();
				// samo trocifreni pozitivni brojevi dolaze u obzir
				while (num < 1) {
					System.out.println("Ne moze 0 i manje!\nUnesite ponovo: ");
					num = in.nextInt();
				}

				q = false;

				// ukoliko korisnik unese sve osim integera
			} catch (InputMismatchException e) {
				System.out.println("Pogresan unos!\nUneite cijeli broj!");
				in.nextLine();
			}
		}
		// prolazimo onoliko redova koliki je broj unesen
		// koristena stranica http://javaconceptoftheday.com
		for (int i = 1; i <= num; i++) {
			// horizontalni razmak meðu brojevima
			for (int j = 1; j <= num - i; j++) {
				System.out.printf("%3s", " ");
			}
			// lijevi dio piramide
			for (int k = i; k >= 1; k--) {
				System.out.printf("%3d", k);
			}
			// desni dio piramide
			for (int k = 2; k <= i; k++) {
				System.out.printf("%3d", k);
			}
			System.out.println(); // prelazak u novu liniju
		}

		in.close();
	}

}
