package zadaci_18_01_2016;

public class Zadatak4 {

	public static void getRandom() {
		
		// ispis nasumicnih velikih slova
		System.out.println("***ISPIS NASUMICNO GENERISANIH VELIKIH SLOVA***");
		for (int i = 1; i <= 100; i++) {
			/* generisemo nasumicno ASCCI vrijednosti velikih slova engleskog alfabeta
			   zatim ispisujemo taj karakter te ako je 10 u redu prelazimo u novi red */
			int c = (int) (Math.random() * 26) + 65;
			System.out.print((char)c + " ");
			if (i % 10 == 0) {
				System.out.println();
			}
		}
		// ispis nasumicno generisanih cifara 0-9
		System.out.println("\n***ISPIS NASUMICNO GENERISANIH BROJEVA***");
		// generisemo 100 nasumicnih cifara te ispisujemo 10 po liniji
		for (int i = 1; i <= 100; i++) {
			int c = (int) (Math.random() * 10);
			System.out.print(c + " ");
			if (i % 10 == 0) {
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		// pozivanje metode za ispis
		getRandom();
	}

}
