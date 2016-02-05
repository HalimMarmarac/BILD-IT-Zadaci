package zadaci_05_02_2016;

import zadaci_05_02_2016.RegularPolygon; // import RegularPolygon class

public class Zadatak2 {

	public static void main(String[] args) {
		// creating new polygon with 3 diferent constructors
		RegularPolygon[] regularPolygons = new RegularPolygon[3];
		regularPolygons[0] = new RegularPolygon();
		regularPolygons[1] = new RegularPolygon(6, 4);
		regularPolygons[2] = new RegularPolygon(10, 4, 5.6, 8.7);
		// printing area and parimeter for each oc 3 polygons
		for (int i = 0; i < 3; i++) {
			System.out.printf("Polygon #%d  area = %.2f   perimeter = %.2f\n", i, regularPolygons[i].getArea(),
					regularPolygons[i].getPerimeter());
		}
	}

}
