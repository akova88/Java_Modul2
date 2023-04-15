package Example20;

public class B5 {
    public static void main(String[] args) {
//        Bài 5: Kiểm tra mảng có giảm dần hay không
        int[] numbers = {5, 4, 3, 2, 1, 0};
        int[] numbers1 = {12, 11, 9, 7, 8,};
        System.out.println(checkArrayDecrease(numbers));
        System.out.println(checkArrayDecrease(numbers1));
    }
    public static boolean checkArrayDecrease(int[] arr) {
        boolean check = true;
        for( int i = 0; i < arr.length-1; i++) {
            if ( arr[i] < arr[i+1]) {
                check = false;
                break;
            } else {
                check = true;
            }
        }
        return check;
    }
}
