package zadaci_11_02_2016;

import java.util.*;

public class Zadatak3 {

	private static double sum(ArrayList<Double> list) {
		// sum variable
		double sum = 0;
		// go through list and add each element to sum
		for (double i : list) {
			sum += i;
		}
		return sum; // return sum of elements
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		// creating new list
		ArrayList<Double> list = new ArrayList<>();
		// input elements in list
		System.out.print("Enter 5 numbers: ");
		for (int i = 0; i < 5; i++) {
			try {
				list.add(in.nextDouble());
				// if it is a letter or sign
			} catch (InputMismatchException e) {
				System.out.println("Wrong input!\nNo letters or signs!\nEnter again: ");
				in.nextLine();
				i--;
			}
		}
		// print list
		System.out.println("\nList***");
		System.out.println(list);
		// printing result
		System.out.println("The sum of the 5 numbers = " + sum(list));

		in.close();
	}

}
