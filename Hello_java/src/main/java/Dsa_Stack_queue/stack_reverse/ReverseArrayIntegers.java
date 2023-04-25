package Dsa_Stack_queue.stack_reverse;

import java.util.Arrays;
import java.util.Stack;

public class ReverseArrayIntegers {
    public static int[] reverseArray(int[] arr) {
        Stack<Integer> stack = new Stack<Integer>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            stack.push(arr[i]);
        }
        for (int i = 0; i < n; i++) {
            arr[i] = stack.pop();
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Mảng ban đầu: " + Arrays.toString(numbers));
        reverseArray(numbers);
        System.out.println("Mảng đảo ngược: " + Arrays.toString(numbers));
    }
}
