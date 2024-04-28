import classes.MyList;

public interface DataType<T> {
    /** Declaration of a generic interface DataType with type parameter T.
    * Method to add an element of type T to the data structure,
    * method to remove and return the last added element of type T from the data structure
    * and method to return the current size of the data structure are used here
    */
    void push(T e);
    T pop();
    T get();
    int size();
}
