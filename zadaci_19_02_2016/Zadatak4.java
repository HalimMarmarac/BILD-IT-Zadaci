package zadaci_19_02_2016;

import zadaci_19_02_2016.Circle;
import zadaci_19_02_2016.MyRectangle;

public class Zadatak4 {

	public static void main(String[] args) {
		// creating 2 circles and 2 rectangles
		GeometricObject[] shapes = new GeometricObject[4];
		shapes[0] = new Circle(3);
		shapes[1] = new Circle(2);
		shapes[2] = new MyRectangle(2, 10);
		shapes[3] = new MyRectangle(5, 2);
		// printing areas of all objects
		for (int i = 0; i < 4; i++) {
			System.out.println("Area for object #" + (i + 1) + " = " + shapes[i].getArea());
		}
		// printing sum of areas
		System.out.println("Sum of GeometricObjects = " + GeometricObject.sumArea(shapes));
	}

}
