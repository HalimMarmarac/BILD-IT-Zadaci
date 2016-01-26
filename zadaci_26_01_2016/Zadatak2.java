package zadaci_26_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak2 {

	public static int maxDjelilac(int a, int b) {

		int max = 0; // kreiranje i postavljanje max djelioca na 0
		int min = a; // kreiranje promjenjive za manji broj do koga je max
						// sjelilac uopste moguc
		if (a > b)
			min = b; // ukoliko je b>a promjenjiva manji broj postaje b

		// pronalazenje najveceg zajednickog djelioca za date brojeve
		for (int i = 1; i <= min; i++) {
			if ((a % i == 0) && (b % i == 0)) {
				max = i;
			}
		}
		return max; // vracanje rezultata
	}

	public static int minDjelilac(int a, int b) {

		int md = 0; // kreiranje i postavljanje min djelioca na 0
		int min = a; // kreiranje promjenjive za manji broj do koga je min
						// sjelilac moguc (u suprotnom ne postoji)
		if (a > b)
			min = b; // ukoliko je b>a promjenjiva manji broj postaje b

		// pronalazenje najmanjeg zajednickog djelioca za date brojeve
		// inace najmanji zaj djelilac za sve brojeve je 1
		// mi trazimo prvi zajednicki djelilac koji je >1
		for (int i = 2; i <= min; i++) {
			if ((a % i == 0) && (b % i == 0)) {
				md = i;
				break;
			}
		}
		return md; // vracanje rezultata
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); // za unos brojeva od korisnika

		int br1 = 0; // prvi broj
		int br2 = 0; // kdrugi broj
		boolean q = true; // za while loop sa exception-om
		while (q) {
			// unos podataka od korisnika
			try {
				System.out.println("Unesite cio pozitivan broj: ");
				br1 = in.nextInt();
				// sve dok je dan manji od 0
				while (br1 < 0) {
					System.out.println("\nSamo pozitivni brojevi!");
					System.out.println("Unesite broj ponovo: ");
					br1 = in.nextInt();
				}
				q = false;

				// ukoliko korisnik unese sve osim integera
			} catch (InputMismatchException e) {
				System.out.println("Pogresan unos!\nUneite cijeli broj!");
				in.nextLine();
			}
		}
		q = true;
		while (q) {
			try {
				System.out.println("Unesite cio pozitivan broj: ");
				br2 = in.nextInt();
				// sve dok je dan manji od 0
				while (br2 < 0) {
					System.out.println("\nSamo pozitivni brojevi!");
					System.out.println("Unesite broj ponovo: ");
					br2 = in.nextInt();
				}
				q = false;

				// ukoliko je broj sve osim integera unesi ponovo
			} catch (InputMismatchException e) {
				System.out.println("Pogresan unos!\nUneite cijeli broj!");
				in.nextLine();
			}
		}
		// ispis rezultata
		// ukoliko brojevi imaju samo jedan zajednicki djelilac ili ako je zajednicki djelilac 1 ispisi sledece
		if ((minDjelilac(br1, br2)) == (maxDjelilac(br1, br2)) || (maxDjelilac(br1, br2)) == 1) {
			System.out.println("\nPostoji samo jedan zajednicki djelilac za brojeve " + br1 + " i " + br2 + " a to je: "
					+ maxDjelilac(br1, br2));
			// ispis prvog najmanjeg z djelioca koji je veci od 1 i ispis najveceg z djelioca
		} else {
			System.out.println(
					"\nNajmanji zajednicki djelilac za brojeve " + br1 + " i " + br2 + " je: " + minDjelilac(br1, br2));
			System.out.println(
					"Najveci zajednicki djelilac za brojeve " + br1 + " i " + br2 + " je: " + maxDjelilac(br1, br2));
		}

		in.close();
	}

}
