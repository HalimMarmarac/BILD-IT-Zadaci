package zadaci_29_01_2016;

import java.util.*;

public class Zadatak2 {

	// metoda za ispis poteza koje su protivnici pokazali
	public static void print(int potezYOU, int potezPC) {
		System.out.print("\nVas potez: " + potezYOU + " >>> ");
		if (potezYOU == 0) {
			System.out.print("ROCK");
		} else if (potezYOU == 1) {
			System.out.print("PAPER");
		} else if (potezYOU == 2) {
			System.out.print("SCISSORS");
		} else
			System.out.print("Ne postoji ta opcija!");

		System.out.print("\nPC potez: " + potezPC + " >>> ");
		if (potezPC == 0) {
			System.out.print("ROCK");
		} else if (potezPC == 1) {
			System.out.print("PAPER");
		} else if (potezPC == 2) {
			System.out.print("SCISSORS");
		}
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); // za unos od korisnika
		// random metoda za generisanje jednog od 3 broja
		Random r = new Random();
		// niz brojeva koje random moze generisati
		int[] game = { 0, 1, 2 };
		// generisanje radnom jednog od brojeva
		int potezPC = r.nextInt(3);
		potezPC = game[potezPC];
		// izbor igraca
		int potezYOU = 3;

		boolean q = true; // za while loop sa exceptionom
		while (q) {
			// unos podataka od korisnika
			try {
				System.out.println("Unesite 0-rock, 1-paper ili 2-scissors: ");
				potezYOU = in.nextInt();

				q = false;

				// ukoliko korisnik unese sve osim integera
			} catch (InputMismatchException e) {
				System.out.println("\nPogresan unos!\nUnesite 0-rock, 1-paper ili 2-scissors: ");
				in.nextLine();
			}
		}
		// ukoliko je nerjeseno (isti potez pokazan) igra se dalje
		if (potezYOU == potezPC) {
			do {
				// pc generise novi potez
				potezPC = r.nextInt(3);
				potezPC = game[potezPC];
				// protivnik unosi potez dok je nerjeseno
				if (potezYOU == potezPC) {
					print(potezYOU, potezPC);
					System.out.println("\nNerjeseno!");
					System.out.println("Unesite 0-rock, 1-paper ili 2-scissors: ");
					potezYOU = in.nextInt();
				}
				// ukoliko protivnik pobijedi sa jednim od uslova ispis rezultata
				else if (((potezYOU == 0) && (potezPC == 2)) || ((potezYOU == 2) && (potezPC == 1))
						|| ((potezYOU == 1) && (potezPC == 0))) {
					print(potezYOU, potezPC);
					System.out.println("\nVasa pobjeda! Cestitamo!");
				}
				// ukoliko unesemo nemogucu vrijednost poteza
				else if (potezYOU < 0 || potezYOU > 2) {
					print(potezYOU, potezPC);
					System.out.println("\nNije ova igra za tebe! Ne znas citat...");
				}
				// ispis da je pc pobijedio sa jednim od uslova
				else if (((potezYOU == 2) && (potezPC == 0)) || ((potezYOU == 1) && (potezPC == 2))
						|| ((potezYOU == 0) && (potezPC == 1))) {
					print(potezYOU, potezPC);
					System.out.println("\nPC je pobijedio!");
				}
			} while (potezYOU == potezPC);
		}
		// ispis da je igrac pobijedio sa jednim od uslova
		else if (((potezYOU == 0) && (potezPC == 2)) || ((potezYOU == 2) && (potezPC == 1))
				|| ((potezYOU == 1) && (potezPC == 0))) {
			print(potezYOU, potezPC);
			System.out.println("\nVasa pobjeda! Cestitamo!");
		}
		// ispis ukoliko je igrac unio nemoguc izbor
		else if (potezYOU < 0 || potezYOU > 2) {
			print(potezYOU, potezPC);
			System.out.println("\nNije ova igra za tebe! Ne znas citat...");
		}
		// ispis ukoliko je pc pobijedio sa jednim od uslova
		else {
			print(potezYOU, potezPC);
			System.out.println("\nPC je pobijedio!");
		}
		in.close();
	}

}
