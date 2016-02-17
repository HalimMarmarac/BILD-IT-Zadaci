package zadaci_17_02_2016;

import java.util.ArrayList;

public class Zadatak4 {
	// shuffle list
	public static void shuffle(ArrayList<Number> list) {

		// simple solution Collections.shuffle(list);

		// manual shuffle
		for (int i = 0; i < list.size(); i++) {
			int randomIndex = (int) (Math.random() * list.size());
			Number temp = list.get(randomIndex);
			list.set(randomIndex, list.get(i));
			list.set(i, temp);
		}

	}

	public static void main(String[] args) {
		// list of 20 numbers
		ArrayList<Number> list = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			list.add(i);
		}
		// print list as inuputed
		System.out.println(list);
		// shufflelist using method
		shuffle(list);
		// print shuffled list
		System.out.println(list);
	}

}
