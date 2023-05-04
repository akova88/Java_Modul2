package Search_Algorithm.binary_Search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng: ");
        int length = Integer.parseInt(sc.nextLine());
        int[] arr = new int[length];
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < length; i++) {
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Nhập giá trị cần tìm kiếm: ");
        int value = Integer.parseInt(sc.nextLine());
        int result = binarySearch(arr,0,length-1,value);

        if (result == -1) {
            System.out.println("Không tìm thấy giá trị trong mảng");
        } else {
            System.out.println("Giá trị " + value + " được tìm thấy ở vị trí "+ result);
        }

    }
    public static int binarySearch(int[] arr, int left, int right, int value) {
        if (right >= left){
            int middle = (right + left) / 2;
            if (arr[middle] == value) {
                return middle;
            }
            if (arr[middle] > value) {
                return binarySearch(arr, left, middle-1,value);
            }
            if (arr[middle] < value) {
                return binarySearch(arr, middle+1,right,value);
            }
        }
        return -1;
    }
}
