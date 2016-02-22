package zadaci_22_02_2016;

import java.util.*;

public class Zadatak2 {
	// finding gcd
	private static int gcd(int m, int n) {
		if (m % n == 0)
			return n;
		else
			return gcd(n, m % n);
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int m = 0;
		int n = 0;
		boolean q = true; // for while loop
		while (q) {
			try {
				// input index
				System.out.print("Enter 1st integer: ");
				m = in.nextInt();
				q = !q;
				// integers only
			} catch (InputMismatchException ex) {
				System.out.println("Wrong input! Integers only!");
				in.nextLine();
			}
		}
		q = !q;
		while (q) {
			try {
				// input index
				System.out.print("Enter 2nd integer: ");
				n = in.nextInt();
				q = !q;
				// integers only
			} catch (InputMismatchException ex) {
				System.out.println("Wrong input! Integers only!");
				in.nextLine();
			}
		}
		// print result
		System.out.println("The GCD is " + gcd(m, n));

		in.close();
	}

}
