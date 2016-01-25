package zadaci_25_01_2016;

import java.util.*;

public class Zadatak5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); // kreiranje skenera za unos putem konzole
		ArrayList<Integer> brojevi = new ArrayList<Integer>(); // kreiranje niza brojeva
		
		int broj = 1;
		boolean q = true; // za while loop sa exceptionom
		while (q) {
			// unos podataka od korisnika
			try {
				// unos brojeva sa konzole
				while (broj != 0) { // ukoliko unesemo 0 prekida se dalji unos
					System.out.println("Unesite broj(0 za prekid): ");
					broj = in.nextInt(); 
					brojevi.add(broj);
				}
				q = false;

				// ukoliko korisnik unese sve osim integera
			} catch (InputMismatchException e) {
				System.out.println("\nPogresan unos! Samo cijeli brojevi!");
				in.nextLine();
			}
		}
		// ispis unesenih brojeva
		System.out.print("\nUneseni brojevi su:\n");
		for (int i = 0; i < brojevi.size()-1; i++) {
			System.out.print(brojevi.get(i) + " ");
		}
		
		int cntp = 0; // brojac pozitivnih
		int cntn = 0; // brojac negativnih
		int sum = 0; // suma svih brojeva za racunanje prosjeka
		// brojanje poz i neg te racunanje sume
		for (int i = 0; i < brojevi.size()-1; i++) {
			if (brojevi.get(i) < 0) cntn++;
			else cntp++;
			
			sum += brojevi.get(i);
		}
		// racunanje prosjeka
		double prosjek = (double)sum /(double)(cntp + cntn);
		// ispis rezultata
		System.out.println("\n# pozitivnih brojeva: " + cntp + "\n# negativnih brojeva: " + cntn + "\n# prosjek: " + prosjek);
		
		in.close();
	}

}
