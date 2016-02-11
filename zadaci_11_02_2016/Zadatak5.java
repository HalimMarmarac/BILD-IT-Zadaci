package zadaci_11_02_2016;

import java.util.*;

public class Zadatak5 {

	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		// creating new list and adding 2 lists in it
		ArrayList<Integer> list = new ArrayList<>();
		list.addAll(list1);
		list.addAll(list2);
		return list;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		// creating 2 lists for union
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		// input 2 lists
		System.out.print("Enter five integers for list1: ");
		for (int i = 0; i < 5; i++) {
			try {
				list1.add(in.nextInt());
				// if it is not integer
			} catch (InputMismatchException e) {
				System.out.println("Wrong input!\nIntegers only!\nEnter again: ");
				in.nextLine();
				i--;
			}
		}
		System.out.print("Enter five integers for list2: ");
		for (int i = 0; i < 5; i++) {
			try {
				list2.add(in.nextInt());
				// if it is not integer
			} catch (InputMismatchException e) {
				System.out.println("Wrong input!\nIntegers only!\nEnter again: ");
				in.nextLine();
				i--;
			}
		}
		// print list 1 and 2
		System.out.println("\nList1***");
		System.out.println(list1);
		System.out.println("List2***");
		System.out.println(list2);
		// printing results
		System.out.println("Combined list is " + union(list1, list2));

		in.close();
	}

}
