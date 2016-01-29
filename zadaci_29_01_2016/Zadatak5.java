package zadaci_29_01_2016;

import java.util.*;

public class Zadatak5 {
	
public static void printMatrix(int n) {
		
		int [][] m = new int [n][n]; // kreiranje matrice n x n
		
		// popunjavanje matrice nasumicno sa 1 i 0
		for(int a = 0; a < n; a++){
			for(int b = 0; b < n; b++){
				m[a][b]= (int)(Math.random()*2);
			}
		}
		
		// stampanje matrice na konzoli
		for(int a = 0; a < n; a++){
			for(int b = 0; b < n; b++){
				System.out.print(m[a][b]+" ");
			}
		System.out.println();
		}
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = 0; // n za n x n matricu
		boolean q = true; // za while loop sa exceptionom
		while (q) {
			// unos broja od korisnika
			try {
				System.out.println("Unesite n za ispis n x n matrice: ");
				n = in.nextInt();
				// ako unesemo negativan broj unosi ponovo sve dok ne unesemo pozitivan
				while (n < 0) {
					System.out.println("Ne moze negativan broj!\nUnesite n za ispis n x n matrice: ");
					n = in.nextInt();
				}

				q = false;

				// ukoliko korisnik unese sve osim integera
			} catch (InputMismatchException e) {
				System.out.println("\nPogresan unos!");
				in.nextLine();
			}
		}
		// ispis rezultata
		System.out.println("\n*MATRICA*");
		printMatrix(n);
		
		in.close();
	}

}
