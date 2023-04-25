package Dsa_Stack_queue.stack_reverse;

import java.util.Stack;

public class ReverseArrayString {
    public static String reverserArray(String str) {
        Stack<Character> stack = new Stack<>();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            stack.push(str.charAt(i));
        }
        String str1 = "";
        for (int i = 0; i < n; i++) {
            str1 += stack.pop();
        }
        return str1;
    }

    public static void main(String[] args) {
        String str = "abcd";
        System.out.println("Chuỗi ký tự ban đầu: " + str);
        System.out.println("Chuỗi ký tự đảo ngược: " + reverserArray(str));
    }
}
