package org.obiwan.datastruct;

public class BinaryTree<T extends Comparable<T>> {
    private BTreeNode<T> tree;

    public BinaryTree(BTreeNode<T> tree) {
        setTree(tree);
    }

    public BinaryTree() {

    }

    public void setTree(BTreeNode<T> tree) {
        this.tree = tree;
    }

    public BTreeNode<T> getTree() {
        return tree;
    }

    public BTreeNode<T> searchNode(BTreeNode<T> tree, T x) {
        if (tree != null) {
            if (tree.getKey().compareTo(x) == 0)
                return tree;
            if (tree.getKey().compareTo(x) > 0)
                return searchNode(tree.getLeft(), x);
            else
                return searchNode(tree.getRight(), x);
        }
        return null;
    }

    public BinaryTree<T> insertNode(T x) {
        setTree(insertNode(tree, x));
        return this;
    }

    private BTreeNode<T> insertNode(BTreeNode<T> tree, T x) {
        if (tree == null) {
            return new BTreeNode<>(x);
        } else {
            if (tree.getKey().compareTo(x) == 0) return tree;
            if (tree.getKey().compareTo(x) > 0)
                tree.setLeft(insertNode(tree.getLeft(), x));
            else
                tree.setRight(insertNode(tree.getRight(), x));
        }
        return tree;
    }

    public BinaryTree<T> print() {
        System.out.print("[");
        print(tree);
        System.out.print("]\n");
        return this;
    }

    private void print(BTreeNode<T> tree) {
        if (tree != null) {
            print(tree.getLeft());
            System.out.print(String.format("  %s", tree.getKey()));
            print(tree.getRight());
        }
    }
}
