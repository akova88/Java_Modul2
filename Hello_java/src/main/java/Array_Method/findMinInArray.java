package Array_Method;

import java.util.Arrays;
import java.util.Scanner;

public class findMinInArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng:");
        int size = scanner.nextInt();
        int[] myArray = new int[size];
        myArray = mergeArray.inputElement(myArray);
        System.out.println(Arrays.toString(myArray));

        System.out.println("Phần tử min là: " + myArray[findMinimum.minValue(myArray)]);
    }
}
