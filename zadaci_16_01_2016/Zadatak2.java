package zadaci_16_01_2016;

import java.util.*;

public class Zadatak2 {

	public static void Pitalica(int x) {
		
		Scanner in = new Scanner(System.in); // za unos sa tastature
		int brt = 0; // brojac tacnih odgovora
		int a, b;
		
		// petlja za kreiranje x broja pitanja
		for (int i = 0; i < x; i++) {
			// generisanje 2 nasumicna broja
			a = (int)(Math.random() * 20);
			b = (int)(Math.random() * 10);
			// postavljanje pitanja
			System.out.println("\nKoliko je: " + a + " - " + b + " ?");
			System.out.println("Odgovor: ");
			
			// prihvatanje odgovora od korisnika u obliku integera
			try {
				int o = in.nextInt();
				if ((a - b) == o) { // ispitivanje da li je korisnik tacno odgovorio
				brt++; // inkrement brojaca tacnih odgovora
				}
				// ukoliko korisnik ne unese poz ili negativan cio broj kao rezultat
				// program ce prekinuti sa izvrsavanjem
			} catch (InputMismatchException e) {
				System.out.println("Pogresan unos!");
				System.exit(1);
			}
		}
		// ispis broja tacnih i netacnih odgovora
		System.out.println("\nBroj tacnih odgovora: " + brt);
		System.out.println("Broj netacnih odgovora: " + (x - brt));
		
		in.close();
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Koliko pitanja zelite? ");
		try {
		     int brpitanja = in.nextInt(); // ucitavanje kolicine pitanja
		     Pitalica(brpitanja); // pozivanje metode za pitanja
		     
			// ukoliko korisnik ne unese poz ili negativan cio broj kao rezultat
			// program ce prekinuti sa izvrsavanjem
		} catch (InputMismatchException e) {
			System.out.println("Pogresan unos!");
			System.exit(1);
		}

		in.close();
	}
}
