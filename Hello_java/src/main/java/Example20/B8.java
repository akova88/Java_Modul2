package Example20;

import java.util.Arrays;

public class B8 {
    public static void main(String[] args) {
//        Bài 8: Sắp xếp lẻ tăng dần nhưng giá trị khác giữ nguyên vị trí
        int[] numbers = {2, 4, 7, 11, 9, 3, 1, 0, 15, 6};
        for( int i = 0; i < numbers.length-1; i++) {
            if ( numbers[i] % 2 == 0) {
                continue;
            }
            for( int j = i+1; j < numbers.length; j++) {
                if ( numbers[j] % 2 == 0) {
                    continue;
                }
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
