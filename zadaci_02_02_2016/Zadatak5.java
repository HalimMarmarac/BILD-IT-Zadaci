package zadaci_02_02_2016;

import java.util.*;

public class Zadatak5 {
	
	public static double[][] addMatrix(double[][] a, double[][] b) {
		// new matrix for sum of other two
        double[][] addedMatrix = new double[a.length][a[0].length];
        // sum of matrix a and b
        for (int i = 0; i < a.length; i++) {
            for (int k = 0; k < a[0].length; k++) {
                addedMatrix[i][k] = a[i][k] + b[i][k];
            }
        }
        // returning sum of matrix a&b
        return addedMatrix;
    }

	
	public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // input first matrix
        System.out.print("Enter 3x3 matrix 1: ");
        double[][] matrix1 = new double[3][3];
        for (int i = 0; i < matrix1.length; i++)
            for (int k = 0; k < matrix1[i].length; k++)
                matrix1[i][k] = in.nextDouble();

        // input second matrix
        System.out.print("Enter 3x3 matrix 2: ");
        double[][] matrix2 = new double[3][3];
        for (int i = 0; i < matrix2.length; i++)
            for (int k = 0; k < matrix2[i].length; k++)
                matrix2[i][k] = in.nextDouble();
        // new matrix to put returned sum of matrix a&b in
        double[][] addedMatrix = addMatrix(matrix1, matrix2);
        // printing result (a+b=sum(a,b)
        for (int i = 0; i < matrix1.length; i++) {
            for (int k = 0; k < matrix1[i].length; k++) {
                System.out.printf("%2.1f ", matrix1[i][k]);
                if (i == 1 && k == 2) System.out.printf("%2s ", " + ");
                else System.out.printf("%3s ", " ");
            }
            for (int k = 0; k < matrix2[i].length; k++) {
                System.out.printf("%2.1f ", matrix2[i][k]);
                if (i == 1 && k == 2) System.out.printf("%2s ", " = ");
                else System.out.printf("%3s ", " ");

            }
            for (int k = 0; k < addedMatrix[i].length; k++) {
                System.out.printf("%4.1f ", addedMatrix[i][k]);
            }
            System.out.println("");

        }
        in.close();
    }

}
