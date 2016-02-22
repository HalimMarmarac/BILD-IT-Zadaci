package zadaci_22_02_2016;

public class Zadatak4 {
	// m(i) = 1/3 +2/5 + 3/7 +... + i/(2i+1)
	public static double sumSeries(int n) {
		if (n == 1)
			return 1.0 / 3;
		else
			return sumSeries(n - 1) + n / (2.0 * n + 1);
	}

	public static void main(String[] args) {
		// m(i) for i = 1,2,3,...10
		for (int i = 1; i <= 10; i++) {
			System.out.println("For i = " + i + " ->> " + sumSeries(i));
		}
	}

}
