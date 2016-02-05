package zadaci_05_02_2016;

import java.util.*;
import zadaci_05_02_2016.QuadraticEquation;

public class Zadatak3 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		// creatin variables
		double a = 0;
		double b = 0;
		double c = 0;
		
		boolean q = true;
		// input a from user
		while (q) {
			try {
				System.out.print("Enter a: ");
				a = in.nextDouble();
				q = false;
			} catch (InputMismatchException e) {
				System.out.println("Wrong input! No letters or signs!");
				in.nextLine();
			}
		}
		q = true;
		// input b
		while (q) {
			try {
				System.out.print("Enter b: ");
				b = in.nextDouble();
				q = false;
			} catch (InputMismatchException e) {
				System.out.println("Wrong input! No letters or signs!");
				in.nextLine();
			}
		}
		q = true;
		// input c
		while (q) {
			try {
				System.out.print("Enter c: ");
				c = in.nextDouble();
				q = false;
			} catch (InputMismatchException e) {
				System.out.println("Wrong input! No letters or signs!");
				in.nextLine();
			}
		}
		// creating new equation with entered a,b,c
		QuadraticEquation equation = new QuadraticEquation(a, b, c);
		// geting discriminant for equation
		double discriminant = equation.getDiscriminant();
		// printing results for each option
		if (discriminant > 0) {
			System.out.println("The roots are " + equation.getRoot1() + " and " + equation.getRoot2());
		} else if (discriminant == 0) {
			System.out.println("The root is " + equation.getRoot1());
		} else {
			System.out.println("The equation has no roots");

		}

		in.close();
	}

}
