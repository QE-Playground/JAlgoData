package org.obiwan.datastruct;

public class SinglyLinkedNode<T extends Comparable<T>> {
    private T info;
    private SinglyLinkedNode<T> next;

    public SinglyLinkedNode(T x) {
        info = x;
        next = null;
    }

    public SinglyLinkedNode() {

    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public SinglyLinkedNode<T> getNext() {
        return next;
    }

    public void setNext(SinglyLinkedNode<T> next) {
        this.next = next;
    }

}
