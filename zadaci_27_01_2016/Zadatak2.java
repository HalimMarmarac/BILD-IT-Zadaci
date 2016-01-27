package zadaci_27_01_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak2 {

	public static void reverse(int number) {
		
		int numr = number; // radi ispisa
		int num = 0; // broj unazad
		// kreiranje broja unazad
		while (number != 0) {
			num = num * 10;
			num = num + number % 10;
			number /= 10;
		}
		// ispis rezultata
				System.out.println("\nBroj " + numr + " ispisan naopako >>> " + num);
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); // za unos od korisnika

		int num = 0;
		boolean q = true; // za while loop sa exception-om
		while (q) {
			// unos podataka od korisnika
			try {
				System.out.println("Unesite broj: ");
				num = in.nextInt();
				q = false;

				// ukoliko korisnik unese sve osim integera
			} catch (InputMismatchException e) {
				System.out.println("Pogresan unos!\nUneite cijeli broj!");
				in.nextLine();
			}
		}
		// pozivanje metode za ispis broja naopako
		reverse(num);

		in.close();
	}

}
