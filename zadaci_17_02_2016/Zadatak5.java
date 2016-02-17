package zadaci_17_02_2016;

import java.util.*;

public class Zadatak5 {
	// sort array of numbers
	public static void sort(ArrayList<Number> list) {

		for (int i = 0; i < list.size() - 1; i++) {
			Number currentMin = list.get(i);
			int currentIndex = i;

			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(j).doubleValue() < currentMin.doubleValue()) {
					currentMin = list.get(j);
					currentIndex = j;
				}
			}
			if (currentIndex != i) {
				list.set(currentIndex, list.get(i));
				list.set(i, currentMin);
			}
		}

	}

	public static void main(String[] args) {
		// array of 20 numbers 1-20
		ArrayList<Number> numbers = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			numbers.add(i);
		}
		// fast shuffle numbers in array
		Collections.shuffle(numbers);
		// print shuffled list
		System.out.println("Shuffled: ");
		System.out.print(numbers);
		// sort number using method
		sort(numbers);
		// print sorted list
		System.out.println("\nSorted: ");
		System.out.print(numbers);
	}

}
