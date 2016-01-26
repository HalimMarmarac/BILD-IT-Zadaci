package zadaci_26_01_2016;

public class Zadatak3 {

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
		System.out.println("Prosti brojevi u intervalu od 0 do 100000:");
		
		// prolazimo sve brojeve od - do
		for (int i = 0; i <= 100000; i++) {
			if (isPrime(i)) { // pozivamo metodu za ispitivanje prostih brojeva
				System.out.print(i + " "); // ispis prostih brojeva
				k++;
				// ukoliko je u liniji 20 brojeva predji u novi red
				if (k % 20 == 0) {
					System.out.println();
				}
			}
		}
	}

}
