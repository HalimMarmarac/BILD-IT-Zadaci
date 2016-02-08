package zadaci_08_02_2016;

import java.math.BigDecimal;

public class Zadatak4 {
	
	// getting mersenne number
	public static BigDecimal getMersenneNumber(int p) {
		return new BigDecimal(2).pow(p).subtract(BigDecimal.ONE);
	}

	public static void main(String[] args) {

		System.out.printf("%-5s%2s\n", "P", "2^P - 1\n");
		// p<=100
		// print mersenne prime number
		for (int p = 1; p <= 100; p++) {
			if (getMersenneNumber(p).toBigInteger().isProbablePrime(5)) {
				System.out.printf("%-8d%-8s\n", p, getMersenneNumber(p));
			}
		}
	}

}
