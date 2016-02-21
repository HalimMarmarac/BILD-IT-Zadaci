package zadaci_20_02_2016;

import zadaci_20_02_2016.Rational;

public class Zadatak1 {

	public static void main(String[] args) {
		// test
		Rational rational = new Rational(5, 16);
		rational = rational.multiply(new Rational(3, 8));
		System.out.println(rational);
	}

}
