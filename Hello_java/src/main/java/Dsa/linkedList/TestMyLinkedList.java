package Dsa.linkedList;

import Dsa.myList.MyList;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList(11);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);
        ll.add(4,9);
        ll.add(4,10);
        ll.printList();
    }
}
