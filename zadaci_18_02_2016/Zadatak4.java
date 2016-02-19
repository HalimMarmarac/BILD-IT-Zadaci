package zadaci_18_02_2016;

import zadaci_18_02_2016.Square;
import zadaci_18_02_2016.Circle;
import zadaci_18_02_2016.MyRectangle;

public class Zadatak4 {

	public static void main(String[] args) {
		// array of 5 objects
        GeometricObject[] geoShapes = new GeometricObject[5];
        // creating 5 objects
        geoShapes[0] = new MyRectangle();
        geoShapes[1] = new Circle(5);
        geoShapes[2] = new Square();
        geoShapes[3] = new MyRectangle(10, 5);
        geoShapes[4] = new Square(0,0,25);
        // if object implements Colorable interface print message if not just area of object
        for (int i = 0; i < geoShapes.length; i++) {
            System.out.println("shape #" + (i + 1) + " area = " + geoShapes[i].getArea());
            if (geoShapes[i] instanceof Colorable) {
                System.out.println("\tHow to color: "+((Colorable)geoShapes[i]).howToColor());
            }
        }
    }

}
