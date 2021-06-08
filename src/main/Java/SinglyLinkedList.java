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

    public SinglyLinkedList remove(T k) {
        SinglyLinkedNode<T> p = this.head;
        SinglyLinkedNode<T> q = null;

        while (p != null) {
            if (p.getInfo().compareTo(k) == 0) break;
            q = p;
            p = p.getNext();
        }

        if (p == null) return this;
        if (q != null) {
            if (p == this.tail) this.tail = q;
            q.setNext(p.getNext());
        } else {
            this.head = p.getNext();
            if (this.head == null) this.tail = null;
        }
        return this;
    }

    public T removeHead() {
        T x = this.getHead().getInfo();

        if (this.getHead() == null)
            return null;

        this.setHead(this.getHead().getNext());

        if (this.getHead() == null)
            this.setTail(null);

        return x;
    }

    public SinglyLinkedList print() {
        System.out.print("[");

        SinglyLinkedNode node = this.head;

        while (node != null) {
            if (node.getNext() != null)
                System.out.print(String.format("%s, ", node.getInfo()));
            else
                System.out.print(String.format("%s", node.getInfo()));
            node = node.getNext();
        }

        System.out.print("]\n");
        return this;
    }

    public SinglyLinkedList<T> selectionSort() {
        SinglyLinkedNode<T> p = this.head;

        while (p != this.tail) {
            SinglyLinkedNode<T> q = p.getNext();
            SinglyLinkedNode<T> min = p;

            while (q != null) {
                if (q.getInfo().compareTo(min.getInfo()) < 0)
                    min = q;
                q = q.getNext();
            }

            swapInfo(min, p);
            p = p.getNext();
        }
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

    protected void swapInfo(SinglyLinkedNode<T> p, SinglyLinkedNode<T> q) {
        SinglyLinkedNode<T> t = new SinglyLinkedNode<>();

        t.setInfo(p.getInfo());
        p.setInfo(q.getInfo());
        q.setInfo(t.getInfo());
    }
}
