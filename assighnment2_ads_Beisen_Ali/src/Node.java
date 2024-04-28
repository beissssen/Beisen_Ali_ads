
public class Node<T> {
    /* Mode class for a linked list
    */
    public T data; 
    public Node<T> next; 
    public Node(T data) {
        this.data = data;
        this.next = null;
    }
    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }
    public T getData() {
        return data;
    }
    public Node<T> getNext() {
        return next;
    }
}
