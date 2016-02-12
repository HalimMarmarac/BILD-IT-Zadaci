package zadaci_12_02_2016;

import java.util.*;
import zadaci_12_02_2016.MyPoint;

public class Zadatak1 {

	// Area of a Convex Polygon
	public static double getConvexPolygonArea(ArrayList<MyPoint> points) {
		// points must be counter clockwise
		double sum1 = 0;
		double sum2 = 0;
		for (int i = 0; i < points.size(); i++) {
			int limitIndex = (i + 1) % points.size();
			MyPoint p1 = points.get(i);
			MyPoint p2 = points.get(limitIndex);
			sum1 += (p1.x * p2.y);
			sum2 += (p1.y * p2.x);
		}

		double area = (sum1 - sum2) / 2;
		return (area > 0) ? area : -area;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int numOfPoints = 0;
		boolean q = true;
		while (q) {
			// input integer value
			try {
				System.out.print("Enter the number of the points: ");
				numOfPoints = in.nextInt();
				q = false;
				// if it is not integer
			} catch (InputMismatchException e) {
				System.out.println("Wrong input!\nIntegers only!");
				in.nextLine();
			}
		}
		
		System.out.print("Enter the coordinates of the points: ");
		ArrayList<MyPoint> points = new ArrayList<>();
		for (int i = 0; i < numOfPoints; i++) {
			points.add(new MyPoint(in.nextDouble(), in.nextDouble()));
		}

		System.out.println("The total area is " + getConvexPolygonArea(points));

		in.close();
	}

}
