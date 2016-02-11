package zadaci_11_02_2016;

import java.util.*;

public class Zadatak1 {

	public static void getHighestRow(int[][] m, ArrayList<Integer> row) {

		int highest = 0; // highest value set to null
		// then go through matrix and count 1s in each row
		for (int i = 0; i < m.length; i++) {
			int occurrence = 0; // 1s counter
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] == 1) {
					occurrence++;
				}
			}
			// if occurrence is greater than highest
			if (highest < occurrence) {
				highest = occurrence;
				row.clear(); // clear list row
				row.add(i); // add matrix row to list row
				// if row has same num of 1s add row to list row
			} else if (highest == occurrence) {
				row.add(i);
			}
		}
	}

	public static void getHighestColumn(int[][] m, ArrayList<Integer> column) {

		int highest = 0; // highest value set to null
		// then go through matrix and count 1s in each column
		for (int j = 0; j < m[0].length; j++) {
			int occurrence = 0; // 1s counter
			for (int i = 0; i < m.length; i++) {
				if (m[i][j] == 1) {
					occurrence++;
				}
			}
			// if occurrence is greater than highest
			if (highest < occurrence) {
				highest = occurrence;
				column.clear(); // clear list column
				column.add(j); // add matrix column to list column
				// if column has same num of 1s add column to list column
			} else if (highest == occurrence) {
				column.add(j);
			}
		}
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n = 0; // array size and also matrix row and column
		// input integer
		boolean q = true;
		while (q) {
			try {
				System.out.print("Enter the array size n: ");
				n = in.nextInt();
				q = false;
				// if it is not integer
			} catch (InputMismatchException e) {
				System.out.println("Wrong input!\nIntegers only!");
				in.nextLine();
			}
		}
		// create matrix n x n
		int[][] m = new int[n][n];
		// fill matrix with random 0s and 1s
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = (int) (Math.random() * 2);
			}
		}
		// print matrix
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		// create row list
		ArrayList<Integer> row = new ArrayList<>();
		// create column list
		ArrayList<Integer> column = new ArrayList<>();
		// get highest row and column usin methods
		getHighestRow(m, row);
		getHighestColumn(m, column);
		// print results
		System.out.println("Highest row(s): " + row);
		System.out.println("Highest column(s): " + column);

		in.close();
	}

}
