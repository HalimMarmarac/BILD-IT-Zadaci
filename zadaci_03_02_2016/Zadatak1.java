package zadaci_03_02_2016;

public class Zadatak1 {

	// saving sum of hours for each row(employee)
	public static int[][] calcTotalHours(int[][] m) {
		// this array is used to put in employees num and total hours for each of them
		int[][] totalHoursChart = new int[m.length][2];
		// column 0 is employee num and column 1 is total hours count
		for (int i = 0; i < m.length; i++) {
			totalHoursChart[i][1] = getRowTotalHour(m, i);
			totalHoursChart[i][0] = i;
		}

		return totalHoursChart;
	}
	// calculating sum of each row (hours for each employee)
	public static int getRowTotalHour(int[][] m, int row) {

		int total = 0;
		for (int column = 0; column < m[row].length; column++) {
			total += m[row][column];
		}
		return total;
	}
	// descending sorting hours count 
	public static void descendingSort(int[][] m) {

		for (int i = 0; i < m.length - 1; i++) {

			int currentIndex = i;
			int currentMax = m[i][1];
			int empNum = m[i][0];
			for (int k = i + 1; k < m.length; k++) {

				if (currentMax < m[k][1]) {
					currentMax = m[k][1];
					currentIndex = k;
					empNum = m[k][0];
				}
			}

			if (currentIndex != i) {
				m[currentIndex][0] = m[i][0];
				m[currentIndex][1] = m[i][1];
				m[i][0] = empNum;
				m[i][1] = currentMax;
			}

		}
	}

	public static void main(String[] args) {
		// array with hours day by day for each employee
		int[][] employeeHours = { { 2, 4, 3, 4, 5, 8, 8 }, { 7, 3, 4, 3, 3, 4, 4 }, { 3, 3, 4, 3, 3, 2, 2 },
				{ 9, 3, 4, 7, 3, 4, 1 }, { 3, 5, 4, 3, 6, 3, 8 }, { 3, 4, 4, 6, 3, 4, 4 }, { 3, 7, 4, 8, 3, 8, 4 },
				{ 6, 3, 5, 9, 2, 7, 9 } };
		// calling method to get total hours count
		int[][] totalHoursChart = calcTotalHours(employeeHours);
		// display day by day hours for each employee
		System.out.println("# Employee      Su  Mo  Tu  We  Th  Fr  Sa");
		for (int i = 0; i < totalHoursChart.length; i++) {
			System.out.print("Employee #" + totalHoursChart[i][0] + "      ");
			for (int j = 0; j < 7; j++) {
				System.out.print(employeeHours[i][j] + "   ");
			}
			System.out.println();
		}
		// calling method for descending sorting total hours count 
		descendingSort(totalHoursChart);
		System.out.println();
		// printing the results
		for (int i = 0; i < totalHoursChart.length; i++) {
			System.out.println("Employee #" + totalHoursChart[i][0] + " total hours = " + totalHoursChart[i][1]);
		}

	}

}
