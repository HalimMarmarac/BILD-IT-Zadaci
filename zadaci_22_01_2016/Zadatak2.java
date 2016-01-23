package zadaci_22_01_2016;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;

public class Zadatak2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); // kreiranje skenera za unos putem
												// konzole

		double x1 = 0; // geografska sirina za 1. tacku
		double x2 = 0; // g. sirina za 2. tacku
		double y1 = 0; // g. duzina za 1. tacku
		double y2 = 0; // g. duzina za 2. tacku
		double R = 6371.01; // poluprecnik Zemlje
		boolean q = true; // za while loop sa exceptionom
		while (q) {
			try {
				// unos g sirine za 1. tacku
				System.out.println("Unesite geografsku sirinu tacke 1 (x1): ");
				x1 = Math.toRadians(in.nextDouble()); // odmah vrsimo i pretvoranje u radijane
				q = false;

				// ukoliko korisnik unese slova ili znak
			} catch (InputMismatchException e) {
				System.out.println("\nPogresan unos!");
				in.nextLine();
			}
		}
		q = true;
		while (q) {
			try {
				// unos g duzine za 1. tacku
				System.out.println("Unesite geografsku duzinu tacke 1 (y1): ");
				y1 = Math.toRadians(in.nextDouble());
				q = false;

				// ukoliko korisnik unese slova ili znak
			} catch (InputMismatchException e) {
				System.out.println("\nPogresan unos!");
				in.nextLine();
			}
		}
		q = true;
		while (q) {
			try {
				// unos g sirine za 2. tacku
				System.out.println("Unesite geografsku sirinu tacke 2 (x2): ");
				x2 = Math.toRadians(in.nextDouble());
				q = false;

				// ukoliko korisnik unese slova ili znak
			} catch (InputMismatchException e) {
				System.out.println("\nPogresan unos!");
				in.nextLine();
			}
		}
		q = true;
		while (q) {
			try {
				// unos g duzine za 2. tacku
				System.out.println("Unesite geografsku duzinu tacke 2 (y2): ");
				y2 = Math.toRadians(in.nextDouble());
				q = false;

				// ukoliko korisnik unese slova ili znak
			} catch (InputMismatchException e) {
				System.out.println("\nPogresan unos!");
				in.nextLine();
			}
		}
		// racunanje udaljenosti izmedju 2 tacke
		double d = R * (Math.acos(((Math.sin(x1) * Math.sin(x2)) + (Math.cos(x1) * Math.cos(x2))) * Math.cos(y1 - y2)));

		// zaokruzivanje na 3 decimale
		DecimalFormat df = new DecimalFormat("#.###");
		df.setRoundingMode(RoundingMode.CEILING);
		// ispis rezultata
		System.out.println("\n# d = " + df.format(d) + " km.");

		in.close();
	}
}
