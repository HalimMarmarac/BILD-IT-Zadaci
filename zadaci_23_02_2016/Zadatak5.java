package zadaci_23_02_2016;

import java.util.*;

public class Zadatak5 {
	
	// recursive method for finding largest number in array
	private static int getLargest(int[] array, int i, int high) {

		if (i == array.length)
			return high;

		if (high < array[i])
			high = array[i];

		return getLargest(array, i + 1, high);
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int[] array = new int[8]; // list to put 8 integers in
		// input 8 integers
		System.out.println("Enter 8 integers***");
		for (int i = 0; i < array.length; i++) {
			try {
				System.out.print("Enter " + (i + 1) + ". number: ");
				array[i] = in.nextInt();
				// integers only
			} catch (InputMismatchException e) {
				System.out.println("Wrong input! Integers only!");
				in.nextLine();
				i--;
			}
		}
		// print list
		System.out.print("\nArray: ");
		for (long i : array) {
			System.out.print(i + " ");
		}
		// print result
		System.out.println("\nThe largest number is " + getLargest(array, 0, array[0]));

		in.close();
	}

}
