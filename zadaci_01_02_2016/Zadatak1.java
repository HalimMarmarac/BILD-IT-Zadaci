package zadaci_01_02_2016;

import java.util.*;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); // za unos od korisnika

		int num = 0;
		boolean q = true; // za while loop sa exception-om
		while (q) {
			// unos broja od korisnika
			try {
				System.out.println("Unesite ASCII broj (0-127): ");
				num = in.nextInt();
				// sve dok je broj manji od 0 ili veci od 127 unosi ponovo
				while (num < 0 || num > 127) {
					System.out.println("Unesite ASCII broj (0-127): ");
					num = in.nextInt();
				}
				q = false;

				// ukoliko korisnik unese sve osim integera
			} catch (InputMismatchException e) {
				System.out.println("Pogresan unos!\nUneite cijeli broj!");
				in.nextLine();
			}
		}
		// ispis karaktera sa unesenim ASCII kodom
		System.out.println("\nASCII kod " + num + " >> " + (char)num);
		
		in.close();
	}

}
