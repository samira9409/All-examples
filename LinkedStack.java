
import java.util.EmptyStackException;

public class LinkedStack<T> {

    private int count;
    private Node<T> top;

    public LinkedStack() {
        count = 0;
        top = null;
    }

    // Push: Add element
    public void push(T element) {

        Node<T> temp = new Node<>(element);

        temp.setNext(top);

        top = temp;

        count++;
    }

    // Pop: Remove top element
    public T pop() throws EmptyStackException {

        if (isEmpty()) {
            throw new EmptyStackException();
        }

        T result = top.getElement();

        top = top.getNext();

        count--;

        return result;
    }

    // Peek: View top element
    public T peek() throws EmptyStackException {

        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return top.getElement();
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return count == 0;
    }

    // Return stack size
    public int size() {
        return count;
    }
}