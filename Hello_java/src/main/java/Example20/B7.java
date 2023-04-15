package Example20;

import java.lang.reflect.Array;
import java.util.Arrays;

public class B7 {
    public static void main(String[] args) {
//        Bài 7: Sắp xếp số dương tăng dần, các số âm giữ nguyên vị trí
        int[] numbers = {-1, 9 ,3 ,-7 ,8 ,1 ,0 ,-3 ,-2, 0};

        for ( int i = 0; i < numbers.length-1; i++) {
            if (numbers[i] < 0) {
                continue;
            }
            for ( int j = i+1; j < numbers.length; j++) {
                if (numbers[j] < 0) {
                    continue;
                }
                if ( numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
