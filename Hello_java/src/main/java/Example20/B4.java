package Example20;

public class B4 {
    public static void main(String[] args) {
//        Bài 4: Kiểm tra mảng có giá trị 0 hay không? Có trả về 1, không có trả về 0
        int[] numbers = { 1, 3, 6, 7, 7, 0};
        int[] numbers1 = {1, 4, 5, 6, 4, 0};

        System.out.println(checkZero(numbers));
        System.out.println(checkZero(numbers1));
    }
    public static int checkZero(int[] arr) {
        int check = 0;
        for(int value : arr) {
            if ( value == 0) {
                check = 1;
                break;
            }
        }
        return check;
    }
}
