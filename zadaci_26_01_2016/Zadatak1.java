package zadaci_26_01_2016;

import java.util.*;

public class Zadatak1 {

	public static void main(String[] args) {
		// random metoda za uzimanje random index iz niza
		Random r = new Random();
		// niz sa ciframa za nasumicno biranje broja
		int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		// niz sa velikim slovima za nasumicno biranje slova
		String uCase[] = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
						   "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "Y", "X", "Z" };
		// kreiranje stringa u zadanom formatu
		StringBuilder sb = new StringBuilder();
		sb.append(uCase[r.nextInt(26)]).append(uCase[r.nextInt(26)]).append(uCase[r.nextInt(26)]);
		sb.append("-");
		sb.append(num[r.nextInt(10)]).append(num[r.nextInt(10)]).append(num[r.nextInt(10)]).append(num[r.nextInt(10)]);
		// ispis rezultata
		System.out.println("Nasumicno generisana registarska tablica:");
		System.out.println(sb.toString());
	}

}
