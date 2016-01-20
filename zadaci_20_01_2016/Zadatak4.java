package zadaci_20_01_2016;

import java.util.*;

public class Zadatak4 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); // kreiranje skenera za unos

		String s = ""; // kreiranje praznog stringa

		// uzimanje stringa od korisnika
		System.out.println("Unesite string: ");
		s = in.nextLine();

		// string pretvaramo u niz karaktera
		char[] c = s.toCharArray();

		// prolazimo kroz niz karaktera
		for (int i = 0; i < c.length; i++) {
			// uzmimamo sve karaktere na neparnim pozivcijama ukljucujuci i space
			// ukoliko zelimo da iskljucimo spc u if uslov ubacimo (&& c[i] != ' ')
			if ((i % 2 == 0) /*&& (c[i] != ' ')*/) {
				System.out.print(c[i]);
			}
		}

		in.close();
	}

}
