public class MyQueue<T> {
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
}
