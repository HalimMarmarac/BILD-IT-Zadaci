package zadaci_12_02_2016;

import java.util.*;

public class Zadatak2 {
	
	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> factors) {
		// creating new list
		ArrayList<Integer> temp = new ArrayList<>();
		// go through input list and if one element is added once do not add it again
		for (int i = 0; i < factors.size(); i++) {
			if (temp.contains(factors.get(i))) {
				temp.remove(factors.get(i));
				i++;
			}
			temp.add(factors.get(i));
		}
		return temp;
	}

	// getting factors for integer m and adding them to list
	private static ArrayList<Integer> getFactors(int m) {

		ArrayList<Integer> temp = new ArrayList<Integer>();
		int count = 2;
		while (m > 1) {
			if (m % count == 0) {
				temp.add(count);
				m /= count;
			} else {
				count++;
			}
		}
		return temp;
	}

	private static int smallestSquare(ArrayList<Integer> factors) {

		// remove duplicates and get odd sequence factors
		ArrayList<Integer> oddSequenceFactors = removeDuplicates(factors);
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
		ArrayList<Integer> factors = getFactors(m);
		int smallestSquare = smallestSquare(factors);
		// printing result
		System.out.println("The smallest number n for m * n to be a perfect square is " + smallestSquare);
		System.out.println("m * n = " + (m * smallestSquare));

		in.close();
	}

}
