package Collection_Framework.binary_Search_Tree;

import com.sun.source.tree.BinaryTree;

public class TestBST {
    public static void main(String[] args) {
        BST<String> tree = new BST<>();
        tree.insert("George");
        tree.insert("Michael");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");

//        System.out.println("Inorder (sorted): ");
////        tree.inOrder();
//        System.out.println("The number of nodes is: " + tree.getSize());
//        tree.postOrder();
        tree.preOrder();
//        BST<Integer> tree1 = new BST<>();
//        tree1.insert(27);
//        tree1.insert(14);
//        tree1.insert(35);
//        tree1.insert(10);
//        tree1.insert(19);
//        tree1.insert(31);
//        tree1.insert(42);
////        tree1.inOrder();
//        tree1.preOrder();
//        System.out.println(tree1.search(11));
//
//        System.out.println(tree1.delete(42));
    }
}
