package zadaci_18_02_2016;

import zadaci_18_02_2016.MyRectangle;

public class Zadatak2 {
	public static void main(String[] args) {
		// creating 2 objects
		MyRectangle r1 = new MyRectangle(10, 5);
		MyRectangle r2 = new MyRectangle(10, 10);
		// new object to put max from two above
		MyRectangle maxRectangle = (MyRectangle) GeometricObject.max(r1, r2);
		// print result
		System.out.println("Rectangle 1: " + r1);
		System.out.println("Rectangle 2: " + r2);
		System.out.println("Max Rectangle is: " + maxRectangle);

	}

}
