public class Stack<T extends Comparable<T>> {
    private SinglyLinkedList<T> stack;

    public void setStack(SinglyLinkedList<T> stack) {
        this.stack = stack;
    }

    public SinglyLinkedList<T> getStack() {
        return stack;
    }

    public Stack() {
        setStack(new SinglyLinkedList<>());
    }

    public boolean isEmpty() {
        if (stack.getHead() == null)
            return true;
        return false;
    }

    public Stack push(T x) {
        stack.appendHead(x);
        return this;
    }

    public T pop() {
        return stack.removeHead();
    }

    public T top() {
        return stack.getHead().getInfo();
    }

    public Stack<T> print() {
        stack.print();
        return this;
    }
}
