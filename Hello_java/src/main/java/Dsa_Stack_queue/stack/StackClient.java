package Dsa_Stack_queue.stack;

public class StackClient {
    public static void main(String[] args) throws Exception {
        MyArrayStack stack = new MyArrayStack(5);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("1. Kích thước stack sau khi push các phần tử: " + stack.size());
        System.out.println("2. Pop các phần tử trong stack");
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }
        System.out.println("\n3. Kích thước của stack sau khi pop: " + stack.size());
    }
}
