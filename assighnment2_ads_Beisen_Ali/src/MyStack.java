package classes;

public class MyStack<T extends Comparable<T>> {
    /* Stack operate as last-in-first-out (LIFO) data structures

    */
    private MyLinkedList<T> stack;

    public MyStack() {
        stack = new MyLinkedList<>();
    }

    public void push(T item) {
        stack.addFirst(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T item = stack.getElement(0);
        stack.removeFirst();
        return item;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.getFirst(0);
    }

    public boolean isEmpty() {
        return stack.getSize() == 0;
    }

    public MyIterator<T> iterator() {
        return new MyIterator<>(stack);
    }
}
