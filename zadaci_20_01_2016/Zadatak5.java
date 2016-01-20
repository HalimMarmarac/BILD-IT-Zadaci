package zadaci_20_01_2016;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;

public class Zadatak5 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); // kreiranje skenera za unos

		double v = 0; // brzina aviona
		double a = 0; // ubrzanje aviona
		boolean q = true; // za while loop sa exception-om
		while (q) {
			// unos podataka od korisnika
			try {
				System.out.println("Unesite brzinu aviona (m/s): ");
				v = in.nextDouble();
				q = false;

				// ukoliko korisnik unese slova ili neki znak
			} catch (InputMismatchException e) {
				System.out.println("Pogresan unos!\nUneite ponovo!");
				in.nextLine();
			}
		}
		q = true;
		while (q) {
			try {
				System.out.println("Unesite ubrzanje aviona (m/s^2): ");
				a = in.nextDouble();
				q = false;

				// ukoliko korisnik unese slova ili neki znak
			} catch (InputMismatchException e) {
				System.out.println("Pogresan unos!\nUneite ponovo!");
				in.nextLine();
			}
		}

		double s = (v * v) / (2 * a); // minimalna duzina piste
		
		// zaokruzivanje na 3 decimale
		DecimalFormat df = new DecimalFormat("#.###");
		df.setRoundingMode(RoundingMode.CEILING);
		
		// ispis rezultata
		System.out.println("\nMinimalna duzina piste je: " + df.format(s) + " m.");

		in.close();
	}

}
