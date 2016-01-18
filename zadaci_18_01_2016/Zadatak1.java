package zadaci_18_01_2016;

import java.util.*;

public class Zadatak1 {

	// metoda za rastavljanje broja na faktore
	public static List<Integer> primeFactors(int n) {
		int x = n;
		// lista u koju cemo smjestiti sve faktore datog broja
		List<Integer> primeFactors = new ArrayList<Integer>();
		// ovde se desava znaci sve
		// broj se dijeli sa prostim brojevima i rastavlja na proste faktore
		for (int i = 2; i <= x; i++) {
			while (x % i == 0) {
				primeFactors.add(i); // svaki faktor dodamo u listu
				x /= i;
			}
		}
		return primeFactors; // vraca listu sa faktorima
	}

	public static void main(String[] args) throws Exception {

		Scanner in = new Scanner(System.in); // za uzimanje broja od korisnika

		int x = 0; // broj
		boolean q = true; // za while loop sa exception-om
		System.out.println("Unesite neki cio broj: ");
		// od korisnika se ocekuje cio broj
		while (q) {
			try {
				x = in.nextInt();
				// ako korisnik unese negativan broj pretvori ga u pozitivan
				if (x < 0) {
					System.out.println("\nBroj je pretvoren u pozitivan cio broj iste vrijednosti...");
					x *= -1;
				}
				q = false;
				// ukoliko je broj sve osim integera unesi ponovo
			} catch (InputMismatchException e) {
				System.out.println("Pogresan unos!\nUneite ponovo: ");
				in.nextLine();
			}
		}
		// ukoliko ste unijeli 0 poruka...
		if (x == 0) {
			System.out.println("\nUnijeli ste 0 šta ocekujete...");
		}
		// ucitavanje faktora datog broja pozivanjem metode za rastavljanje na
		// iste
		else {
			List<Integer> Factors = primeFactors(x);
			// ispisivanje rezultata
			System.out.println("Faktori broja " + x + " su: ");
			for (int i = 0; i < Factors.size(); i++) {
				// ukoliko nije zadnji clan u nizu faktora postavi zarez iza
				// broja
				if (i < Factors.size() - 1) {
					System.out.print(Factors.get(i) + ", ");
				}
				// ukoliko je zadnji clan u nizu postavi tacku iza njega
				else
					System.out.print(Factors.get(i) + ".");
			}
			// ispisujemo operacije mnozenja i rezultata mnozenja faktora
			System.out.print(" (");
			for (int i = 0; i < Factors.size(); i++) {
				if (i < Factors.size() - 1) {
					System.out.print(Factors.get(i) + " * ");
				} else
					System.out.print(Factors.get(i) + " = " + x + ")");
			}
		}
		in.close();
	}

}
