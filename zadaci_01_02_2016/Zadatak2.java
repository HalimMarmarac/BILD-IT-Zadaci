package zadaci_01_02_2016;

import java.util.*;

public class Zadatak2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); // za unos od korisnika

		char ch; // za uzimanje karaktera od korisnika
		// uzimanje karaktera od korisnika
		System.out.println("Unesite neki karakter: ");
		ch = in.next().charAt(0);

		// ispis Unicode za uneseni karakter
		System.out.println("\nKarakter '" + ch + "' >> Unicode " + (byte)ch);

		in.close();

	}

}
