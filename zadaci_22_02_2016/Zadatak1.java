package zadaci_22_02_2016;

import java.util.*;

public class Zadatak1 {

	public static long fibonacci(int index) {
		// if user input =0 or =1
		if (index == 0)
			return 0;
		if (index == 1)
			return 1;
		// if user input 2 or higher
		int f0 = 0;
		int f1 = 1;
		int fib;
		for (int i = 2; i <= index; i++) {
			fib = f0 + f1;
			f0 = f1;
			f1 = fib;
		}
		return f1;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int index = 0; // for index input
		boolean q = true; // for while loop
		while (q) {
			try {
				// input index
				System.out.print("Enter a fibonacci index: ");
				index = in.nextInt();
				q = !q;
				// integers only
			} catch (InputMismatchException ex) {
				System.out.println("Wrong input! Integers only!");
				in.nextLine();
			}
		}
		// printing result
		System.out.println("The fibonacci number is " + fibonacci(index));

		in.close();
	}

}
