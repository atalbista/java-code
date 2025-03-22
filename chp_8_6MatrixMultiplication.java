//Algebra: multiply two matrices) Write a method to multiply two matrices. The
//header of the method is:

import java.util.Scanner;

public class chp_8_6MatrixMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first 3x3 matrix:");
        double[][] matrix1 = readMatrix(input);

        System.out.println("Enter the second 3x3 matrix:");
        double[][] matrix2 = readMatrix(input);

        double[][] result = multiplyMatrix(matrix1, matrix2);

        System.out.println("\nThe product of the matrices is:");
        printMatrix(result);
    }

    public static double[][] readMatrix(Scanner input) {
        double[][] matrix = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Enter element [%d][%d]: ", i + 1, j + 1);
                matrix[i][j] = input.nextDouble();
            }
        }
        return matrix;
    }

    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        double[][] result = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    public static void printMatrix(double[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%8.2f ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
