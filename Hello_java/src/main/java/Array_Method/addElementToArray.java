package Array_Method;

import java.util.Arrays;
import java.util.Scanner;

public class addElementToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] myList = {10, 4, 6, 7, 8};
        System.out.println(Arrays.toString(myList));
        System.out.println("Nhập số cần chèn: ");
        int number = sc.nextInt();
        int position;
        do {
            System.out.println("Nhập vị trí cần chèn");
            position = sc.nextInt();
            if (position <= -1 || position > myList.length-1 )
                System.out.println("Vị trí nhập ko hơp lệ");
        } while (position <= -1 || position > myList.length-1 );
        myList = addElement(number,position, myList);
        System.out.println(Arrays.toString(myList));
    }

    public static int[] addElement(int value, int index, int[] numbers) {
        int[] newList = new int[numbers.length+1];
        for( int i = 0; i < numbers.length; i++) {
            newList[i] = numbers[i];
        }
        int temp;
//        for (int i = newList.length-1; i > index ; i--) {
//            temp = newList[i];
//            newList[i] = newList[i-1];
//            newList[i-1] = temp;
//        }
        for ( int i = index; i < newList.length;i++) {
            temp = newList[i];
            newList[i] = newList[newList.length-1];
            newList[newList.length-1] = temp;
        }
        newList[index] = value;
        return newList;
    }
}
