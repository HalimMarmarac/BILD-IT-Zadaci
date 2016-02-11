package zadaci_11_02_2016;

import java.util.*;

public class Zadatak4 {

	public static void removeDuplicate(ArrayList<Integer> list) {
		// creating new list
		ArrayList<Integer> temp = new ArrayList<>();
		// go through input list and if one element is added once skip it
		for (int i = 0; i < list.size(); i++) {
			if (!temp.contains(list.get(i))) {
				temp.add(list.get(i));
			}
		}
		list.clear(); // clear input list
		list.addAll(temp); // input list is now new list with no duplicates

	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		// input elements in list
		System.out.print("Enter 10 integers: ");
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
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
		// call method for removing duplicates in list
		removeDuplicate(list);
		// printing new list with no duplicates
		System.out.println("List with no duplicates***");
		System.out.println(list);

		in.close();
	}

}
