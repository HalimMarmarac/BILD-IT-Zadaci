package zadaci_02_02_2016;

import java.util.*;

public class Zadatak4 {
	
	public static double sumColumn(double[][] m, int columnIndex) {

        double total = 0;
        // sum of columns of matrix
        for (int i = 0; i < m.length; i++) {
            total += m[i][columnIndex];
        }
        return total; // return sum
    }
	// method for printing matrix
    public static void displayMatrix(double[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }
	
	public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        System.out.print("Enter a 3 X 4 matrix: ");
        // read user input: 3 by 4 matrix
        double[][] matrix = new double[3][4];
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                matrix[i][j] = in.nextDouble();
        System.out.println("\nMATRIX***");
        // printing matrix
        displayMatrix(matrix);
        System.out.println();
        // printing result
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.println("Sum of the elements at column" + i +" is " + sumColumn(matrix, i));
        }
        
        in.close();
    }

}
