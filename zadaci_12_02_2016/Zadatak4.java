package zadaci_12_02_2016;

import java.util.*;

public class Zadatak4 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		// creating an array with 100 random integers
		int[] array = new int[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 50);
		}
		int index = 0; // to input index
		boolean q = true; // for while loop
		while (q) {
			// input index
			try {
				System.out.println("Enter an index: ");
				index = in.nextInt();
				// if index is intege and not out of bounds print result and leave the loop
				q = false;
				System.out.println("\narray[" + index + "] = " + array[index]);
				// if index is integer but out of bounds display message and ask for index again
			} catch (IndexOutOfBoundsException ex) {
				System.out.println("INDEX " + index + " is out of bounds!");
				q = true; // enables staying in loop if index is out of bounds
				// if input is not integer
			} catch (InputMismatchException e) {
				System.out.println("Wrong input!\nIntegers only!");
				in.nextLine();
			}
		}

		in.close();
	}

}
