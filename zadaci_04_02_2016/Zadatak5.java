package zadaci_04_02_2016;

import java.util.*;

import zadaci_04_02_2016.Location; // import Location class

public class Zadatak5 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int row = 0;
		int column = 0;
		boolean q = true;
		while (q) {
			// input number of rows
			try {
				System.out.print("Enter the number of rows: ");
				row = in.nextInt();
				// accept just positive integers
				while (row <= 0) {
					System.out.println("Just positive numbers!");
					row = in.nextInt();
				}
				q = false;
				// just integers
			} catch (InputMismatchException e) {
				System.out.println("Wrong input! Enter INTEGER!");
				in.nextLine();
			}
		}
		q = true;
		while (q) {
			// input number of columns
			try {
				System.out.print("Enter the number of columns: ");
				column = in.nextInt();
				while (column <= 0) {
					System.out.println("Just positive numbers!");
					column = in.nextInt();
				}
				q = false;
			} catch (InputMismatchException e) {
				System.out.println("Wrong input! Enter INTEGER!");
				in.nextLine();
			}
		}
		// creatin 2d array with num of rows and columns user entered
		double[][] m = new double[row][column];
		// input the array
		System.out.println("Enter the array:");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				try {
					m[i][j] = in.nextDouble();
					// just numbers no letters or any signs
				} catch (InputMismatchException e) {
					System.out.println("Wrong input! No letters or signs!\nEnter again: ");
					in.nextLine();
					j--; // this is to input again to same position if exception is made
				}
			}
		}
		// printing array
		System.out.println("\nArray: ");
		for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf("%.1f  ", m[i][j]);
            }
            System.out.println();
        }
		// creating Location object to get location and largest element in 2d array
		Location location = Location.locateLargest(m);
		// printing location and largest element in array
		System.out.println("\nLargest element is " + location.maxValue + " at location (" + location.row + ", "
				+ location.column + ")");

		in.close();
	}

}
