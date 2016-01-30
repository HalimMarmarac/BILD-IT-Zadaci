package zadaci_30_01_2016;

import java.util.*;

public class Zadatak1 {
	// metoda iz prethodnog zadatka (zadaci_20_01_2016, Zadatak3)
	public static int reverse(int number) {

		int num = 0; // broj unazad
		// kreiranje broja unazad
		while (number != 0) {
			num = num * 10;
			num = num + number % 10;
			number /= 10;
		}
		return num; // vraca uneseni broj napisan unazad
	}
	// metoda iz prethodnog zadatka (zadaci_20_01_2016, Zadatak3)
	public static boolean isPalindrome(int number) {
		// ispitujemo da li je broj unazad jednak orginalnom broju
		if (number == reverse(number)) {
			return true; // ako jeste vraca true
		}
		return false; // ako nije vraca false
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); // za unos brojeva od korisnika

		int num = 0;
		boolean q = true; // za while loop sa exception-om
		while (q) {
			// unos podataka od korisnika
			try {
				System.out.println("Unesite cijeli trocifreni broj: ");
				num = in.nextInt();
				// samo trocifreni pozitivni brojevi dolaze u obzir
				while ((num < 100) || (num > 999)) {
					System.out.println("Samo TROCIFRENI brojevi!\nUnesite ponovo: ");
					num = in.nextInt();
				}
				
				q = false;

				// ukoliko korisnik unese sve osim integera
			} catch (InputMismatchException e) {
				System.out.println("Pogresan unos!\nUneite cijeli broj!");
				in.nextLine();
			}
		}
		// ispis rezultata
		if (isPalindrome(num)) {
			System.out.println("\nBroj " + num + " je palindrom.");
		} else {
			System.out.println("\nBroj " + num + " nije palindrom.");
		}

		in.close();
		
	}

}
