package zadaci_17_02_2016;

import java.net.*;
import java.util.*;

public class Zadatak1 {
	// constants for rank
	private static final int ASSI = 0; // ASSISTANT
	private static final int ASSO = 1; // ASSOCIATE
	private static final int FULL = 2; // FULL
	// returns total for any rank
	private static double getTotal(Object[] objects) {
		double total = 0;
		for (Object o : objects) {
			total += (double) o;
		}
		return total;
	}
	// returns size of all ranks combined
	private static int getInternalSize(ArrayList<ArrayList<Double>> lists) {
		int size = 0;
		for (ArrayList<Double> list : lists) {
			size += list.size();
		}
		return size;
	}
	// returns average
	private static double getAverage(long total, int size) {
		return (double) total / size;
	}

	public static void main(String[] args) throws Exception {

		ArrayList<ArrayList<Double>> allRanks = new ArrayList<>(3);
		allRanks.add(ASSI, new ArrayList<>());
		allRanks.add(ASSO, new ArrayList<>());
		allRanks.add(FULL, new ArrayList<>());

		URL url = new URL("http://cs.armstrong.edu/liang/data/Salary.txt");
		Scanner in= new Scanner(url.openStream());

		while (in.hasNext()) {
			// next three lines pick up first name and last name
			String token = null;
			token = in.next();
			token = in.next();
			// get rank and salary
			String rank = in.next();
			if (rank.contains("assistant")) {
				allRanks.get(ASSI).add(in.nextDouble());
			} else if (rank.contains("associate")) {
				allRanks.get(ASSO).add(in.nextDouble());
			} else {
				allRanks.get(FULL).add(in.nextDouble());
			}
		}
		// getting results via methods
		long assiTotal = (long) getTotal(allRanks.get(ASSI).toArray());
		long assoTotal = (long) getTotal(allRanks.get(ASSO).toArray());
		long fullTotal = (long) getTotal(allRanks.get(FULL).toArray());
		long total = assiTotal + assoTotal + fullTotal;
		// printing results
		System.out.println("Assistant total = " + assiTotal);
		System.out.println("Associate total = " + assoTotal);
		System.out.println("Full total = " + fullTotal);
		System.out.println("All Total = " + total);
		System.out.printf("Assistant average = %.2f \n", getAverage(assiTotal, allRanks.get(ASSI).size()));
		System.out.printf("Associate average = %.2f \n", getAverage(assoTotal, allRanks.get(ASSO).size()));
		System.out.printf("Full average = %.2f \n", getAverage(fullTotal, allRanks.get(FULL).size()));
		System.out.printf("All average = %.2f \n", getAverage(total, getInternalSize(allRanks)));
		
		in.close();
	}

}
