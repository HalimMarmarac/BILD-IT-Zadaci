package zadaci_22_01_2016;

import java.util.*;

public class Zadatak4 {

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
	
		
		int max = 0; // kreiranje i postavljanje max broja na 0
		// prolazak kroz lisu unesenih brojeva i pronalazenje max broja u nizu istih
		for (int i : brojevi) {
			if(i > max) max = i;
		}
		
		int cnt = 0; // kreiranje i postavljanje brojaca max broja u nizu na 0
		// prolazak kroz listu i brojanje max broja u nizu
		for (int i : brojevi) {
			if(i == max) cnt++;
		}
		
		// ispis niza unesenih brojeva
		System.out.println("\nISPIS BROJEVA");
		for (int i : brojevi) {
			System.out.print(i + " ");
		}
		
		System.out.println(); // prazan red
		// ispis rezultata
		System.out.println("Najveci broj je " + max + " a ponovio se " + cnt + " puta.");
		
		in.close();
	}

}
