package zadaci_18_01_2016;

import java.util.*;

public class Zadatak2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); // za uzimanje brojeva od korisnika

		int[] niz = new int[9];
		int x = 0; // broj
		boolean q = true; // za while loop sa exception-om
		// od korisnika se ocekuje cio broj
		while (q) {
			try {
				// unos 9 brojeva od korisnika
				for (int i = 0; i < niz.length; i++) {
					System.out.println("Unesite " + (i + 1) + ". broj: ");
					niz[i] = in.nextInt();
				}
				q = false;
				// ukoliko je broj sve osim integera unesi ponovo
			} catch (InputMismatchException e) {
				System.out.println("Pogresan unos!\nUneite ponovo: ");
				in.nextLine();
			}
		}
		// racunanje desetog broja
		for (int i = 0; i < niz.length; i++) {
			x += (niz[i] * i);
		}
		x %= 11;
		
		// ispis rezultata
		System.out.println("\nISBN-10 broj: ");
		// ukoliko je deseti broj =10 zamjeni ga sa X
		if (x == 10) {
			for (int i = 0; i < niz.length; i++) {
				System.out.print(niz[i]);
			}
			System.out.print("X");
			// ako je deseti broj razlicit od 10 ispise taj broj na kraju
		} else {
			for (int i = 0; i < niz.length; i++) {
				System.out.print(niz[i]);
			}
			System.out.print(x);
		}
		in.close();
	}
}
