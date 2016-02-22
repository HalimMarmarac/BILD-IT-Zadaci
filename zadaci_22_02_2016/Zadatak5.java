package zadaci_22_02_2016;

public class Zadatak5 {
	// m(i) = 1/2 + 2/3 +...+ i/(i+1)
	private static double m(int i) {
		if (i == 1)
			return 1 / 2.0;
		else
			return m(i - 1) + i / (i + 1.0);
	}

	public static void main(String[] args) {
		// m(i) for i = 1,2,3,...10
		for (int i = 1; i <= 10; i++) {
			System.out.println("For i = " + i + " ->> " + m(i));
		}
	}

}
