package zadaci_27_01_2016;

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
	
	public static int reverse(int number) {

		int num = 0; // broj unazad
		// kreiranje broja unazad
		while (number != 0) {
			num = num * 10;
			num = num + number % 10;
			number /= 10;
		}
		return num; // vraca uneseni broj napisan unazad
	}
	
	public static boolean isEmirp(int number) {
		// ispitujemo da li je broj unazad o5 prime broj
		if ((isPrime(number)) && (isPrime(reverse(number)))) {
			return true; // ako jeste vraca true
		}
		return false; // ako nije vraca false
	}

	public static void main(String[] args) {
		
		System.out.print("Ispis prvih 100 Emirp brojeva:\n");
		int k = 0; // brojac
		// ispis prvih 100 emirp brojeva 10 po liniji
		for (int i = 1; i < 2000; i++) {
			// pozivanje metode za ispitivanje emirp broja
			if (isEmirp(i)) {
				System.out.print(i + " ");
				k++;
				if (k % 10 == 0) {
					System.out.println();
				}
				if (k % 100 == 0) break;
			}
		}
		
	}

}
