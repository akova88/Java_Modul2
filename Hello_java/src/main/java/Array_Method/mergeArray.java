package Array_Method;

import java.util.Arrays;
import java.util.Scanner;

public class mergeArray {
    public static void main(String[] args) {

        int[] myList1 = new int[3];
        int[] myList2 = new int[4];
        System.out.println("Nhập mảng 1:");
        myList1 = inputElement(myList1);

        System.out.println("Nhập mảng 2:");
        myList2 = inputElement(myList2);

        int[] myList3;
        myList3 = mergeArr(myList1, myList2);

        System.out.println("Mảng 1: " + Arrays.toString(myList1));
        System.out.println("Mảng 2: " + Arrays.toString(myList2));
        System.out.println("Mảng 3: " + Arrays.toString(myList3));
    }
    public static int[] inputElement(int[] numbers) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i < numbers.length) {
            System.out.print("Nhập vào Mảng phần tử ở vị trí " + i + ":");
            numbers[i] = sc.nextInt();
            i++;
        }
        return numbers;
    }
    public static int[] mergeArr(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length + arr2.length];

        for( int i = 0; i < arr1.length; i++)
            arr[i] = arr1[i];
        for (int j = 0; j < arr2.length; j++)
            arr[arr1.length+j] = arr2[j];
        return arr;
    }
}
