package zadaci_23_02_2016;

import java.util.*;

public class Zadatak1 {
	// output reverse integer
	public static void reverseDisplay(int value) {
		if (value <= 0)
			return;
		System.out.print(value % 10);
		reverseDisplay(value / 10);
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n = 0;
		boolean q = true; // for while loop
		while (q) {
			try {
				// input integer
				System.out.print("Enter an integer: ");
				n = in.nextInt();
				q = !q;
				// integers only
			} catch (InputMismatchException ex) {
				System.out.println("Wrong input! Integers only!");
				in.nextLine();
			}
		}
		// print result
		System.out.print("Reverse: ");
		reverseDisplay(n);

		in.close();
	}

}
