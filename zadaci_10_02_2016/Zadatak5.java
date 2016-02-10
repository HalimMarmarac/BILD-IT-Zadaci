package zadaci_10_02_2016;

import java.util.ArrayList;

public class Zadatak5 {

	public static void shuffle(ArrayList<Integer> list) {

		// simple solution with Collections.shuffle(list);

		// manual shuffle
		for (int i = 0; i < list.size(); i++) {
			int randomIndex = (int) (Math.random() * list.size());
			int temp = list.get(randomIndex);
			list.set(randomIndex, list.get(i));
			list.set(i, temp);
		}

	}

	public static void main(String[] args) {
		// list of integers
		ArrayList<Integer> list = new ArrayList<>();
		// adding numbers 0-100 to list
		for (int i = 0; i < 100; i++) {
			list.add(i);
		}
		// printing list
		System.out.println(list);
		// shuffle list
		shuffle(list);
		// print shufflet list
		System.out.println(list);
	}

}
