package zadaci_24_02_2016;

import java.util.*;

public class Zadatak1 {

	// removing duplicates in list
	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
		// new array list same size as input list
		ArrayList<E> newList = new ArrayList<>(list.size());
		// removing duplicates from list
		for (E aList : list) {
			if (!newList.contains(aList)) {
				newList.add(aList);
			}
		}
		return newList;
	}

	public static void main(String[] args) {
		// new array with 7 times "list" and 2 times "test" in it
		ArrayList<String> strings = new ArrayList<>();
		for (int i = 0; i < 7; i++) {
			strings.add("list");
		}
		for (int i = 0; i < 2; i++) {
			strings.add("test");
		}
		// print first array
		System.out.println("List1***");
		for (String s : strings) {
			System.out.print(s + " ");
		}
		// removing duplicates from list
		strings = removeDuplicates(strings);
		// print second list with no duplicates
		System.out.println("\n\nList2 with no duplicates from List1***");
		for (String s : strings) {
			System.out.print(s + " ");
		}
	}

}
