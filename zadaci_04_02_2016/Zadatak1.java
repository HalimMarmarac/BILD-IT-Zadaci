package zadaci_04_02_2016;

import java.util.*;

public class Zadatak1 {

	public static double[][] sortRows(double[][] m) {

		double[][] sortedRowsMatrix = new double[m.length][m[0].length];
		// copy m matrix to new matrix for sorting
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				sortedRowsMatrix[i][j] = m[i][j];
			}
		}

		// sorting rows
		for (int i = 0; i < sortedRowsMatrix.length; i++) {
			for (int j = 0; j < sortedRowsMatrix[0].length - 1; j++) {
				double currentMin = sortedRowsMatrix[i][j];
				int minIndex = j;
				for (int column = j + 1; column < sortedRowsMatrix[0].length; column++) {
					if (currentMin > sortedRowsMatrix[i][column]) {
						currentMin = sortedRowsMatrix[i][column];
						minIndex = column;
					}
				}
				if (minIndex != j) {
					sortedRowsMatrix[i][minIndex] = sortedRowsMatrix[i][j];
					sortedRowsMatrix[i][j] = currentMin;
				}
			}
		}
		// return sorted matrix
		return sortedRowsMatrix;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		// 3x3 matrix
		double[][] m = new double[3][3];
		// input 3x3 matrix
		System.out.println("Enter a 3x3 matrix: ");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				try {
					m[i][j] = in.nextDouble();
				} catch (InputMismatchException e) {
					System.out.println("Wrong input! No letters or signs!\nEnter again: ");
					in.nextLine();
					j--;
				}
			}
		}
		// print not sorted matrix
		System.out.println("\nMATRIX***");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				// two cifer numbers with 2 decimals
				System.out.printf("%2.2f ", m[i][j]);
			}
			System.out.println();
		}
		// create sorted matrix
		double[][] sorted = sortRows(m);
		// print matrix with sorted rows
		System.out.println("\nROW-SORTED MATRIX***");
		for (int i = 0; i < sorted.length; i++) {
			for (int j = 0; j < sorted[i].length; j++) {
				System.out.printf("%2.2f ", sorted[i][j]);
			}
			System.out.println();
		}

		in.close();
	}

}
