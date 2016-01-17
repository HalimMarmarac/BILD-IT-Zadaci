package zadaci_16_01_2016;

import java.util.*;

public class Zadatak4 {
	
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
		System.out.println("Unesite n za ispis n x n matrice: ");
		try {
			int n = in.nextInt();
			System.out.println("\n*MATRICA*");
			printMatrix(n);
			
			// ukoliko korisnik ne unese poz ili negativan cio broj kao rezultat
			// program ce prekinuti sa izvrsavanjem
		} catch (InputMismatchException e) {
			System.out.println("Pogresan unos!");
			System.exit(1);
		}
		
		in.close();
	}

}
