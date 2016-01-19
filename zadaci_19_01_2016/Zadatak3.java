package zadaci_19_01_2016;

import java.util.*;

public class Zadatak3 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); // kreiranje skenera za unos

		String s1 = null; // #1 prazan string
		String s2 = null; // #2 prazan string
		String S = null; // string za ispis prefixa

		// uzimanje stringa od korisnika
		System.out.println("#1 Unesite neku rijec ili recenicu: ");
		s1 = in.nextLine();
		System.out.println("#2 Unesite neku rijec ili recenicu: ");
		s2 = in.nextLine();

		// dijelimo unesene stringove na niz rijeci radi uporedjivanja
		/* ovde ubacimo znakove koji odredjuju kad je kraj rijeci
		 * npr ako zelimo da nam . ili, ili ? odredjuje kraj rijeci taj znak ubacimo u ovu
		 * uglastu zagradu i znak ce biti ignorisan a nakon svakog ce se nova rijec ucitati u niz
		 * u ovom programu u zagradi je samo space (prazan znak) to nam odvaja rijeci
		 * ostali znakovi ce biti prisutni u izlaznom stringu
		 */
		String spc = "[ ]+";
		String[] tokens1 = s1.split(spc);
		String[] tokens2 = s2.split(spc);

		// lista u koju cemo dodati rijeci koje se poklapaju
		ArrayList<String> p = new ArrayList<String>();
		int i = 0; // brojac
		/* 
		 * uporedjujemo rijec po rijec u ova dva stringa te ako su identicne
		 * (ignorirajuci velika mala slova)
		 * smjestamo samo iste rijeci u listu koju smo prethodno kreirali
		 */
		while (tokens1[i].equalsIgnoreCase(tokens2[i])) {
			p.add(tokens1[i]);
			i++;
		}
		// ukoliko lista nije prazna pravimo string od rijeci koje su iste
		if (p.size() != 0) {
			StringBuilder sb = new StringBuilder();
			for (String k : p) {
				sb.append(k).append(" "); // dodaje rijec i razmak poslije svake rijeci
			}
			sb.setLength(sb.length() - 1); // uklanja zadnji razmak u stringu
			S = sb.toString(); // string za ispis
			// ispis rezultata
			System.out.println("\nNajveci zajednicki prefix za dva stringa je \"" + S + "\".");
		}
		// ukoliko je lista sa istim rijecima prazna odnosno ukoliko u stringovima
		// nema zajednickog prefixa ispisujemo poruku da ih nema
		else {
			System.out.println("\nStringovi nemaju zajednicki prefix.");
		}
		in.close();
	}
}
