package zadaci_26_01_2016;

import java.util.*;

public class Zadatak4 {
	
	public static int[] sort(int br1, int br2, int br3) {
		// niz u koji cemo upisati 3 unesena broja te sortirati ga u rastucem redoslijedu
		int [] sort1 = new int[3];
		sort1[0] = br1; // dodavanje prvog broja u niz
		sort1[1] = br2; // dodavanje drugog broja u niz
		sort1[2] = br3; // dodavanje treceg broja u niz
		// koristenjem metode Arrays.sort() lagano sortiramo clanove niza u rastucem redoslijedu
		Arrays.sort(sort1);
		// vraca sortiran niz brojeva
		return sort1;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); // za unos brojeva od korisnika
		
		int br1 = 0; // prvi broj
		int br2 = 0; // kdrugi broj
		int br3 = 0; // treci broj
		boolean q = true; // za while loop sa exception-om
		while (q) {
			// unos podataka od korisnika
			try {
				System.out.println("Unesite prvi broj: ");
				br1 = in.nextInt();
				
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
				System.out.println("Unesite drugi broj: ");
				br2 = in.nextInt();
				
				q = false;

				// ukoliko je broj sve osim integera unesi ponovo
			} catch (InputMismatchException e) {
				System.out.println("Pogresan unos!\nUneite cijeli broj!");
				in.nextLine();
			}
		}
		q = true;
		while (q) {
			try {
				System.out.println("Unesite treci broj: ");
				br3 = in.nextInt();
				
				q = false;

				// ukoliko je broj sve osim integera unesi ponovo
			} catch (InputMismatchException e) {
				System.out.println("Pogresan unos!\nUneite cijeli broj!");
				in.nextLine();
			}
		}
		// kreiranje sortiranog niza pozivanjem metode za sortiranje
		int[] sorted = sort(br1, br2, br3);
		// ispis sortiranog niza
		System.out.println("\nBrojevi sortirani u rastucem redoslijedu:");
		for (int i = 0; i < sorted.length; i++) {
			System.out.print(sorted[i] + " ");
		}
	
		in.close();
	}

}
