package zadaci_10_02_2016;

import java.util.*;

public class Zadatak3 {
	// max method for finding max number in list
	public static Integer max(ArrayList<Integer> list) {
		// if list is null or empty
		if (list == null || list.isEmpty())
			return null;
		// geting max number
		int max = list.get(0);
		for (int i : list) {
			if (i > max) {
				max = i;
			}
		}
		return max; // return max number
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		// list of integers
		ArrayList<Integer> list = new ArrayList<>();
		int number = 1; // for while != 0
		boolean q = true;
		while (q) {
			try {
				// input numbers
				while (number != 0) { // zero ends input
					System.out.println("Enter number (0 to stop): ");
					number = in.nextInt(); 
					list.add(number);
				}
				q = false;

				// integers only
			} catch (InputMismatchException e) {
				System.out.println("\nWrong input! Integers only!");
				in.nextLine();
			}
		}
		// printing entered numbers
		System.out.print("\nEntered numbers are: ");
		for (int i : list) {
			System.out.print(i + " ");
		}
		// printing max number in list with max method
		System.out.println("\nMax number is " + max(list));

		in.close();
	}

}
