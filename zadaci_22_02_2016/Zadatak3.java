package zadaci_22_02_2016;

public class Zadatak3 {
	// m(i) = 1 + 1/2 + 1/3 +...+ 1/i
	public static double m(int i) {
		if (i == 1)
			return 1;
		else
			return m(i - 1) + 1.0 / i;
	}

	public static void main(String[] args) {
		// m(i) for i = 1,2,3,...10
		for (int i = 1; i <= 10; i++) {
			System.out.println("For i = " + i + " ->> " + m(i));
		}
	}

}
