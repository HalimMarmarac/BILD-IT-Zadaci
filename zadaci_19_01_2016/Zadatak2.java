package zadaci_19_01_2016;

import java.util.*;

public class Zadatak2 {

	public static void main(String[] args) {

		// pravljenje random metode
		Random r = new Random();

		// kreiranje nizova sa kartama i znakovima
		String[] Karta = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		String[] Znak = { "srce", "pik", "djetelina", "kocka" };

		// pozivanje metode random nad brojem objekata u nizovima
		int karta = r.nextInt(13);
		int znak = r.nextInt(4);

		// ispis rezultata tako sto iscitavamo random kreiran index iz nizova
		System.out.println("Izvucena karta je " + Karta[karta] + " znak " + Znak[znak] + ".");
	}
}
