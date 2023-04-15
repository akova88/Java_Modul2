package Example20;

import java.util.Arrays;

public class B13 {
    public static void main(String[] args) {
//        Bài 13: Xóa tất cả các số chẵn trong mảng
        int size = 20;
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100 + Math.random() * (-100));
        }
        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.toString(removeElement(numbers)));
    }

    public static int[] removeElement(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            while (arr[i] % 2 == 0) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                count++;
            }
        }
        int[] newArr = new int[arr.length - count];
        for (int j = 0; j < newArr.length; j++) {
            newArr[j] = arr[j];
        }
        return newArr;
    }

}
