package zadaci_12_02_2016;

import java.util.*;

public class Zadatak2 {

	// this is the method for removing duplicates, also used in last exercise
	private static ArrayList<Integer> removeDuplicates(int[][] m) {

		ArrayList<Integer> temp = new ArrayList<>();
		for (int i = 0; i < m.length; i++) {
			if (m[i][1] % 2 != 0) {
				temp.add(m[i][0]);
			}
		}
		// removing duplicates
		ArrayList<Integer> duplicateRemoved = new ArrayList<>();
		for (int i = 0; i < temp.size(); i++) {

			if (!duplicateRemoved.contains(temp.get(i))) {
				duplicateRemoved.add(temp.get(i));
			}
		}
		return duplicateRemoved; // returns list with no duplicates
	}

	// getting factors for integer m and adding them to list
	private static void getFactors(int m, ArrayList<Integer> factors) {

		int count = 2;
		while (count <= m) {
			if (m % count == 0) {
				factors.add(count);
				m /= count;
			} else {
				count++;
			}
		}
	}

	// copy factors in 2d array
	private static int[][] copy(ArrayList<Integer> factors) {

		int[][] array = new int[factors.size()][2];
		for (int i = 0; i < array.length; i++) {
			array[i][0] = factors.get(i);
		}
		return array;
	}

	// going through 2d array with factors
	private static void search(int[][] m, int number) {
		for (int i = 0; i < m.length; i++) {
			if (m[i][0] == number) {
				m[i][1]++;
			}
		}
	}

	private static int smallestSquare(ArrayList<Integer> factors) {

		int[][] occurrences = copy(factors);
		for (int i : factors) {
			search(occurrences, i);
		}
		// remove duplicates and get odd sequence factors
		ArrayList<Integer> oddSequenceFactors = removeDuplicates(occurrences);
		// get smallest square by multiplying oddSequenceFactors
		int smallestSquare = 1;
		for (int i : oddSequenceFactors) {
			smallestSquare *= i;
		}
		return smallestSquare;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int m = 0;
		boolean q = true;
		while (q) {
			try {
				System.out.print("Enter an integer m: ");
				m = in.nextInt();
				q = false;
				// if it is not integer
			} catch (InputMismatchException e) {
				System.out.println("Wrong input!\nIntegers only!");
				in.nextLine();
			}
		}
		// list to store factors
		ArrayList<Integer> factors = new ArrayList<>();
		// get factors and store them to list
		getFactors(m, factors);
		// getting the square
		int smallestSquare = smallestSquare(factors);
		// printing result
		System.out.println("The smallest number n for m * n to be a perfect square is " + smallestSquare);
		System.out.println("m * n = " + (m * smallestSquare));

		in.close();
	}

}
