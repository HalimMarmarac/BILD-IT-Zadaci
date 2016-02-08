package zadaci_08_02_2016;

import java.math.BigDecimal;

public class Zadatak2 {

	public static void main(String[] args) {
		// big decimal format for processing large numbers
		BigDecimal longMaxValue = new BigDecimal(Long.MAX_VALUE);
		// finding numbers that are sqrt from some huge number
		long number = (long) Math.sqrt(Long.MAX_VALUE);
		BigDecimal n = new BigDecimal(number);
		
		int count = 0; // counter for displaying just 10 nums
		while (count < 10) {
			// finding n^2 (n*n) for each of ten numbers
			BigDecimal squared = n.multiply(n);
			// bigger than Long.MAX_VALUE
			if (squared.compareTo(longMaxValue) > 0) {
				count++;
				System.out.println(count + ".  " + n + "  squared = " + squared);
			}
			n = n.add(BigDecimal.ONE);
		}
	}
	
}
