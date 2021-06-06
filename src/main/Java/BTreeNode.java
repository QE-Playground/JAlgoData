public class BTreeNode<T extends Comparable<T>> {
    private T key;
    private BTreeNode<T> parent;
    private BTreeNode<T> left;
    private BTreeNode<T> right;

    public BTreeNode(T x) {
        setKey(x);
        setParent(null);
        setLeft(null);
        setRight(null);
    }

    public BTreeNode() {

    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public BTreeNode<T> getParent() {
        return parent;
    }

    public void setParent(BTreeNode<T> parent) {
        this.parent = parent;
    }

    public BTreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(BTreeNode<T> left) {
        this.left = left;
    }

    public BTreeNode<T> getRight() {
        return right;
    }

    public void setRight(BTreeNode<T> right) {
        this.right = right;
    }

}
