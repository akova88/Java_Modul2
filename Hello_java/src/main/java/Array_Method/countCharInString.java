package Array_Method;

import java.util.Scanner;

public class countCharInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String myString = "hello my string";
        System.out.print("Nhập một ký tự cần tìm: ");
        char character = sc.next().charAt(0);
        int count = 0;
        for ( int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == character)
                count++;
        }
        System.out.printf("Ký tự xuất hiện %d lần\n",count);
    }
}
