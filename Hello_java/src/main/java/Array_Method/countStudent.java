package Array_Method;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class countStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println("Nhập kích thước mảng: ");
            size = sc.nextInt();
            if ( size > 30)
                System.out.println("Nhập lại size: ");
        } while (size > 30);
        array = new int[size];
        array = mergeArray.inputElement(array);
        System.out.println(Arrays.toString(array));
        int count = 0;
        for ( int i = 0; i < array.length; i++ ) {
            if (array[i] >=5 && array[i] <= 10)
                count++;
        }
        System.out.println("Tổng số sinh viên thi đỗ: " + count);
    }
}
