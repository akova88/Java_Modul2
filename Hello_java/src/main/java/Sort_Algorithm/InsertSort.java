package Sort_Algorithm;

import java.util.Arrays;

public class InsertSort {

    static int[] numbers = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12, -66, 77};
    public static void insertSort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {

            int key = numbers[i];
            int pos = i;

            while (pos > 0 && numbers[pos-1] > key) {
                numbers[pos] = numbers[pos-1];
                pos = pos -1;

            }
            System.out.println("\nLần chạy thứ " + i + ":");
            System.out.println("Key = " + key);
            System.out.println("Trạng thái mảng trước khi sắp xếp:");
            System.out.println(Arrays.toString(numbers));
            numbers[pos] = key;
            System.out.println("Trạng thái mảng sau khi sắp xếp:");
            System.out.println(Arrays.toString(numbers));
        }
    }

    public static void main(String[] args) {
        insertSort(numbers);
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
