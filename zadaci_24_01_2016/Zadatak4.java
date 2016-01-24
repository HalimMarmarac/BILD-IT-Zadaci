package zadaci_24_01_2016;

import java.util.*;

public class Zadatak4 {

	public static int count(String str, char a) {

		int cnt = 0; // brojac
		// dati string pretvorimo u niz karaktera
		char[] c = str.toLowerCase().toCharArray();
		// ispitujemo sve karaktere i poredimo sa trazenim
		for (char ch : c) {
			if (ch == a) {
				cnt++; // ukoliko je karakter pronaðen inkremen brojaca
			}
		}
		// povrat brojaca
		return cnt;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); // za unos brojeva od korisnika
		// unos stringa od korisnika
		System.out.println("Unesite neki string: ");
		String string = in.nextLine();
		// unos karaktera od korisnika
		System.out.println("Unesite karakter koji zelite prebrojati u stringu: ");
		char c = in.next().toLowerCase().charAt(0);
		
		// ispis rezultata pretrage (sva slova su pretvorena u mala)
		System.out.println("\nU stringu \"" + string + "\" karakter '" + c + "' se ponavlja " + count(string, c) + " puta.");

		in.close();
	}
}
