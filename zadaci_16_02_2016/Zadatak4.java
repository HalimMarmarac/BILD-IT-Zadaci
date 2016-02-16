package zadaci_16_02_2016;

import java.io.*;
import java.net.*;
import java.util.*;

public class Zadatak4 {

	public static void main(String[] args) {
		// list for putting scores in
		ArrayList<Integer> scores = new ArrayList<>();
		// read file from web and add scores to list
		try {
			URL url = new URL("http://cs.armstrong.edu/liang/data/Scores.txt");
			Scanner in = new Scanner(url.openStream());
			while (in.hasNextInt()) {
				scores.add(in.nextInt());
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
		// total score calculating
		double total = 0;
		for (int score : scores) {
			total += score;
		}
		// printing results
		System.out.println("Scores = " + scores);
		System.out.println("Total = " + total);
		System.out.println("Average = " + (double)(total / scores.size()));

	}

}
