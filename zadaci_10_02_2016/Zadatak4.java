package zadaci_10_02_2016;

import java.util.*;
import zadaci_04_02_2016.Account; // Account class from earlier
import zadaci_10_02_2016.Circle;

public class Zadatak4 {

	public static void main(String[] args) {
		// list of objects
		ArrayList<Object> list = new ArrayList<>();
		// creating date, loan, string an circle objects and adding them to list
		list.add(new Circle(3));
		list.add("Some string...");
		list.add(new Date());
		list.add(new Account(2500, 230));
		// printing list
		for (Object o : list) {
			System.out.println(o);
		}

	}

}
