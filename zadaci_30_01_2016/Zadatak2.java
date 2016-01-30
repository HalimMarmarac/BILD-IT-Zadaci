package zadaci_30_01_2016;

import java.util.*;

public class Zadatak2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); // za unos brojeva od korisnika
		
		System.out.println("Unesite neki string: ");
		// uzimanje stringa (recenice) od korisnika
		String s = in.nextLine();
		// pretvorimo uneseni string u niz karaktera
		char[] ch = s.toCharArray();
		// ispis rezultata
		// duzina niza je duzina stringa a na 0toj poziciji u nizu je prvi karakter u stringu
		// brojimo sve znakove i razmake...
		System.out.println("\nString ima duzinu od " + ch.length + " karaktera a prvi karakter je " + ch[0]);
		
		in.close();
	}

}
