package Example20;

import java.util.Arrays;

public class B15 {
    public static void main(String[] args) {
//   Bài 15: Hãy đưa tất cả các số 1 về đầu mảng
        int[] numbers = {1, 1, 8, 4, 6, 3, 5, 3, 1, 8, 4, 1, 1};
        for ( int i = 0,k =0; i < numbers.length; i++) {
            if ( numbers[i] == 1) {
                int temp = numbers[i];
                for ( int j = i; j > k; j--) {
                    numbers[j] = numbers[j-1];
                }
                numbers[k] = temp;
                k++;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
