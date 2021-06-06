public class DoublyLinkedList<T extends Comparable<T>> extends SinglyLinkedList<T> {
    private DoublyLinkedNode<T> head;
    private DoublyLinkedNode<T> tail;

    public DoublyLinkedNode<T> getHead() {
        return head;
    }

    public void setHead(DoublyLinkedNode<T> head) {
        this.head = head;
    }

    public DoublyLinkedNode<T> getTail() {
        return tail;
    }

    public void setTail(DoublyLinkedNode<T> tail) {
        this.tail = tail;
    }

    public DoublyLinkedList appendHead(T x) {
        DoublyLinkedNode<T> newNode = new DoublyLinkedNode<>(x);

        if (this.head == null) {
            this.head = newNode;
            this.tail = this.head;
        } else {
            newNode.setNext(this.head);
            this.head.setPrev(newNode);
            this.head = newNode;
        }
        return this;
    }

    public DoublyLinkedList appendTail(T x) {
        DoublyLinkedNode<T> newNode = new DoublyLinkedNode<>(x);

        if (this.head == null) {
            this.head = newNode;
            this.tail = this.head;
        } else {
            this.tail.setNext(newNode);
            newNode.setPrev(this.tail);
            this.tail = newNode;
        }
        return this;
    }

    public DoublyLinkedList appendAfter(T key, T keyToAdd) {
        DoublyLinkedNode<T> q = linearSearch(key);
        DoublyLinkedNode<T> p = q.getNext();
        DoublyLinkedNode<T> newNode = new DoublyLinkedNode<>(keyToAdd);

        if (q != null) {
            newNode.setNext(p);
            newNode.setPrev(q);
            q.setNext(newNode);

            if (p != null) {
                p.setPrev(newNode);
            }

            if (q == this.tail) {
                this.tail = newNode;
            }
        } else {
            appendHead(newNode);
        }
        return this;
    }

    public DoublyLinkedList appendBefore(T key, T keyToAdd) {
        DoublyLinkedNode<T> q = linearSearch(key);
        DoublyLinkedNode<T> p = q.getPrev();
        DoublyLinkedNode<T> newNode = new DoublyLinkedNode<>(keyToAdd);

        if (q != null) {
            newNode.setNext(q);
            newNode.setPrev(p);
            q.setPrev(newNode);

            if (p != null) {
                p.setNext(newNode);
            }

            if (q == this.head) {
                this.head = newNode;
            }
        } else {
            appendTail(newNode);
        }
        return this;
    }

    public DoublyLinkedList remove(T k) {
        DoublyLinkedNode<T> p = this.head;
        DoublyLinkedNode<T> q = null;

        while (p != null) {
            if (p.getInfo().compareTo(k) == 0) break;
            p = p.getNext();
        }

        q = p.getPrev();

        if (q != null) {
            p = q.getNext();
            if (p != null) {
                q.setNext(p.getNext());
                if (p == this.tail)
                    this.tail = q;
                else
                    p.getNext().setPrev(q);
            }
        } else {
            this.head = p.getNext();
            if (this.head == null)
                this.tail = null;
            else
                this.head.setPrev(null);
        }
        return this;
    }

    public DoublyLinkedList print() {
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

    public DoublyLinkedList<T> selectionSort() {
        DoublyLinkedNode<T> p = this.head;

        while (p != this.tail) {
            DoublyLinkedNode<T> q = p.getNext();
            DoublyLinkedNode<T> min = p;

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

    public DoublyLinkedList<T> insertionSort() {
        DoublyLinkedNode<T> p = this.head.getNext();

        while (p != null) {
            T x = p.getInfo();
            DoublyLinkedNode<T> q = p.getPrev();

            while (q != null && q.getInfo().compareTo(x) > 0) {
                q.getNext().setInfo(q.getInfo());
                q = q.getPrev();
            }

            if (q != null && q.getNext() != null) {
                q.getNext().setInfo(x);
            }

            if (q == null) {
                this.head.setInfo(x);
            }
            p = p.getNext();
        }
        return this;
    }

    private DoublyLinkedNode<T> linearSearch(T k) {
        DoublyLinkedNode<T> p = this.head;

        while ((p != null) && (p.getInfo().compareTo(k) != 0)) {
            p = p.getNext();
        }
        return p;
    }

    private void appendHead(DoublyLinkedNode<T> newNode) {
        if (this.head == null) {
            this.head = newNode;
            this.tail = this.head;
        } else {
            newNode.setNext(this.head);
            this.head = newNode;
        }
    }

    private void appendTail(DoublyLinkedNode<T> newNode) {
        if (this.head == null) {
            this.head = newNode;
            this.tail = this.head;
        } else {
            this.tail.setNext(newNode);
            newNode.setPrev(this.tail);
            this.tail = newNode;
        }
    }

    protected void swapInfo(DoublyLinkedNode<T> p, DoublyLinkedNode<T> q) {
        super.swapInfo(p, q);
    }
}
