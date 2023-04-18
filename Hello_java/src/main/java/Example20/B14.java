package Example20;

import java.util.Arrays;

public class B14 {
    public static void main(String[] args) {
// Bài 14: Xóa tất cả các phần tử trùng nhau trong mảng và chỉ giữ lại duy nhất 1 phần tử
        int[] numbers = {1, 1, 8, 4, 6, 3, 5, 3, 1, 8, 4, 1, 1};
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
        int[] newNumbers = new int[numbers.length - count];
        for (int i = 0, k = 0; i < numbers.length; i++) {
            boolean check = false;
            for (int j = 0; j < k; j++) {
                if ( numbers[i] == newNumbers[j]) {
                    check = true;
                    break;
                }
            }
            if ( !check) {
                newNumbers[k] = numbers[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(newNumbers));
    }

}
