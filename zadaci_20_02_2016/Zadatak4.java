package zadaci_20_02_2016;

import java.util.*;
import zadaci_20_02_2016.Complex;

public class Zadatak4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		// input 2 complex numbers from user
		System.out.println("Enter the first complex number: ");
		Complex complex1 = new Complex(in.nextDouble(), in.nextDouble());
		System.out.println("Enter the second complex number: ");
		Complex complex2 = new Complex(in.nextDouble(), in.nextDouble());
		// using complex methods and printing results
		System.out.println(complex1 + " + " + complex2 + " = " + complex1.add(complex2));
		System.out.println(complex1 + " - " + complex2 + " = " + complex1.subtract(complex2));
		System.out.println(complex1 + " * " + complex2 + " = " + complex1.multiply(complex2));
		System.out.println(complex1 + " / " + complex2 + " = " + complex1.divide(complex2));
		System.out.println("|" + complex1 + "| = " + complex1.abs());
		
		in.close();
	}

}
