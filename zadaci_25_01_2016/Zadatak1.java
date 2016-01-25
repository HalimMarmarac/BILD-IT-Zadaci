package zadaci_25_01_2016;

import java.util.*;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); // za unos brojeva od korisnika
		// lista u koju cemo smjestiti unesene gradove
		ArrayList<String> gradovi = new ArrayList<String>(3);
		
		// unos gradova
		System.out.println("Unesite ime prvog grada: ");
		gradovi.add(in.nextLine());
		System.out.println("Unesite ime drugog grada: ");
		gradovi.add(in.nextLine());
		System.out.println("Unesite ime treceg grada: ");
		gradovi.add(in.nextLine());
		// ispis liste gradova kako su uneseni
		System.out.println("\nISPIS GRADOVA KAKO SU UNESENI***");
		for (String i : gradovi) {
			System.out.println(i);
		}
		// lagani nacin za abecedno sortiranje pomocu metode
		Collections.sort(gradovi);
		// ispis liste sortirane po abecedi
		System.out.println("\nISPIS GRADOVA SORTIRANIH ABECEDNO***");
		for (String i : gradovi) {
			System.out.println(i);
		}
		
		in.close();
	}

}
