package Array_Method;

import java.util.Arrays;
import java.util.Scanner;

public class findMaxInMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số hàng của matrix: ");
        int row = sc.nextInt();

        System.out.print("Nhập số cột của matrix: ");
        int column = sc.nextInt();
        double[][] matran = createMatrix(row, column);
        printMatrix(matran);
        System.out.println("Phần tử có giá trị max: "+ maxElement(matran));
    }
    public static double maxElement(double[][] matrix) {
        double max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ( matrix[i][j] > max)
                    max = matrix[i][j];
            }
        }
        return max;
    }
    public static void printMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static double[][] createMatrix(int row, int column) {
        Scanner sc = new Scanner(System.in);
        double[][] matrix = new double[row][column];
        for (int i = 0; i < matrix.length; i++ ) {
            for ( int j = 0; j < matrix[i].length; j++ ) {
                System.out.print("Nhập phần tử vị trí ["+i+"]["+j+"]");
                matrix[i][j] = sc.nextDouble();
            }
        }
        return matrix;
    }
}
