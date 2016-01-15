package zadaci_15_01_2016;

public class Zadatak4 {

	public static void main(String[] args) {
		
		int brojevi[] = new int[100]; // kreiranje niza od 100 brojeva
		// upisivanje 100 nasumiènih brojeva 0-9 u niz
		for (int i = 0; i < brojevi.length; i++) {
			brojevi[i] = (int) (Math.random() * 10);
		}
		
		// ispis niza brojeva
		System.out.println("\nISPIS BROJEVA");
		for (int i = 0; i < brojevi.length; i++) {
			System.out.print(brojevi[i] + " ");
			if (i == 49) System.out.println(); // 50 brojeva po jednom redu
		}
		
		int brojac[] = new int[10]; // kreiranje niza cij je svaki element brojac za po jednu cifru
		// postavljanje svih brojaca na pocetnu vrijednost 0
		for (int i = 0; i < brojac.length; i++) {
			brojac[i] = 0;
		}
		
		System.out.println("\n"); // 2 prazna reda radi esetetike
		
		// brojanje pojedinih nasumicno generisanih cifara te brojanje istih
		for (int i = 0; i < brojevi.length; i++) {
			if (brojevi[i] == 0) brojac[0]++;
			else if (brojevi[i] == 1) brojac[1]++;
			else if (brojevi[i] == 2) brojac[2]++;
			else if (brojevi[i] == 3) brojac[3]++;
			else if (brojevi[i] == 4) brojac[4]++;
			else if (brojevi[i] == 5) brojac[5]++;
			else if (brojevi[i] == 6) brojac[6]++;
			else if (brojevi[i] == 7) brojac[7]++;
			else if (brojevi[i] == 8) brojac[8]++;
			else brojac[9]++;
		}
		
		// ispisivanje brojaca nasumicno generisanih cifara
		for (int i = 0; i < brojac.length; i++) {
			System.out.println("Broj " + i + " se ponovio " + brojac[i] + " puta");
		}
	}

}
