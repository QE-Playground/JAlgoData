public class Stack<T extends Comparable<T>> {
    private SinglyLinkedList<T> stack;

    public void setStack(SinglyLinkedList<T> stack) {
        this.stack = stack;
    }

    public SinglyLinkedList<T> getStack() {
        return stack;
    }

    public Stack() {
        stack.setHead(null);
        stack.setTail(null);
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
}
