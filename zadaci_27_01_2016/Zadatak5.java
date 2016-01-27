package zadaci_27_01_2016;

import java.text.DecimalFormat;
import java.util.*;

public class Zadatak5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); // za unos od korisnika

		double masa1 = 0; // za unos mase prvog pakovanja
		double cijena1 = 0; // za unos cijene prvog pakovanja
		double masa2 = 0; // za unos mase drugog pakovanja
		double cijena2 = 0; // za unos cijene drugog pakovanja
		boolean q = true; // za while loop sa exceptionom
		while (q) {
			// unos podataka od korisnika
			try {
				System.out.println("Unesite masu prvog pakovanja (kg): ");
				masa1 = in.nextDouble();

				q = false;

				// ukoliko korisnik unese slova ili znak
			} catch (InputMismatchException e) {
				System.out.println("\nPogresan unos!");
				in.nextLine();
			}
		}
		q = true;
		while (q) {
			// unos podataka od korisnika
			try {
				System.out.println("Unesite cijenu prvog pakovanja ($): ");
				cijena1 = in.nextDouble();

				q = false;

				// ukoliko korisnik unese slova ili znak
			} catch (InputMismatchException e) {
				System.out.println("\nPogresan unos!");
				in.nextLine();
			}
		}
		q = true;
		while (q) {
			// unos podataka od korisnika
			try {
				System.out.println("Unesite masu drugog pakovanja (kg): ");
				masa2 = in.nextDouble();

				q = false;

				// ukoliko korisnik unese slova ili znak
			} catch (InputMismatchException e) {
				System.out.println("\nPogresan unos!");
				in.nextLine();
			}
		}
		q = true;
		while (q) {
			// unos podataka od korisnika
			try {
				System.out.println("Unesite cijenu drugog pakovanja ($): ");
				cijena2 = in.nextDouble();

				q = false;

				// ukoliko korisnik unese slova ili znak
			} catch (InputMismatchException e) {
				System.out.println("\nPogresan unos!");
				in.nextLine();
			}
		}
		// kreiranje decimalnog formata za zaokruzivanje na max 2 decimale
		DecimalFormat df = new DecimalFormat("#.##");
		
		// ispis rezultata
		if ((cijena1 / masa1) < (cijena2 / masa2)) {
			System.out.println("\nPrvo pakovanje ima bolju cijenu. (1kg = " + df.format(cijena1 / masa1) + "$)");
			System.out.println("Drugo pakovanje >>> (1kg = " + df.format(cijena2 / masa2) + "$)");
		}
		else {
			System.out.println("\nDrugo pakovanje ima bolju cijenu. (1kg = " + df.format(cijena2 / masa2) + "$)");
			System.out.println("Prvo pakovanje >>> (1kg = " + df.format(cijena1 / masa1) + "$)");
		}

		in.close();
	}

}
