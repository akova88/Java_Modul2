package Array_Method;

import java.util.Scanner;

public class sumDiagonalInMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số hàng của Matrix: ");
        int row = sc.nextInt();

        System.out.print("Nhập số cột của Matrix: ");
        int column = sc.nextInt();
        double[][] matrix2 = findMaxInMatrix.createMatrix(row, column);
        findMaxInMatrix.printMatrix(matrix2);
        int sumDia = 0;
        for ( int i = 0; i < matrix2.length; i++) {
            sumDia += matrix2[i][i];
        }
        System.out.println("Tổng các số ở đường chéo: " + sumDia);
    }
}
