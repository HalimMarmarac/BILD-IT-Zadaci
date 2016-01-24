package zadaci_24_01_2016;

public class Zadatak3 {

	public static void main(String[] args) {

		// niz brojeva 1 do 7 za pravljenje kombinacija
		int brojevi[] = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 1; // za iskljucenje ponovljenih brojeva (11,22,33 itd)
		int cnt = 0; // brojac

		System.out.println("Kombinacije od dva broja u rasponu od 1 do 7:");
		// ispis kombinacija i njihovo brojanje
		for (int i = 0; i < brojevi.length - 1; i++) {
			for (int j = k; j < brojevi.length; j++) {
				System.out.println(brojevi[i] + " " + brojevi[j]);
				cnt++;
			}
			k++; // inkrement drugog broja u kombinaciji radi izbjegavanja ponovljenih brojeva (11,22 itd)
		}
		System.out.println("Broj kombinacija = " + cnt);
	}
}
