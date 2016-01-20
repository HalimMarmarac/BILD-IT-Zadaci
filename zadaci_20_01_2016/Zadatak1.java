package zadaci_20_01_2016;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;

public class Zadatak1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); // za unos brojeva od korisnika

		double bInvesticija = 0; // iznos buduce investicije
		double investicija = 0; // iznos investicije
		double godStopa = 0; // godisnja interesna stopa
		int brGod = 0; // broj godina
		boolean q = true; // za while loop sa exception-om
		while (q) {
			// unos podataka od korisnika
			try {
				// korisnik unosi iznos investicije
				System.out.println("Unesite iznos investicije: ");
				investicija = in.nextDouble();
				q = false;

				// ukoliko korisnik unese slova ili neki znak
			} catch (InputMismatchException e) {
				System.out.println("Pogresan unos!\nUnesite ponovo!");
				in.nextLine();
			}
		}
		q = true;
		while (q) {
			try {
				// korisnik unosi iznos god interesne stope
				System.out.println("Unesite godisnju interesnu stopu (npr. 3.25%): ");
				godStopa = in.nextDouble();
				q = false;

				// ukoliko je korisnik unio slovo ili neki znak
			} catch (InputMismatchException e) {
				System.out.println("Pogresan unos!\nUneite ponovo!");
				in.nextLine();
			}
		}
		q = true;
		while (q) {
			try {
				// korisnik unosi broj godina
				System.out.println("Unesite broj godina: ");
				brGod = in.nextInt();
				q = false;

				// ukoliko je broj sve osim integera unesi ponovo
			} catch (InputMismatchException e) {
				System.out.println("Pogresan unos!\nUneite cijeli broj!");
				in.nextLine();
			}
		}
		
		// racunanje mjesecne interesne stope
		double mjeseènaKStopa = godStopa / 1200;

		// racunanje buduce vrijednosti investicije
		bInvesticija = investicija * (Math.pow(1 + mjeseènaKStopa, brGod * 12));

		// zaokruzivanje na 2 decimale
		DecimalFormat df = new DecimalFormat("#.##");
		df.setRoundingMode(RoundingMode.CEILING);

		// ispis rezultata
		System.out.println("\nBuduca vreijednost investicije = " + df.format(bInvesticija));

		in.close();
	}

}
