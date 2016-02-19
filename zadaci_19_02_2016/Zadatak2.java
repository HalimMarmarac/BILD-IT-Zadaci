package zadaci_19_02_2016;

import zadaci_19_02_2016.MyRectangle;

public class Zadatak2 {

	public static void main(String[] args) {
		// creating and comparing two rectangles via area
		MyRectangle rec1 = new MyRectangle(5, 5);
		MyRectangle rec2 = new MyRectangle(5, 5);
		System.out.println("rec1 equals rec2 ? " + rec1.equals(rec2));
	}
}
