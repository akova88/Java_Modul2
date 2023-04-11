package Array_Method;

public class findMinimum {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 0, 9};
        int index = minValue(arr);
        System.out.println("Phần tử nhỏ nhất trong mảng là: " + arr[index]);
    }

    public static int minValue(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] < arr[index])
                index = i;
        }
        return index;
    }
}
