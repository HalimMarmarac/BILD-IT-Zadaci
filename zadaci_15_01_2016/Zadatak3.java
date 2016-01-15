package zadaci_15_01_2016;

import java.util.*;

public class Zadatak3 {

	public static int maxDejlilac(int a, int b) {
		int max = 0; // kreiranje i postavljanje max djelioca na 0
		int min = a; // kreiranje promjenjive za manji broj do koga je max sjelilac uopste moguc
		if ( a > b)min = b; // ukoliko je b>a promjenjiva manji broj postaje b
		
		// pronalazenje najveceg zajednickog djelioca za date brojeve
		for (int i = 1; i < min; i++) {
			if ((a % i == 0) && (b % i == 0)) {
				max = i;
			}
		}	
		return max; // vracanje rezultata
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); // kreiranje skenera za unos putem konzole
		
		// unos 2 broja od korisnika
		System.out.println("Unesite prvi broj: ");
		int a = in.nextInt();
		System.out.println("Unesite drugi broj: ");
		int b = in.nextInt();
		
		// pozivanje metode i stampanje rezultata
		System.out.println("\nNajveci zajednicki djelilac za brojeve " + a + " i " + b + " je " + maxDejlilac(a, b));
		
		in.close();
	}
}
