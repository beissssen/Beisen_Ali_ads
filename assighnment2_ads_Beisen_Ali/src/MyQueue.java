
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
        queue.removeFirst(); 
        return item;
    }


    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void push(T e) {
        queue.addLast(e); 
    }
.
    public T pop() {
        if (isEmpty()) {
            throw new EmptyQueueException("Queue is empty");
        }
        T item = queue.getFirst(); 
        queue.removeFirst(); 
        return item;
    }

    public T get() {
        if (isEmpty()) {
            throw new EmptyQueueException("Queue is empty");
        }
        return queue.getFirst(); 
    }

    public int size() {
        return queue.size(); 
    }
}
