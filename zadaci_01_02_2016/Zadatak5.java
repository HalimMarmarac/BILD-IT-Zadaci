package zadaci_01_02_2016;

import java.util.*;

public class Zadatak5 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); // za unos od korisnika

		ArrayList<Integer> num = new ArrayList<Integer>();

		// unos brojeva od korisnika
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println("Unesite " + (i + 1) + ". broj: ");
				num.add(in.nextInt());

				// ukoliko korisnik unese sve osim integera
			} catch (InputMismatchException e) {
				System.out.println("Pogresan unos!\nUneite cijeli broj!");
				in.nextLine();
				i--;
			}
		}
		// set brojeva, ukoliko se ponavlja dodaj ga samo jednom
		Set<Integer> x = new HashSet<Integer>();
		for (int i = 0; i < num.size(); i++) {
			// ukoliko se neki broj vec pojavio nece ga dodati
		    if (!x.contains(num.get(i))) {
		        x.add(num.get(i));
		        continue;
		    }
		}
		// ispis Prime brojeva svakog samo jednom
		System.out.println("\nISPIS:");
		for(int i : x) {
			System.out.print(i + " ");
		}

		in.close();
	}

}
