package zadaci_05_02_2016;

import java.util.*;
import zadaci_05_02_2016.LinearEquation;

public class Zadatak5 {

	public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // input points
        System.out.print("Enter (x1, y1), (x2, y2), (x3, y3), (x4, y4):\n");
        double[][] points = new double[4][2];
        for (int i = 0; i < points.length; i++)
            for (int j = 0; j < points[i].length; j++)
               try {
            	   points[i][j] = in.nextDouble();
               } catch (InputMismatchException e) {
					System.out.println("Wrong input! No letters or signs!\nEnter again: ");
					in.nextLine();
					j--; // if exception is called enter again at same position in array
				}
        // geting points from linear equation
        LinearEquation linear = LinearEquation.getIntersectingPoint(points);
        // check if equation is solvable and print the results
        if (linear.isSolvable()) {
            System.out.println("\nThe intersecting point is at (" + linear.getX() + ", " + linear.getY() + ")");
        } else {
            System.out.println("\nThe two lines are parallel.");
        }

        in.close();
    }
}
