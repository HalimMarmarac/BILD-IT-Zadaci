package zadaci_04_02_2016;

import zadaci_04_02_2016.StopWatch;

public class Zadatak3 {

	// selection sort
	public static void selectionSort(int[] m) {

		for (int i = 0; i < m.length - 1; i++) {
			int currentMin = m[i];
			int currentIndex = i;

			for (int j = i + 1; j < m.length; j++) {
				if (currentMin > m[j]) {
					currentMin = m[j];
					currentIndex = j;
				}
			}

			if (currentIndex != i) {
				m[currentIndex] = m[i];
				m[i] = currentMin;
			}
		}
	}

	public static void main(String[] args) {
		// creating random 100k numbers
		int[] randomArray = new int[100000];
		System.out.println("Creating an unsorted array of 100,000 numbers...");
		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i] = (int) (Math.random() * 100000);
		}
		// creating new stopwatch object
		StopWatch stopWatch = new StopWatch();

		System.out.println("Sorting array using selection algorithm...");
		stopWatch.start(); // start stopwatch
		selectionSort(randomArray); // selective sort
		stopWatch.stop(); // stop stopwatch
		// show milliseconds past during sort
		System.out.println("Time elapsed: " + stopWatch.getElapsedTime() + " milliseconds.");

	}

}
