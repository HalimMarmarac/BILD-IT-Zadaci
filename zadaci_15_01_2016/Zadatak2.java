package zadaci_15_01_2016;

import java.util.*;

public class Zadatak2 {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in); // kreiranje skenera za unos putem konzole
		System.out.println("Unesite string: ");
		String r = in.nextLine(); // unos stringa sa konzole
		
		// ukoliko neko unese slova bosanske abecede pretvori ih u slova engleskog alfabeta
		r = r.replaceAll("š", "s");
		r = r.replaceAll("è", "c");
		r = r.replaceAll("æ", "c");
		r = r.replaceAll("", "z");
		r = r.replaceAll("ğ", "dj");
		
		char[] s = r.toCharArray(); // pretvoranje stringa u niz karaktera
		
		int cnt1 = 0; // kreiranje i postavljanje brojaca samoglasnika na 0
		int cnt2 = 0; // kreiranje i postavljanje brojaca suglasnika na 0
		
		// prolazak kroz string te uzimajuci samo slova brojimo samoglasnike i suglasnike u stringu
		for (char c : s) {  
			   if (((int)c >= 65) && ((int)c <= 90) || ((int)c >= 97) && ((int)c <= 122)) {  
				   if (c == 'a' || c == 'o' || c == 'e' || c == 'i' || c == 'u' || c == 'A' || c == 'O' || c == 'E' || c == 'I'
							|| c == 'U') {
						cnt1++;
					}
					else cnt2++;
			   } 
		}   
		System.out.println("\nU stringu ima " + cnt1 + " samoglasnika" + " i " + cnt2 + " suglasnika.");
		in.close();
	}

}
