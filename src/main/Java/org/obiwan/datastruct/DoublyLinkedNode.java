package org.obiwan.datastruct;

public class DoublyLinkedNode<T extends Comparable<T>> extends SinglyLinkedNode<T> {
    private T info;
    private DoublyLinkedNode<T> next;
    private DoublyLinkedNode<T> prev;

    public DoublyLinkedNode(T x) {
        setInfo(x);
        setNext(null);
        setPrev(null);
    }

    public DoublyLinkedNode() {

    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public DoublyLinkedNode<T> getNext() {
        return next;
    }

    public void setNext(DoublyLinkedNode<T> next) {
        this.next = next;
    }

    public DoublyLinkedNode<T> getPrev() {
        return prev;
    }

    public void setPrev(DoublyLinkedNode<T> prev) {
        this.prev = prev;
    }

}
