package Dsa_Stack_queue.stack;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        Stack<Integer> numbers = new Stack<>();
        System.out.println("Nhập vào 1 số hệ Decimal: ");
        int number = sc.nextInt();

        while (number / 2 != 0) {
            numbers.push(number%2);
            number = number/2;
        }
        numbers.push(number%2);
        String str = "";
        while (!numbers.isEmpty()) {
            str += numbers.pop();
        }
        System.out.println("Số chuyển sang hệ Binary = "+str);
    }


}
