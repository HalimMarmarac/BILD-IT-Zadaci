package zadaci_16_02_2016;

import java.io.*;

public class Zadatak5 {
	// rank array for random selection
	static final String[] ranks = { "assistant", "associate", "full" };
	// random rank selection
	private static String getRandomRank() {
		return ranks[(int) (Math.random() * ranks.length)];
	}

	// returns a random double from min to max - 1
	private static double getRandomSalary(int min, int max) {
		int range = max - min;
		return Math.random() * range + min;
	}
	// random salary generator for each rank
	private static double getRandomSalaryByRank(String rank) {
		int max = 0;
		int min = 0;
		// switch rank and random generate min and max value for rank salary
		switch (rank) {
		case "assistant":
			min = 50000;
			max = 80000;
			break;
		case "associate":
			min = 60000;
			max = 110000;
			break;
		case "full":
			min = 75000;
			max = 130000;
			break;
		}
		return getRandomSalary(min, max + 1);
	}

	public static void main(String[] args) throws Exception {
		// writing 1000 lines to file
		try (PrintWriter out = new PrintWriter("Salary.txt")) {
			for (int i = 1; i <= 1000; i++) {
				// random rank
				String rank = getRandomRank();
				// random salary for the rank with 2 decimals
				String salary = String.format("%.2f", getRandomSalaryByRank(rank));
				// write to file line by line
				out.print("FirstName" + i + " LastName" + i + " ");
				out.print(" " + rank + " " + salary);
				if (i != 1000) {
					out.println();
				}

			}
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
		// when done
		System.out.println("Done...");
	}

}
