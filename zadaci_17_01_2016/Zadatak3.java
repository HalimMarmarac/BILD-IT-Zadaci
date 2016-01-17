package zadaci_17_01_2016;

import java.util.*;

public class Zadatak3 {
	
	public static boolean equals(int[] niz1, int[] niz2) {
		// ispitivanje da li su svi clanovi identicni u ova 2 niza
		for (int k = 0; k < niz1.length; k++) {
			if (niz1[k] == niz2[k]) {
				return true;
			}
		}
		return false;
	}


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // za unos brojeva od korisnika
		int[] niz1 = new int[5]; // inicijalizacija niza od 5 brojeva
		int[] niz2 = new int[5]; // inicijalizacija niza od 5 brojeva
		
		int i = 0;
		try {
			// uzimanje brojeva od korisnika
			while (i < niz1.length) {
				System.out.println("Unesite broj u niz1: ");
				niz1[i] = in.nextInt();
				i++;
			}
			i = 0;
			System.out.println();
			while (i < niz2.length) {
				System.out.println("Unesite broj u niz2: ");
				niz2[i] = in.nextInt();
				i++;
			}
			
			// ispis nizova
			System.out.println("\nIspis brojeva u nizu1: ");
			for (int k = 0; k < niz1.length; k++) {
				System.out.print(niz1[k] + " ");
			}
			System.out.println("\nIspis brojeva u nizu2: ");
			for (int k = 0; k < niz2.length; k++) {
				System.out.print(niz2[k] + " ");
			}
			// ispis rezultata
			if (equals(niz1, niz2)) {
				System.out.println("\nNizovi su striktno identicni.");
			}
			else System.out.println("\nNizovi nisu striktno identicni.");

			// ukoliko je unos pogresnog tipa ili formata
		} catch (InputMismatchException e) {
			System.out.println("Pogresan unos!");
		}
		in.close();
	}

}
