package zadaci_05_02_2016;

import java.util.*;
import zadaci_05_02_2016.LinearEquation;

public class Zadatak4 {
	
	public static void main(String[] strings) {

        Scanner in = new Scanner(System.in);
        // initialising a,b,c,d,e,f
        double a = 0;
        double b = 0;
        double c = 0;
        double d = 0;
        double e = 0;
        double f = 0;
        boolean q = true;
        // input from user
		while (q) {
			try {
				System.out.print("Enter a: ");
				a = in.nextDouble();
				q = false;
			} catch (InputMismatchException ex) {
				System.out.println("Wrong input! No letters or signs!");
				in.nextLine();
			}
		}
		q = true;
		while (q) {
			try {
				System.out.print("Enter b: ");
				b = in.nextDouble();
				q = false;
			} catch (InputMismatchException ex) {
				System.out.println("Wrong input! No letters or signs!");
				in.nextLine();
			}
		}
		q = true;
		while (q) {
			try {
				System.out.print("Enter c: ");
				c = in.nextDouble();
				q = false;
			} catch (InputMismatchException ex) {
				System.out.println("Wrong input! No letters or signs!");
				in.nextLine();
			}
		}
		q = true;
		while (q) {
			try {
				System.out.print("Enter d: ");
				d = in.nextDouble();
				q = false;
			} catch (InputMismatchException ex) {
				System.out.println("Wrong input! No letters or signs!");
				in.nextLine();
			}
		}
		q = true;
		while (q) {
			try {
				System.out.print("Enter e: ");
				e = in.nextDouble();
				q = false;
			} catch (InputMismatchException ex) {
				System.out.println("Wrong input! No letters or signs!");
				in.nextLine();
			}
		}
		q = true;
		while (q) {
			try {
				System.out.print("Enter f: ");
				f = in.nextDouble();
				q = false;
			} catch (InputMismatchException ex) {
				System.out.println("Wrong input! No letters or signs!");
				in.nextLine();
			}
		}
		// creating new equation with entered values
        LinearEquation equation = new LinearEquation(a,b,c,d,e,f);
        // checking if equation is sovable and printing result
        if (equation.isSolvable()) {
            System.out.println("x is " + equation.getX() + " and y is " + equation.getY());
        } else {
            System.out.println("The equation has no solution.");
        }
        
        in.close();
    }

}
