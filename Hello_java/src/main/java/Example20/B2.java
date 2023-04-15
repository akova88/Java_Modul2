package Example20;

import java.util.Arrays;

public class B2 {
    public static void main(String[] args) {
//        Bài 2: Hãy liệt kê các vị trí mà giá trị tại đó là số nguyên tố
//trong mảng 1 chiều các số nguyên
        int[] numbers = {1, 3, 5, 7, 8, 11};
        System.out.println(Arrays.toString(numbers));
        int count = 0;
        for ( int i = 0; i < numbers.length; i++ ) {
            if (checkIsPrime(numbers[i])) {
                System.out.println("Số nguyên tố: "+ numbers[i]+" tại vị trí: " + i);
                count++;
            }
        }
        if ( count == 0)
            System.out.println("Không có SNT trong mảng");
    }
    public static boolean checkIsPrime( int number) {
        if (number < 2)
            return false;
        else {
            int i = 2;
            boolean check = true;
            while ( i <= Math.sqrt(number) ) {
                if ( number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                return true;
            } else
                return false;
        }
    }
}
