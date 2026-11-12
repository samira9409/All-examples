
 class node<T> {

    private T element;
    private Node<T> next;

    public node() {
        element = null;
        next = null;
    }

    public node(T element) {
        this.element = element;
        next = null;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }
}
