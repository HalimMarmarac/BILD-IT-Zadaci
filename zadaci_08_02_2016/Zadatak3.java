package zadaci_08_02_2016;

import java.math.BigInteger;

public class Zadatak3 {

	public static void main(String[] args) {
		// big integer for numbers larger than long.max_value-current
		BigInteger number = BigInteger.valueOf(Long.MAX_VALUE);
		// printing first five prime numbers larger than long.max_value
		System.out.println("5 prime numbers larger than Long.MAX_VALUE:");
		int cnt = 1; // counter to 5
		while (cnt <= 5) {
			if (number.isProbablePrime(5)) {
				System.out.println(cnt + ".  " + number);
				cnt++;
			}
			number = number.add(BigInteger.ONE);
		}
	}

}
