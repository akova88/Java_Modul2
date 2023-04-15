package Example20;

public class B6 {
    public static void main(String[] args) {
//        Bài 6: Hãy cho biết tất cả các phần tử trong mảng a có nằm trong mảng b không?
        int[] arrayA = {1, 2, 3, 9};
        int[] arrayB = {1, 4, 5, 2, 6, 7, 3, 9};
        System.out.println(checkEqual(arrayA, arrayB));
    }
    public static boolean checkEqual(int[] arr, int[] brr) {
        boolean check = true;
        int count = 0;
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < brr.length; j++) {
                if (arr[i] == brr[j]) {
                    count++;
                    break;
                }
            }
        if (count != arr.length) {
            check = false;
        }
        return check;
    }
}
