package Dsa_Stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class IsPalindrome {
    public static void main(String[] args) {
        String str = "Able was I ere I saw Elba";
        String str1 = str.toLowerCase();
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str1.length(); i++) {
            queue.add(str1.charAt(i));
            stack.push(str1.charAt(i));
        }
        System.out.println(queue);
        System.out.println(stack);

        boolean isPalindrome = true;
        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.remove())) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Chuỗi là Palindrome");
        } else {
            System.out.println(" Chuỗi không là Palindrome");
        }

    }
}
