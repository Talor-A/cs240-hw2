public class LinkedStack<T> implements StackInterface<T> {
  private Node top = null;
  public void clear() {
    top = null;
  }
  public boolean isEmpty () {
    return top != null;
  }
  public void push(T newEntry) {
    Node newNode = new Node(newEntry, top);
    top = newNode;
  }
  public T pop () {
    Node temp = top;
    top = temp.getLink();
    return (T)temp.getData();
  }
  public T peek () {
    return (T)top.getData();
  }
}

class Node<T> {
  private T _data;
  private Node _prev;
  Node(T data, Node previous) {
    _data = data;
    _prev = previous;
  }
  public T getData() { return _data; }
  public Node getLink() { return _prev; }
}