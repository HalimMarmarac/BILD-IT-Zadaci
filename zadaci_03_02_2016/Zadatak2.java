package zadaci_03_02_2016;

import java.util.Scanner;

public class Zadatak2 {

	public static double[][] multiplyMatrix(double[][] a, double[][] b) {
		// matrix to put result into
		double[][] multipliedMatrix = new double[a.length][a[0].length];
		// multiplication of two matrices
		for (int i = 0; i < multipliedMatrix.length; i++) {
			for (int j = 0; j < multipliedMatrix.length; j++) {
				for (int k = 0; k < multipliedMatrix[0].length; k++) {
					multipliedMatrix[i][j] += a[i][k] * b[k][j];
				}
			}
			System.out.println();
		}

		return multipliedMatrix;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		// input forst matrix
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
		// call method to multiply matrices
		double[][] multipliedMatrix = multiplyMatrix(matrix1, matrix2);
		// printing the result
		for (int i = 0; i < matrix1.length; i++) {
			for (int k = 0; k < matrix1[i].length; k++) {
				System.out.printf("%2.1f ", matrix1[i][k]);
				if (i == 1 && k == 2)
					System.out.printf("%2s ", " * ");
				else
					System.out.printf("%3s ", " ");
			}
			for (int k = 0; k < matrix2[i].length; k++) {
				System.out.printf("%2.1f ", matrix2[i][k]);
				if (i == 1 && k == 2)
					System.out.printf("%2s ", " = ");
				else
					System.out.printf("%3s ", " ");
			}
			for (int k = 0; k < multipliedMatrix[i].length; k++) {
				System.out.printf("%2.1f ", multipliedMatrix[i][k]);
				System.out.printf("%3s ", " ");
			}
			System.out.println();
		}
		
		in.close();
	}
}
