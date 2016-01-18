package zadaci_18_01_2016;

import java.util.*;

public class Zadatak3 {

	public static void displaySortedNumbers(double num1, double num2, double num3) {
		
		// pravimo niz od 3 broja i popunjavamo ga brojevima uzetih od korisnika
		double b[] = new double[3];
		b[0] = num1;
		b[1] = num2;
		b[2] = num3;
		// sortiranje niza od manjeg broja ka vecem
		Arrays.sort(b);
		// ispis niza brojeva koga smo prethodno sortirali od najmanjeg do najveceg
		System.out.println("Ispis brojeva u rastucem redoslijedu: ");
		for (int i = 0; i <b.length; i++){
			System.out.println(b[i]);
		}
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); // za uzimanje brojeva od korisnika

		double b[] = new double[3]; // niz od 3 broja za smještanje brojeva
		boolean q = true; // za while loop sa exception-om

		while (q) {
			try {
				// unos 3 broja od korisnika
				for (int i = 0; i < b.length; i++) {
					System.out.println("Unesite " + (i+1) + ". broj: ");
					b[i] = in.nextDouble();
				}
				q = false;
				// broj tipa double se ocekuje
			} catch (InputMismatchException e) {
				System.out.println("Pogresan unos!\nUneite ponovo: ");
				in.nextLine();
			}
		}
		// pozivanje metode za ispis brojeva od najmanjeg do najveceg
		displaySortedNumbers(b[0], b[1], b[2]);

		in.close();
	}

}
