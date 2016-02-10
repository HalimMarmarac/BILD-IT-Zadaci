package zadaci_10_02_2016;

import java.util.*;
import zadaci_10_02_2016.Triangle;

public class Zadatak1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		// array for 3 sides of triangle
		double[] sides = new double[3];
		// input sides
		System.out.print("Enter three sides of a triangle: ");
		for (int i = 0; i < sides.length; i++) {
			try {
				sides[i] = in.nextDouble();
				// is user input sign or leters
			} catch (InputMismatchException e) {
				System.out.println("Wrong input!\nEnter again: ");
				in.nextLine();
				i--;
			}
		}
		// input color
		System.out.print("Enter a triangle color: ");
		String color = in.next();
		// input is filed od not with entered color
		System.out.print("Is the triangle filled? true/false: ");
		String isFilledString = in.next();
		// return if is filed or not
		boolean isFilled = (isFilledString.equals("true"));
		// creating new triangle with entered parameters
		Triangle t1 = null;
		t1 = new Triangle(sides[0], sides[1], sides[2]);
		t1.setColor(color);
		t1.setFilled(isFilled);
		// printing info about triangle
		System.out.println("\nTRIANGLE 1***");
		System.out.println("Area = " + t1.getArea());
		System.out.println("Perimeter = " + t1.getPerimeter());
		System.out.println("Color = " + t1.getColor());
		System.out.println("Is filled? " + t1.isFilled());

		in.close();
	}

}
