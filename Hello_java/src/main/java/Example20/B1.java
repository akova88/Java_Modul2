package Example20;

import java.util.Arrays;

public class B1 {
    public static void main(String[] args) {
//        Bài 1: Hãy liệt kê các giá trị có toàn chữ số lẻ trong mảng 1 chiều các số nguyên
//        Integer.parseInt(String.valueOf(str.charAt(i))  createArrayRandom(10);
        int[] myNumbers = {-5, -13, 3, 8};
        System.out.println(Arrays.toString(myNumbers));
        for ( int element : myNumbers) {
            String str = Integer.toString(element);
            boolean check = true;
            for ( int i = 0; i < str.length(); i++ ) {

                if ((str.charAt(i)) % 2 == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(element);
            }
        }
    }
    public static int[] createArrayRandom(int size) {
        int[] numbers = new int[size];
        for ( int i = 0; i < size; i++) {
            numbers[i] = (int) (Math.random()* 1000);
        }
        return numbers;
    }
}
