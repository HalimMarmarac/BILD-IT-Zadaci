package zadaci_03_02_2016;

public class Zadatak4 {

	public static void sort(int m[][]) {
		// sorting rows primary and columns secondary
		for (int i = 0; i < m.length - 1; i++) {
			int currentIndex = i;
			int[] current = m[i];
			for (int j = i + 1; j < m.length; j++) {
				// those are conditions
				if (current[0] > m[j][0] || current[0] == m[j][0] && current[1] > m[j][1]) {
					current = m[j];
					currentIndex = j;
				}
			}
			if (currentIndex != i) {
				m[currentIndex] = m[i];
				m[i] = current;
			}
		}

	}

	public static void main(String[] args) {
		// matrix for sorting
		int[][] matrix = { { 4, 2 }, { 1, 7 }, { 4, 5 }, { 1, 2 }, { 1, 1 }, { 4, 1 } };
		// display matrix
        System.out.println("MATRIX***");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		// calling method for sorting matrix
		sort(matrix);
		// display sorted matrix
        System.out.println("\nSORTED MATRIX***");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
