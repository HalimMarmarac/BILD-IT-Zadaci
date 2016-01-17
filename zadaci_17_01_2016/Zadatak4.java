package zadaci_17_01_2016;

import java.util.*;

public class Zadatak4 {

	public static int[] locateLargest(double[][] a) {

		int[] largest = new int[2]; // var za smjestanje dvaju koordinata
									// pozicije
		double max = a[0][0]; // postavljanje najveceg broja na 0 poziciju
		// prolazak kroz kvadratnu matricu
		for (int x = 0; x < a.length; x++) {
			for (int y = 0; y < a.length; y++) {
				// pronalazak najveceg broja u matrici i upis pozicije u var
				// largest
				if (a[x][y] > max) {
					max = a[x][y];
					largest[0] = x;
					largest[1] = y;
				}
			}
		}
		return largest;
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
		
		int XY[] = 	locateLargest(a); // pozivanje metode za poziciju
		// ispisivanje rezultata
		System.out.println("\nNajveci broj u matrici:\nRED # " + (XY[0] + 1) + "\nKOLONA # " + (XY[1] + 1));

		in.close();
	}

}