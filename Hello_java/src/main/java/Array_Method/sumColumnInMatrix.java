package Array_Method;

import java.util.Scanner;

public class sumColumnInMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số hàng của Matrix: ");
        int row = sc.nextInt();

        System.out.print("Nhập số cột của Matrix: ");
        int column = sc.nextInt();
        double[][] matrix1 = findMaxInMatrix.createMatrix(row, column);
        findMaxInMatrix.printMatrix(matrix1);
        System.out.print("Nhập cột muốn tính tổng: ");
        int columnSum = sc.nextInt();

        int sumCl = 0;
        for ( int i = 0; i < matrix1.length; i++ ) {
            sumCl += matrix1[i][columnSum-1];
        }
        System.out.println("Tổng các phần tử của cột thứ: "+ columnSum +" là: "+sumCl);
    }
}
