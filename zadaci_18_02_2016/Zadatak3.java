package zadaci_18_02_2016;

import zadaci_18_02_2016.ComparableCircle;

public class Zadatak3 {

	public static void main(String[] args) {
		// creating two objects (Circle)
		ComparableCircle c1 = new ComparableCircle(5);
		ComparableCircle c2 = new ComparableCircle(10);
		// this object is max from two above
		ComparableCircle c3 = (ComparableCircle) GeometricObject.max(c1, c2);
		// print result
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("Max circle = " + c3);
	}

}
