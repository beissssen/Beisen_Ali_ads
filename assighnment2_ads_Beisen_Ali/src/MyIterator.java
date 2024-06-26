public class MyIterator<T extends Comparable<T>> {
    /* Iterator class to iterate over elements in a linked list.
     * It provides methods to iterate over elements in a linked list
     * and throwing an exception if it is need
    */
    
    private Node<T> currentNode;

    public MyIterator(MyLinkedList<T> list) {
        currentNode = list.getHead();
    }

    public boolean hasNext() {
        return currentNode != null;
    }

    public T next() {
        if (!hasNext()) {
            throw new IllegalStateException("No next element available");
        }
        T data = currentNode.getData();
        currentNode = (Node<T>) currentNode.getNext();
        return data;
    }
}
