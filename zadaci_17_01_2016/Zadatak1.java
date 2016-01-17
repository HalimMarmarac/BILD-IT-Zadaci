package zadaci_17_01_2016;

import java.util.*;

public class Zadatak1 {

	public static boolean isPrime(int n) {
	    // test da li je broj paran, 0 ili 1 te samim tim nije prost broj
	    if((n > 2) && ((n & 1) == 0) || (n == 0) || (n == 1))
	       return false;
	    // testiranje neaprnih brojeva da li su prosti
	    for(int i = 3; i * i <= n; i += 2)
	        if (n % i == 0) {
	            return false;
	        }
	    return true;
	}
	
	public static void ProstiBrojevi(int a, int b, int n) {
		int max = b; // veci broj
		int min = a; // manji broj
		if ( a > b) {
			min = b; // ukoliko je b>a promjenjiva manji broj postaje b
			max = a; // a veci broj da postane a
		}

		int k = 0; // brojac brojeva po liniji
		System.out.println("\n# prosti brojevi u intervalu od " + min + " do " + max + ": ");
		
		// prolazimo sve brojeve od - do
		for (int i = min; i <= max; i++) {
			if (isPrime(i)) { // pozivamo metodu za ispitivanje prostih brojeva
				System.out.print(i + " "); // ispis prostih brojeva
				k++;
				// ukoliko je u liniji dostignut zeljeni broj brojeva po liniji predji u novi red
				if (k % n == 0) {
					System.out.println();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); // za unos brojeva od korisnika
		
		try {
			// uzimanje zeljenih brojeva od korisnika
			System.out.println("Unesite prvi broj: ");
			int a = in.nextInt();
			System.out.println("Unesite drugi broj: ");
			int b = in.nextInt();
			System.out.println("Koliko brojeva po liniji zelite da se ispise? ");
			int n = in.nextInt();
		
			// pozivanje metode za ispis prostih brojeva
			ProstiBrojevi(a, b, n);
		
			// ukoliko je unos nepravilan tip podatka
		} catch (InputMismatchException e) {
			System.out.println("Pogresan unos!");
		}
		in.close();
	}

}
