package zadaci_12_02_2016;

import java.util.*;

public class Zadatak3 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int num1 = 0; // 1st number
		int num2 = 0;	// 2nd number
		boolean q = true; // for while loop
		while (q) {
			// input integer value
			try {
				System.out.print("Enter 1st integer: ");
				num1 = in.nextInt();
				q = false;
				// if it is not integer
			} catch (InputMismatchException e) {
				System.out.println("Wrong input!\nIntegers only!");
				in.nextLine();
			}
		}
		q = true; // for second while loop
		while (q) {
			// enter integer value
			try {
				System.out.print("Enter 2nd integer: ");
				num2 = in.nextInt();
				q = false;
				// if it is not integer
			} catch (InputMismatchException e) {
				System.out.println("Wrong input!\nIntegers only!");
				in.nextLine();
			}
		}
		// print result
		System.out.println("\n" + num1 + " + " + num2 + " = " + (num1 + num2));
		
		in.close();
	}
}
