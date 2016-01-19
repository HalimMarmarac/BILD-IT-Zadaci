package zadaci_19_01_2016;

import java.util.*;

public class Zadatak5 {

	public static int countLetters(String s) {

		int cnt = 0; // brojac
		// string pretvorimo u niz karaktera
		char[] C = s.toCharArray();
		// prolazimo kroz niz
		for (char c : C) {
			// ukoliko je slovo onda povecaj brojac
			if (Character.isLetter(c)) {
				cnt++;
			}
		}
		return cnt; // vraca broj slova
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); // kreiranje skenera za unos

		String s = null; // prazan string

		// uzimanje stringa od korisnika
		System.out.println("Unesite neku rijec ili recenicu: ");
		s = in.nextLine();

		// ispis rezultata i pozivanje metode za brojanje koja ce vratiti rezultat
		System.out.println("\n# Slova = " + countLetters(s));

		in.close();
		;
	}
}
