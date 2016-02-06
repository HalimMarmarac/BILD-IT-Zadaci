package zadaci_06_02_2016;

import java.util.*;
import zadaci_06_02_2016.StackOfIntegers;

public class Zadatak4 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int num = 0;
		boolean q = true;
		while (q) {
			// unos broja od korisnika
			try {
				System.out.print("Enter a positive integer: ");
				num = in.nextInt();
				while (num < 0) {
					System.out.println("Wrong input!\nEnter a positive integer: ");
					num = in.nextInt();
				}

				q = false;

			} catch (InputMismatchException e) {
				System.out.println("Wrong input!");
				in.nextLine();
			}
		}

		StackOfIntegers stack = new StackOfIntegers(20);

		System.out.print("\nSmallest factors are: ");
		int factor = 2;
		while (factor <= num) {
			if (num % factor == 0) {
				stack.push(factor);
				num /= factor;
			} else {
				factor++;
			}
		}
		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}

		in.close();
	}

}
