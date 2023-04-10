package Array_Method;

import java.util.Arrays;
import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        int size;
        int [] arr;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập vào độ dài mảng:");
            size = sc.nextInt();
            if ( size > 20 )
                System.out.println("Độ dài mảng không vượt quá 20");
        } while (size > 20);
        arr = new int[size];
        int i = 0;
        while ( i < arr.length) {
            System.out.print("Nhập phần tử " + ( i + 1) + ": ");
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.print("Các phần tử trong mảng: ");
        for ( int j = 0; j < arr.length; j++ ) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
        for ( int j = 0; j < arr.length/2; j++) {
            int temp = arr[j];
            arr[j] = arr[size - 1 - j];
            arr[size - 1 - j] = temp;
        }
        System.out.print("Mảng sau khi đổi: ");
        for ( int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
