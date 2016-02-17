package zadaci_17_02_2016;

import java.io.*;
import java.util.*;

public class Zadatak3 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int year = 0; // year
		boolean q = true; // for while loop
		while (q) {
			// input year
			try {
				System.out.print("Enter year (1880-2014): ");
				year = in.nextInt();
				q = false;
				// if it is not integer
			} catch (InputMismatchException e) {
				System.out.println("Wrong input! Integers only!");
				in.nextLine();
			}
		}
		// input name
		System.out.print("Enter name: ");
		String name = in.next();
		// capitalize name
		name = Character.toUpperCase(name.charAt(0)) + name.substring(1);
		in.close();
		// records are changed and now there is only one name in a row (row number is ranking number)
		File file = new File("src\\zadaci_17_02_2016\\babynames\\yob" + year + ".txt");
		if (!file.exists()) {
			System.out.println("No record for " + year);
			System.exit(1);
		}

		int rank = 0; // rank
		int temp = 0; // if name is not on list this is used
		// read line by line until name is in the line
		try {
			Scanner read = new Scanner(file);
			while (read.hasNext()) {
				String s = read.nextLine();
				rank++; // number of lines also means rank
				// if line contains name exit while loop
				if (s.contains(name)) {
					break;
				}
				else {
					temp++;
				}
			}
			read.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// print results
		if (rank == temp) {
			System.out.println("The name " + name + " is not ranked in year " + year);
		} else {
			System.out.println(name + " is ranked #" + rank + " in year " + year);
		}
	}

}
