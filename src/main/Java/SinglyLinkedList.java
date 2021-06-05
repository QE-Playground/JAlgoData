public class SinglyLinkedList<T extends Comparable<T>> {
    private SinglyLinkedNode<T> head;
    private SinglyLinkedNode<T> tail;

    public SinglyLinkedNode<T> getHead() {
        return head;
    }

    public void setHead(SinglyLinkedNode<T> head) {
        this.head = head;
    }

    public SinglyLinkedNode<T> getTail() {
        return tail;
    }

    public void setTail(SinglyLinkedNode<T> tail) {
        this.tail = tail;
    }

    public SinglyLinkedList appendHead(T x) {
        SinglyLinkedNode<T> newNode = new SinglyLinkedNode<T>(x);

        if (this.head == null) {
            this.head = newNode;
            this.tail = this.head;
        } else {
            newNode.setNext(this.head);
            this.head = newNode;
        }
        return this;
    }

    public SinglyLinkedList appendTail(T x) {
        SinglyLinkedNode<T> newNode = new SinglyLinkedNode<T>(x);

        if (this.head == null) {
            this.head = newNode;
            this.tail = this.head;
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
        return this;
    }

    public SinglyLinkedList appendAfter(T key, T keyToAdd) {
        SinglyLinkedNode<T> q = linearSearch(key);
        SinglyLinkedNode<T> newNode = new SinglyLinkedNode<>(keyToAdd);

        if (q != null) {
            newNode.setNext(q.getNext());
            q.setNext(newNode);

            if (q == this.tail) {
                this.tail = newNode;
            }
        } else {
            appendHead(newNode);
        }
        return this;
    }

    public SinglyLinkedList print() {
        System.out.println("[");

        SinglyLinkedNode node = this.head;

        while (node != null) {
            System.out.println(String.format("%s ,", node.getInfo()));
            node = node.getNext();
        }

        System.out.println("]");
        return this;
    }

    private SinglyLinkedNode<T> linearSearch(T k) {
        SinglyLinkedNode<T> p = this.head;

        while ((p != null) && (p.getInfo().compareTo(k) != 0)) {
            p = p.getNext();
        }
        return p;
    }

    private void appendHead(SinglyLinkedNode<T> newNode) {
        if (this.head == null) {
            this.head = newNode;
            this.tail = this.head;
        } else {
            newNode.setNext(this.head);
            this.head = newNode;
        }
    }
}
