package zadaci_19_01_2016;

import java.util.*;

public class Zadatak4 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); // kreiranje skenera za unos

		// niz od max 10 brojeva
		int [] brojevi = new int[10];
		int k = 0; // brojac
		boolean q = true; // za while loop sa exception-om
		// od korisnika se ocekuje cio broj
		while (q) {
			// unos brojeva od korisnika
			// ukoliko dodjemo do max ogranicenja brojeva za unos unos zavrsava
			while(k < 10) { 
				try {
					System.out.println("Unesite " + (k+1) + ". broj: ");
					brojevi[k] = in.nextInt(); // smjestamo brojeve u niz
					k++;
					q = false;
					
					// ukoliko je broj sve osim integera unesi ponovo
				} catch (InputMismatchException e) {
					System.out.println("Pogresan unos!\nUneite ponovo: ");
					in.nextLine();
				}
			}
		}

		// ispis niza redom kako je unesen
		System.out.print("\nNiz je unesen redom: ");
		for (int i = 0; i < brojevi.length; i++) {
			System.out.print(brojevi[i] + " ");
		}
		
		// ispis rezultata odnosno niza u obrnutom redoslijedu
		System.out.print("\nNiz u obrnutom redoslijedu: ");
		for (int i = brojevi.length - 1; i >= 0; i--) {
			System.out.print(brojevi[i] + " ");
		}
		in.close();
	}

}
