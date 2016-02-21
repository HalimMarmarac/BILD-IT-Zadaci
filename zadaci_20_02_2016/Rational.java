package zadaci_20_02_2016;

/*
 * Rational class
 */

// define a rational number and its associated
// operations such as add, subtract, multiply, and divide
@SuppressWarnings("serial")
public class Rational extends Number implements Comparable<Rational> {
	// Data fields for numerator and denominator
	private long[] r = new long[2];
	private static int NUMERATOR = 0;
	private static int DENOMINATOR = 1;

	// default constructor
	public Rational() {
		this(0, 1);
	}

	// constructor with specified numerator and denominator
	public Rational(long numerator, long denominator) {
		long gcd = gcd(numerator, denominator);
		r[NUMERATOR] = ((denominator > 0) ? 1 : -1) * numerator / gcd;
		r[DENOMINATOR] = Math.abs(denominator) / gcd;
	}

	// find greatest common divisor of two numbers
	private long gcd(long n, long d) {
		long t1 = Math.abs(n);
		long t2 = Math.abs(d);
		long remainder = t1 % t2;

		while (remainder != 0) {
			t1 = t2;
			t2 = remainder;
			remainder = t1 % t2;
		}
		return t2;
	}

	// return numerator
	public long getNumerator() {
		return r[NUMERATOR];
	}

	// return denominator
	public long getDenominator() {
		return r[DENOMINATOR];
	}

	// add a rational number to this rational
	public Rational add(Rational secondRational) {
		long n = r[NUMERATOR] * secondRational.getDenominator() + r[DENOMINATOR] * secondRational.getNumerator();
		long d = r[DENOMINATOR] * secondRational.getDenominator();
		return new Rational(n, d);
	}

	// subtract a rational number from this rational
	public Rational subtract(Rational secondRational) {
		long n = r[NUMERATOR] * secondRational.getDenominator() - r[DENOMINATOR] * secondRational.getNumerator();
		long d = r[DENOMINATOR] * secondRational.getDenominator();
		return new Rational(n, d);
	}

	// multiply a rational number to this rational
	public Rational multiply(Rational secondRational) {
		long n = r[NUMERATOR] * secondRational.getNumerator();
		long d = r[DENOMINATOR] * secondRational.getDenominator();
		return new Rational(n, d);
	}

	// divide a rational number from this rational
	public Rational divide(Rational secondRational) {
		long n = r[NUMERATOR] * secondRational.getDenominator();
		long d = r[DENOMINATOR] * secondRational.r[NUMERATOR];
		return new Rational(n, d);
	}

	// override toString method
	public String toString() {
		if (r[DENOMINATOR] == 1)
			return r[NUMERATOR] + "";
		else
			return r[NUMERATOR] + "/" + r[DENOMINATOR];
	}

	// override the equals method in the Object class
	public boolean equals(Object parm1) {
		return (this.subtract((Rational) (parm1))).getNumerator() == 0;
	}

	// abstract intValue method
	public int intValue() {
		return (int) doubleValue();
	}

	// abstract floatValue method
	public float floatValue() {
		return (float) doubleValue();
	}

	// doubleValue method
	public double doubleValue() {
		return r[NUMERATOR] * 1.0 / r[DENOMINATOR];
	}

	// abstract longValue method
	public long longValue() {
		return (long) doubleValue();
	}

	// compareTo method
	public int compareTo(Rational o) {
		if ((this.subtract(o)).getNumerator() > 0)
			return 1;
		else if ((this.subtract(o)).getNumerator() < 0)
			return -1;
		else
			return 0;
	}

}