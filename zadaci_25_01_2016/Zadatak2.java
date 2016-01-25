package zadaci_25_01_2016;

public class Zadatak2 {
	
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

	public static void main(String[] args) {

		int k = 0; // brojac brojeva po liniji
		System.out.println("\nProsti brojevi u intervalu od 1 do 1000: ");
		
		// prolazimo sve brojeve od - do
		for (int i = 2; i <= 1000; i++) {
			if (isPrime(i)) { // pozivamo metodu za ispitivanje prostih brojeva
				System.out.print(i + " "); // ispis prostih brojeva
				k++;
				// ukoliko je u liniji dostignut zeljeni broj brojeva po liniji predji u novi red
				if (k % 8 == 0) {
					System.out.println();
				}
			}
		}
		System.out.print(1000); // broj 1000 ukljucen u ispis iako nije prost broj
	}
}
