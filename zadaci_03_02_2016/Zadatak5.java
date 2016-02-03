package zadaci_03_02_2016;

public class Zadatak5 {

	// method for checking if row has an even number of 1s
	public static boolean rowHasEvenOnes(int[][] m, int row) {
		// counter for 1s
		int count = 0;
		for (int j = 0; j < m[row].length; j++) {
			if (m[row][j] == 1)
				count++;
		}
		// returns true or false
		return (count % 2 == 0 && count != 0);
	}
	// method for checking if column has an even number of 1s
	public static boolean columnHasEvenOnes(int[][] m, int column) {
		// counter for 1s
		int count = 0;
		for (int i = 0; i < m.length; i++) {
			if (m[i][column] == 1)
				count++;
		}
		// returns true or false
		return (count % 2 == 0 && count != 0);
	}

	public static void main(String[] args) {
		// creating 6x6 matrix filed random with 0 or 1s
		int[][] m = new int[6][6];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = (int) (Math.random() * 2);
			}
		}
		// display matrix
		System.out.println("MATRIX***");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}

		int cnt = 0; // counting rows and columns with even number of 1s
		// counting rows
		for (int i = 0; i < m.length; i++) {
			if (rowHasEvenOnes(m, i)) {
				cnt++;
			}
		}
		// counting columns
		for (int j = 0; j < m[0].length; j++) {
			if (columnHasEvenOnes(m, j)) {
				cnt++;
			}
		}
		// if count row+columns with even num of 1s is 12 all of rows and columns have even num of 1s
		if (cnt == 12) {
			System.out.println("\nEvery row & every column have an even number of 1s.");
		}
		// if not
		else {
			System.out.println("\nEvery row & every column don't have an even number of 1s.");
		}
		// printing which rows have even number of 1s
		System.out.println();
		for (int i = 0; i < m.length; i++) {
			if (rowHasEvenOnes(m, i)) {
				System.out.println("Row #" + i + " has an even number of 1s.");
			}
		}
		// printing which columns have even number of 1s
		System.out.println();
		for (int j = 0; j < m[0].length; j++) {
			if (columnHasEvenOnes(m, j)) {
				System.out.println("Column #" + j + " has an even number of 1s.");
			}
		}

	}

}
