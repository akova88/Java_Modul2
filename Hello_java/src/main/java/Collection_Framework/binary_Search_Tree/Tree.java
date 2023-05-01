package Collection_Framework.binary_Search_Tree;

public interface Tree<E> {
    public boolean insert(E e);
    public void inOrder();
    public void postOrder();
    public void preOrder();
    public int getSize();
}
