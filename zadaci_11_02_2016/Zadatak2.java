package zadaci_11_02_2016;

import java.util.*;

public class Zadatak2 {

	public static void sort(ArrayList<Integer> list) {

		// simple solution list.sort(null);

		// manual solution
		for (int i = 0; i < list.size() - 1; i++) {
			int currentMin = list.get(i);
			int currentIndex = i;
			// comparing next element in list with the one before
			for (int j = i + 1; j < list.size(); j++) {
				if (currentMin > list.get(j)) {
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

		Scanner in = new Scanner(System.in);

		System.out.print("Enter 5 numbers: ");
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			try {
				list.add(in.nextInt());
				// if it is not integer
			} catch (InputMismatchException e) {
				System.out.println("Wrong input!\nIntegers only!\nEnter again: ");
				in.nextLine();
				i--;
			}
		}
		// print list as inputed
		System.out.println("\nList as inputed***");
		System.out.println(list);
		// sort list calling method
		sort(list);
		// print sorted list
		System.out.println("Sorted list***");
		System.out.println(list);

		in.close();
	}

}
