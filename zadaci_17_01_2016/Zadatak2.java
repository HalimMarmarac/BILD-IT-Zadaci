package zadaci_17_01_2016;

import java.util.*;

public class Zadatak2 {

	public static double min(double[] array) {

		double min = array[0]; // min vrijednos na pocetku neka je prvi clan u
								// nizu
		// prolazak kroz niz brojeva i pronalazak najmanjeg medju njima
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); // za unos brojeva od korisnika
		double[] array = new double[10]; // inicijalizacija niza od 10 brojeva
											// tipa double
		int i = 0;
		try {
			// uzimanje brojeva od korisnika
			while (i < array.length) {
				System.out.println("Unesite broj ");
				array[i] = in.nextDouble();
				i++;
			}
			// ispis niza
			System.out.println("\nIspis brojeva u nizu: ");
			for (int k = 0; k < array.length; k++) {
				System.out.print(array[k] + " ");
			}
			// ispis najmanjeg broja u nizu pozivanjem metode za pronalazak istog
			System.out.println("\nNajmanji broj u nizu je " + min(array));

			// ukoliko je unos pogresnog tipa ili formata
		} catch (InputMismatchException e) {
			System.out.println("Pogresan unos!");
		}
		in.close();
	}

}
