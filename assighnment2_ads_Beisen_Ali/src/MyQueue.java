package classes;

public class MyQueue<T extends Comparable<T>> implements DataType<T> {
    private MyLinkedList<T> queue;

    public MyQueue() {
        queue = new MyLinkedList<>();
    }

    public void enqueue(T item) {
        queue.addElement(item);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new EmptyQueueException("Queue is empty");
        }
        T item = queue.getElement(0);
        queue.remove(0);
        return item;
    }

    public boolean isEmpty() {
        return queue.getSize() == 0;
    }

    public void push(T e) {
        MyLinkedList<T> linkedList = new MyLinkedList<>();
        linkedList.addFirst(e);
    }



    public T pop() {
        MyLinkedList<T> linkedList = new MyLinkedList<>();
        T t = linkedList.getLast();
        linkedList.removeLast();
        return t;
    }


    public T get() {
        MyLinkedList<T> linkedList = new MyLinkedList<>();
        return linkedList.getLast();
    }


    public int size() {
        MyLinkedList<T> linkedList = new MyLinkedList<>();
        return linkedList.size();
    }

}
