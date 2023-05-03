package Collection_Framework.binary_Search_Tree;

public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E> root;
    protected int size;

    public BST() {
    }
    public BST(E[] objects) {
        for (int i = 0; i < objects.length; i++) {
            insert(objects[i]);
        }
    }

    @Override
    public boolean insert(E e) {
        if (root == null) {
            root = createNewNode(e);
        } else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else
                    return false;
            }
            if (e.compareTo(parent.element)< 0)
                parent.left = createNewNode(e);
            else
                parent.right = createNewNode(e);
        }
        size++;
        return true;
    }

    protected TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void inOrder() {
        inOrder(root);
    }

    protected void inOrder(TreeNode<E> root) {
        if(root==null) return;
        inOrder(root.left);
        System.out.println(root.element+ " ");
        inOrder(root.right);
    }

    @Override
    public void postOrder() {
        posOrderH(root);
    }
    public void posOrderH(TreeNode<E> root) {
        if (root != null) {
            posOrderH(root.left);
            posOrderH(root.right);
            System.out.println(root.element);
        }
    }

    @Override
    public void preOrder() {
        preOrderH(root);
    }
    public void preOrderH(TreeNode<E> root) {
        if(root == null) return;
        System.out.println(root.element);
        preOrderH(root.left);
        preOrderH(root.right);
    }

    public boolean search(E element) {
        TreeNode<E> current = root;
        while (current != null) {
            if (element.compareTo(current.element) < 0) {
                current = current.left;
            } else if (element.compareTo(current.element) > 0) {
                current = current.right;
            } else {
                return true;
            }
        }
        return false;
    }
    public boolean delete(E e) {
        TreeNode<E> current = root;
        TreeNode<E> parent = null;
        while (current != null) {
            if (e.compareTo(current.element) < 0) {
                parent = current;
                current = current.left;
            } else if (e.compareTo(current.element) > 0) {
                parent = current;
                current = current.right;
            } else {
                break;
            }
        }
        if (current == null) {
            return false;
        }
        if (current.left == null) {
            if (parent == null) {
                root = current.right;
            } else {
                if (e.compareTo(parent.element) < 0) {
                    parent.left = current.right;
                } else {
                    parent.right = current.right;
                }
            }
        } else {
            TreeNode<E> rightmost = current.left;
            TreeNode<E> parentOfRightmost = current;
            while (rightmost.right != null) {
                parentOfRightmost = rightmost;
                rightmost = rightmost.right;
            }
            current.element = rightmost.element;
            if (parentOfRightmost.right == rightmost)
                parentOfRightmost.right = rightmost.left;
            else
                parentOfRightmost.left = rightmost.left;
        }
        size--;
        return true;
    }
}
