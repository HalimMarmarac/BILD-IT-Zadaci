package zadaci_17_01_2016;

import java.util.*;

public class Zadatak5 {

	public static double[][] sortRows(double[][] array) {
		// sortiranje clanova u redovima matrice
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				Arrays.sort(array[j]);
			}
		}
		return array;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); // za unos od korisnika
		int x = 0; // broj redova i kolona vadratne matrice
		// uzimanje broja kredova i kolona od korisnika
		System.out.println("Upisite broj kolona i redova za kvadratnu matricu: ");
		try {
			x = in.nextInt();
			// samo integer
		} catch (InputMismatchException e) {
			System.out.println("Samo cijeli brojevi!");
		}

		// unos clanova matrice
		System.out.println("UNOS CLANOVA MATRICE***\n");
		double a[][] = new double[x][x];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				boolean q = true;
				while (q) {
					try {
						a[i][j] = in.nextDouble();
						q = false;

						// double tip zarez je tacka
					} catch (InputMismatchException e) {
						System.out.println("Pogresan format!\nPonovi unos:");
						in.nextLine();
					}
				}
			}
		}

		// ispisivanje matrice na ekran
		System.out.println("\nISPIS MATRICE***\n");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(" " + a[i][j]);
			}
			System.out.println();
		}
		// ispisivanje rezultata
		a = sortRows(a);
		System.out.println("\n\nISPIS MATRICE SA SORTIRANIM REDOVIMA***\n");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(" " + a[i][j]);
			}
			System.out.println();
		}
		
		in.close();
	}

}
