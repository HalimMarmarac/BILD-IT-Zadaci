package zadaci_02_02_2016;

import java.util.*;

public class Zadatak2 {

	public static int getRandom(int... numbers) {
		// generating random number 1-54 excluding 10 nums user entered
		int random = (int) (Math.random() * 54 + 1);
		for (int i = 0; i < numbers.length; i++) {
			if (random == numbers[i]) {
				random = (int) (Math.random() * 54 + 1);
				i = -1;
			}
		}
		return random; // return random number
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		// arraya to put 10 nums in
		int[] numbers = new int[10];
		// getting 10 nums from user
		System.out.print("Enter ten numbers to exclude from random (1-54):\n");
		for (int i = 0; i < numbers.length; i++) {
			try {
				numbers[i] = in.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Wrong input!\nIntegers only!: ");
				in.nextLine();
				i--;
			}
		}
		// printing random number 1-54 excluding 10 nums user entered
		System.out.println("Number generated: " + getRandom(numbers));

		in.close();
	}
}
