package zadaci_21_01_2016;

public class Zadatak4 {

	// metoda za ispitivanje da li je broj savrsen
	public static boolean isPerfectNumber(int num) {
		int k = 0; // za smjestanje zbira djelilaca
		for (int i = 1; i <= num / 2; i++) {
			if (num% i == 0) {
				k += i;
			}
		}
		// ukoliko je zbir djelilaca jednak broju vraca true u suprotnom false
		if (k == num) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		
		// ispis savrsenih brojeva do 10k
		System.out.println("Savrseni brojevi od 0 do 10000 su :");
		for (int i = 1; i <= 10000; i++) {
			// pozivanje metode za ispitivanje savrsenog broja za svaki broj do 10k
			if (isPerfectNumber(i)) {
				System.out.println(i); // ispis boja ukoliko je savrsen
			}
		}
	}
}