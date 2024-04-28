package classes;

public class Node<T> {
    public T element;
    T data;
    Node next;
    public Node(T data) {
        this.data = data;
        next = null;
    }
    public <T> Node(T element, Node<T> head) {

    }
    public T getData() {
        return data;
    }
    public T getNext() {
        return data;
    }
}
