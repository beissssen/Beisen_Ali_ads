public class EmptyQueueException extends RuntimeException {
    /* Exception class for the moments where a queue is empty and an operation requiring an element from the queue is attempted
    */
    public EmptyQueueException(String message) {
        super(message);
    }
}
