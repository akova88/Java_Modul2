package Dsa_Stack_queue.queue;

public class Queue {
    private Node front;
    private Node rear;
    public Queue() {
        this.front = null;
        this.rear = null;
    }
    public boolean isEmpty() {
        return this.front == null;
    }

    public void enQueue(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            this.front = newNode;
            this.rear = newNode;
        } else {
            this.rear.next = newNode;
            this.rear = newNode;
            this.rear.next = this.front;
        }
    }

    public Node dequeue() {
        if (isEmpty()) {
            return null;
        } else {
            Node temp = this.front;
            if (this.front == this.rear) {
                this.front = null;
                this.rear = null;
            } else {
                this.front = this.front.next;
                this.rear.next = this.front;
            }
            return temp;
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        System.out.println(queue.dequeue().value);
        System.out.println(queue.dequeue().value);
        queue.enQueue(4);
        queue.enQueue(5);
        System.out.println(queue.dequeue().value);
    }
}

class Node {
    public int value;
    public Node next;
    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}




