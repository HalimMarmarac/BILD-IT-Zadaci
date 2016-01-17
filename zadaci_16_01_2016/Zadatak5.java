package zadaci_16_01_2016;

import java.util.*;

public class Zadatak5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int glava = 0; // brojac glava
		System.out.println("Koliko puta zelite bacati novcic? ");
		try {
			int brbacanja = in.nextInt(); // broj bacanja cio broj
			for (int i = 0; i < brbacanja; i++) {
				int x = (int)(Math.random()*2); // generisanje 0 ili 1 (pismo/glava)
				if (x == 0) glava++; // ppostavili smo da je 0 glava a 1 pismo
			}
			// ispis broja ponavljanja pismo/glava
			System.out.println("\nGlava x " + glava + "\nPismo x " + (brbacanja - glava));
			
			// ukoliko korisnik ne unese poz ili negativan cio broj kao rezultat
			// program ce prekinuti sa izvrsavanjem
		} catch (InputMismatchException e) {
			System.out.println("Pogresan unos!");
			System.exit(1);
		}
		
		in.close();
	}

}
