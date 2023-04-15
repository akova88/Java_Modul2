package Example20;

import java.util.Arrays;

public class B9 {
    public static void main(String[] args) {
//        Bài 9: Sắp xếp số dương tăng dần, âm giảm dần. Vị trí tương đối không thay đổi
        int[] numbers = {14, 9, -3, -1, 0, 10, -15, -8, 3, -22, 15 };
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] >= 0 ) {
                int minIndex = i;
                for (int j = i+1;j<numbers.length; j++ ) {
                    if (numbers[j] >= 0) {
                        if (numbers[minIndex] > numbers[j]) {
                            minIndex = j;
                        }
                    }
                }
                if (minIndex != i) {
                    int temp = numbers[minIndex];
                    numbers[minIndex] = numbers[i];
                    numbers[i] = temp;
                }
            }else if (numbers[i] < 0){
                int maxIndex = i;
                for (int j = i+1; j<numbers.length; j++) {
                    if (numbers[j] < 0) {
                        if (numbers[maxIndex] < numbers[j]) {
                            maxIndex = j;
                        }
                    }
                }
                if (maxIndex != i) {
                    int temp = numbers[maxIndex];
                    numbers[maxIndex] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
