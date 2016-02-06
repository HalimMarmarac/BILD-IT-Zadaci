package zadaci_06_02_2016;

import zadaci_06_02_2016.MyPoint;

public class Zadatak3 {
	
	public static void main(String[] args) {

        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(10, 30.5);
        
        System.out.printf("Distance between point1 and point2 = %.2f", p1.distance(p2));
       
    }

}
