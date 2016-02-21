package zadaci_20_02_2016;

import java.math.*;
import zadaci_20_02_2016.BigRational;

public class Zadatak2 {

	public static void main(String[] args) {
		// new big rational
		BigRational bigRational = new BigRational(new BigDecimal(5), new BigDecimal(10));
		System.out.println(bigRational);
		// multiply it by itself
		bigRational = bigRational.multiply(bigRational);
		System.out.println(bigRational);
	}

}
