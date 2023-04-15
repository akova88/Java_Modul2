package Example20;

import java.util.Arrays;

public class B3 {
    public static void main(String[] args) {
//        Bài 3: Đếm số lượng giá trị tận cùng bằng 5 trong mảng
        int[] numbers = {35, 3335, 2325, 323, 434, 765, 5};
        System.out.println(Arrays.toString(numbers));
        int count = 0;

        for ( int elment : numbers) {
            String str = Integer.toString(elment);
            if ( Integer.parseInt(String.valueOf(str.charAt(str.length()-1))) == 5 ) {
                count++;
            }
        }
        System.out.println(count);
    }
}
