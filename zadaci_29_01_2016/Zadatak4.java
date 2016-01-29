package zadaci_29_01_2016;

import java.util.*;

public class Zadatak4 {

	// metoda za racunanje zbira cifara cijelog broja
	public static int sumDigits(long n) {

		// ukoliko unesemo negativan broj pretvorimo ga u pozitivan
		if (n < 0) n *= -1;
		int sum = 0; // zbir cifara
		// racunanje zbira cifara
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}
		// vracanje zbira cifara
		return sum;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); // za unos od korisnika

		long n = 0; // broj
		boolean q = true; // za while loop sa exceptionom
		while (q) {
			// unos broja od korisnika
			try {
				System.out.println("Unesite neki cijeli broj: ");
				n = in.nextLong();

				q = false;

				// ukoliko korisnik unese sve osim integera
			} catch (InputMismatchException e) {
				System.out.println("\nPogresan unos!");
				in.nextLine();
			}
		}
		// ispis rezultata
		System.out.println("\nZbir cifara broja " + n + " = " + sumDigits(n));
		
		in.close();
	}

}
