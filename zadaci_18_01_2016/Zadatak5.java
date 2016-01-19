package zadaci_18_01_2016;

import java.util.*;

public class Zadatak5 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); // kreiranje skenera za unos

		// niz od max 100 brojeva
		ArrayList<Integer> brojevi = new ArrayList<Integer>(100);
		int i = 1;
		int cnt = 0;
		int sum = 0; // suma unesenih brojeva
		boolean q = true; // za while loop sa exception-om
		// od korisnika se ocekuje cio broj
		while (q) {
			// unos brojeva od korisnika
			// ukoliko unesemo 0 prekidmo unos ili dodjemo do max ogranicenja brojeva za unos
			while((i > 0)) { 
				try {
					System.out.println("Unesite broj(0 za prekid): ");
					i = in.nextInt();
					if (i == 0) break; // 0 prekida dalji unos
					brojevi.add(i); // dodavanje broja u niz
					cnt++;
					sum += i; // racunanje sume brojeva radi racunanja prosjeka
					q = false;
					
					// ukoliko je broj sve osim integera unesi ponovo
				} catch (InputMismatchException e) {
					System.out.println("Pogresan unos!\nUneite ponovo: ");
					in.nextLine();
				}
			}
		}
		
		
		int cntx = 0; // brojac brojeva koji su jednaki ili veci od prosjeka
		// racunanje prosjeka brojeva
		double prosjek = (double)sum / (double)cnt;
		// brojanje brojeva >= prosjeku
		for (int x : brojevi) {
			if (x >= prosjek) {
				cntx++;
			}
		}
		// ispis svih unesenih brojeva
		System.out.println("\nNiz unesenih brojeva:");
		for (int x : brojevi) {
			System.out.print(x + " ");
		}
		// ispis prosjeka unesenih brojeva
		System.out.println("\nProsjek = " + prosjek);
		// ispis rezultata
		System.out.println("\nBrojeva koji su veci ili jednaki prosjeku brojeva u nizu ima: " + cntx);
		System.out.println("Brojeva koji su ispod prosjeka brojeva u nizu ima: " + (cnt - cntx));

		in.close();
	}

}
