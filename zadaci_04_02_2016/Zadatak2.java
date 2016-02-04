package zadaci_04_02_2016;

import java.util.*;

public class Zadatak2 {

	public static boolean equals(int[][] m1, int[][] m2) {

		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				// if every component is the same then arrays are strictly identical if not return false
				if (m1[i][j] != m2[i][j])
					return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		// 2 matrices 3x3
		int[][] m1 = new int[3][3];
		int[][] m2 = new int[3][3];
		// input array 1
		System.out.print("Enter list1: ");
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				try {
					m1[i][j] = in.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("Wrong input!\nEnter INTEGER! : ");
					in.nextLine();
					j--;
				}
			}
		}
		// input array 2
		System.out.print("Enter list2: ");
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2[i].length; j++) {
				try {
					m2[i][j] = in.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("Wrong input!\nEnter INTEGER! : ");
					in.nextLine();
					j--;
				}
			}
		}
		// print array 1
		System.out.print("\nList 1: ");
		for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                System.out.print(m1[i][j] + " ");
            }
        }
		// print array 2
		System.out.print("\nList 2: ");
		for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                System.out.print(m2[i][j] + " ");
            }
        }
		// print if arrays are strictly identical or not
		if (equals(m1, m2)) {
			System.out.println("\nThe two arrays are strictly identical.");
		} else {
			System.out.println("\nThe two arrays are not strictly identical.");
		}

		in.close();
	}

}
