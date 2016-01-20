package zadaci_20_01_2016;

import java.util.*;

public class Zadatak2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); // za unos brojeva od korisnika

		int poc = 0; // pocetna godina
		int kr = 0; // krajnja godina
		boolean q = true; // za while loop sa exception-om
		while (q) {
			// unos podataka od korisnika
			try {
				System.out.println("Unesite pocetnu godinu: ");
				poc = in.nextInt();
				q = false;

				// ukoliko korisnik unese slova ili neki znak
			} catch (InputMismatchException e) {
				System.out.println("Pogresan unos!\nUneite cijeli broj!");
				in.nextLine();
			}
		}
		q = true;
		while (q) {
			try {
				System.out.println("Unesite krajnju godinu: ");
				kr = in.nextInt();
				q = false;

				// ukoliko je broj sve osim integera unesi ponovo
			} catch (InputMismatchException e) {
				System.out.println("Pogresan unos!\nUneite cijeli broj!");
				in.nextLine();
			}
		}

		// ispis prestupnih god
		System.out.println("\nISPIS PRESTUPNIH GOD***\n");
		int cnt = 0; // brojac
		// od - do
		for (int i = poc; i <= kr; i++) {
			// ispitivanje da li je godina prestupna
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
				cnt++; // inkrement brojaèa za svaku prestupnu god
				System.out.print(i + " ");
				if (cnt % 10 == 0)
					System.out.println(); // 10 po liniji
			}
		}	
		in.close();
	}

}
