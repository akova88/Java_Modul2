package Array_Method;

import java.util.Arrays;
import java.util.Scanner;

public class removeInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 3, 2, 3, 4, 3, 5, 6};
        System.out.println("Nhập phần tử muốn xoá: ");
        int x = sc.nextInt();
        int index = findElement(x, arr);
        while (index != -1) {
            arr = remove(index, arr);
            index = findElement(x, arr);
        }
        System.out.println("Mảng sau khi xoá là: " + Arrays.toString(arr));
    }

    public static int findElement(int value ,int[] arr) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] == value)
                index = i;
        }
        return index;
    }

    public static int[] remove(int index_del, int[] arr) {

        for ( int i = index_del; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = 0;
        return arr;
    }
}



