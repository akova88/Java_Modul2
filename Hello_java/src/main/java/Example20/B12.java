package Example20;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class B12 {
    public static void main(String[] args) {
//        Bài 12: Xóa tất cả các số âm trong mảng
        Scanner sc = new Scanner(System.in);
        int size = 20;
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100 + Math.random() * (-100));
        }
        System.out.println(Arrays.toString(numbers));
        removeElement(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void removeElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] < 0) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = 0;
            }
        }
//            int k =0;
//            for (int i=0;i< arr.length;i++){
//                if (arr[i] > 0) {
//                        arr[k]=arr[i];
//                        k++;
//                }
//            }
//            while (k<arr.length){
//                arr[k]=0;
//                k++;
//            }
    }
//        System.out.println(Arrays.toString(arr));
}

