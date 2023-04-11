package Array_Method;

import java.util.Scanner;

public class findMax {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap do dai mang:");
            size = sc.nextInt();
            if (size > 20)
                System.out.print("Do dai mang khong vuot qua 20");
        } while (size > 20);
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.print("Nhap vao gia tri cua ty phu thu " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.print("Gia tri tai san cua cac ti phu: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
        int max = arr[0];
        int index = 1;
        for ( int j = 0; j < arr.length; j++ ) {
            if ( arr[j] > max) {
                max = arr[j];
                index = j + 1;


            }
        }
        System.out.println("Gia tri tai san lon nhat la: " + max + " cua ty phu thu: " + index);
    }
}
