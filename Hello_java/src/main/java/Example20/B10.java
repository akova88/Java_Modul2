package Example20;

import java.util.Arrays;
import java.util.Scanner;

public class B10 {
    public static void main(String[] args) {
//        Bài 10: Thêm 1 phần tử x vào mảng tại vị trí k
        Scanner sc= new Scanner(System.in);
        int size = 10;
        int[] numbers = new int[size];
        for ( int i = 0; i < size; i++) {
            numbers[i] = (int) (Math.random()*100 + Math.random()*(-100));
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Nhập số cần chèn: ");
        int x = sc.nextInt();
        int k;
        do {
            System.out.print("Nhập vị trí cần chèn: ");
            k = sc.nextInt();
            if (k < 0 || k > size - 1) {
                System.out.println("Vị trí nhập không hợp lệ");
            }
        } while (k < 0 || k > size-1);
        numbers = addNumber(k,x,numbers);
        System.out.println(Arrays.toString(numbers));
    }
    public static int[] addNumber(int k, int x, int[] arr) {
        int[] arrNew = new int[arr.length+1];
        for (int i = 0; i <arr.length; i++) {
            arrNew[i] = arr[i];
        }
        for (int i = k; i < arrNew.length - 1; i++) {
            int temp = arrNew[i];
            arrNew[i] = arrNew[arrNew.length-1];
            arrNew[arrNew.length-1] = temp;
        }
        arrNew[k] = x;
        return arrNew;
    }
}
