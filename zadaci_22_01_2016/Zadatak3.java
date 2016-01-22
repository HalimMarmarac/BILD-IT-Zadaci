package zadaci_22_01_2016;

public class Zadatak3 {

	public static void main(String[] args) {
	
		int cnt = 0; // brojac za ispis 10 po liniji
		// ispis brojeva koji su djeljivi i sa 5 i sa 6 u rasponu od 100 do 1000
		for (int i = 100; i <= 1000; i++) {
			if ((i % 5 == 0) && (i % 6 == 0)) { // ispitivanje djeljivosti brojeva
				System.out.print(i + " ");
				cnt++; // inkrement brojaca (ako je 10 predji u novi red
				if (cnt % 10 == 0) {
					System.out.println();
				}
			}
		}
	}
}
