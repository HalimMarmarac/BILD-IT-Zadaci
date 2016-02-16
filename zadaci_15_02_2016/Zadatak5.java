package zadaci_15_02_2016;

import java.io.*;
import java.util.*;

public class Zadatak5 {
	// creating random score to write to file
	public static String randomNumbers(int size) {

		String s = "";
		for (int i = 0; i < size; i++) {
			s += " " + (int) (Math.random() * 100);
		}
		return s;
	}

	public static void main(String[] args) {

		// creating a random number of scores
		int numberOfScores = (int) (Math.random() * 100 + 100);
		// writing scores to file 
		try {
			PrintWriter out = new PrintWriter("scores.txt");
			out.write(randomNumbers(numberOfScores));
			out.close();
			System.out.println("Saved " + numberOfScores + " scores to scores.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// user enter filename
		Scanner in = new Scanner(System.in);
		System.out.print("Enter filename: ");
		File filename = new File(in.next());
		in.close();
		// if file doesn't exist
		if (!filename.exists()) {
			System.out.println(filename + " doesn't exist...");
			System.exit(1);
		}
		// creating arrayList to hold an unspecified number of scores
		ArrayList<Integer> scores = new ArrayList<>();
		// reading scores from file
		try {
			in = new Scanner(filename);
			while (in.hasNextInt()) {
				scores.add(in.nextInt());
			}
		} catch (FileNotFoundException ex) {
			System.out.println("Error reading " + filename);
			ex.printStackTrace();
		}
		// sum for average
		double sum = 0;
		for ( int i : scores) {
			sum += i;
		}
		// printing total number of scores and their average value
		System.out.println("Read total of " + scores.size() + " scores from " + filename);
		System.out.println("Total = " + sum);
		System.out.println("Average = " + (sum / scores.size()));
	}

}
