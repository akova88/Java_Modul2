package OPP_Class.StopWatch;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size = 100000;
        int[] numbers = new int[size];
        for ( int i = 0; i<size; i++) {
            numbers[i] = (int) (Math.random()*size);
        }
        System.out.println("Mảng khởi tạo là: "+ Arrays.toString(numbers));
        StopWatch sw = new StopWatch();
        sw.star();
        System.out.println("Mảng sau khi sort: " + Arrays.toString(selectionSort(numbers)));
        sw.stop();
        System.out.println("Thời gian để chạy sort = " + sw.getElapsedTime().toMillis()+ "milliseconds" );
    }

    public static int[] selectionSort(int[] a) {
        for ( int i = 0; i < a.length-1; i++) {
            int min = i;
            for ( int j = i+1; j < a.length; j++) {
                if ( a[j] < a[min]) {
                    min = j;
                }
                if (min !=j) {
                    int temp = a[min];
                    a[min] = a[i];
                    a[i] = temp;
                }
            }
        }
        return a;
    }
}
