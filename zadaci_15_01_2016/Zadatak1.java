package zadaci_15_01_2016;

import java.util.*;

public class Zadatak1 {

	public static Integer max(ArrayList<Integer> list) {
		int max =0; // postavljanje max vrijednosti na 0 na pocetku
		
		// ispitivanje da li je lista null ili sadrzi 0 elemenata
		if ((null == list) || (list.isEmpty())) {
			return null;
		}
		
		// ukoliko lista nije null ili ne sadrzi 0 elemenata
		// prolazimo kroz listu te trazimo najveci broj koji ce postati max
		else {
			for (int x : list) {
				if (x > max) {
					max = x; // ukoliko je broj u listi veci od max, max postaje taj broj
				}
			}
			return max;
		}
	}
	
	public static void main(String[] args) {
		
		// kreiranje prazne ArrayLIst
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// #1 kada je lista prazna
		System.out.println("Lista je null iil sadrži 0 elemenata -> " + max(list)/*pozivanje metode*/);
		
		// dodavanje nekoliko brojeva u listu
		list.add(1);
		list.add(59);
		list.add(16);
		list.add(4);
		
		// ispisivanje kompletne liste
		System.out.println("\nElementi liste:"); 
		for (int x : list) {
			System.out.print(x + " "); 
		}
		
		// #2 ispis najveceg broja u listi kada lista nije prazna
		System.out.println("\nNajveci broj u listi -> " + max(list)/*pozivanje metode*/);
		
	}

}
