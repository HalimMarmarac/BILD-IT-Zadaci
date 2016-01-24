package zadaci_24_01_2016;

import java.util.*;

public class Zadatak5 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); // za unos brojeva od korisnika
		// unos stringa od korisnika
		System.out.println("Unesite prvi string: ");
		String str1 = in.nextLine();
		// unos karaktera od korisnika
		System.out.println("Unesite drugi string: ");
		String str2 = in.nextLine();
		
		// ukoliko prvi string sadrzi drugi u sebi onda je drugi substring prvog stringa
		if (str1.contains(str2)) {
			System.out.println("\nString \"" + str2 + "\"" + " je substring \"" + str1 + "\" stringa.");
		}
		else {
			System.out.println("\nString \"" + str2 + "\"" + " nije substring \"" + str1 + "\" stringa.");
		}
		
		in.close();
	}

}
