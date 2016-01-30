package zadaci_30_01_2016;

import java.util.*;

public class Zadatak3 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); // za unos brojeva od korisnika
		String s = null; // za unos stringa
		boolean q = true; // za while petlju
		while (q) {
			System.out.println("Unesite SSN u formatu (DDD-DD-DDDD): ");
			// uzimanje stringa od korisnika
			s = in.nextLine();
			// pretvorimo uneseni string u niz karaktera
			char[] ch = s.toCharArray();
			// ukoliko je uneseni string duzi ili kraci od zeljenog formata ispisi da je pogresan i unosi ponovo
			if (ch.length != 11) {
				System.out.println("\nPogresan format!");
				continue;
			}
			// ovde ispitujemo da li je svaki karakter na svom mjestu i ako jeste prekidamo dalji unos jer je format ispravan
			if ((Character.isDigit(ch[0])) && (Character.isDigit(ch[1])) && (Character.isDigit(ch[2]))
					&& (Character.isDigit(ch[4])) && (Character.isDigit(ch[5])) && (Character.isDigit(ch[7]))
					&& (Character.isDigit(ch[8])) && (Character.isDigit(ch[9])) && (Character.isDigit(ch[10]))
					&& (ch[3] == '-') && (ch[6] == '-')) {
				// ispisemo da je unos ispravan format i zavrsimo program
				System.out.println("\nIspravan format. (" + s + ")");
				q = false;
				// ukoliko karakteri nisu zeljeni karakteri i nisu na mjestu nastavljamo unos
			} else {
				System.out.println("\nPogresan format!");
				continue;
			}	
		}
		
		in.close();
	}

}
