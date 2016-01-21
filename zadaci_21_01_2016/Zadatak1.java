package zadaci_21_01_2016;

import java.util.*;

public class Zadatak1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); // za unos od korisnika
		// kreiranje 3 nasumicna cijela broja u ovom slucaju do 20
		int broj[] = {(int)(Math.random() * 20), (int)(Math.random() * 20), (int)(Math.random() * 20)};
		// ispis pitanja korisniku da pogadja zbir
		System.out.println(broj[0] + " + " + broj[1] + " + " + broj[2] + " =  ?");
		// racunanje zbira
		int zbir = 0;
		for (int i = 0; i < broj.length; i++) {
			zbir += broj[i];
		}

		int rez = 0; // rez od korisnika
		boolean q = true; // za while loop sa exceptionom
		while (q) {
			// unos podataka od korisnika
			try {
				System.out.println("\nUpisite rezutat: ");
				rez = in.nextInt();
				// sve dok je rezultat od korisnika razlicit od zbira trazi novi rezultat
				while (rez != zbir) {
					System.out.println("\nNetacno!");
					System.out.println("Upisite rezultat ponovo: ");
					rez = in.nextInt();
				}
				q = false;

				// ukoliko korisnik unese sve osim integera
			} catch (InputMismatchException e) {
				System.out.println("\nPogresan unos! Samo cijeli brojevi!");
				in.nextLine();
			}
		}
		// ispis rezultata ukoliko korisnik pogodi zbir
		System.out.println("\nTaèno! Cestitamo!");
		System.out.println(broj[0] + " + " + broj[1] + " + " + broj[2] + " = " + rez);

		in.close();
	}
}
