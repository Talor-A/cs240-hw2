public class SingleLinkedQueue<T> implements QueueInterface<T> {
  Node front;
  Node back;
  public SingleLinkedQueue(){
    front = null;
    back = null;
  }
  public void enqueue(T newEntry){
    Node newNode = new Node(newEntry,back);
    back = newNode;
  }

  public T dequeue(){
    if (isEmpty()) {
      throw new Error("list is empty!");
    } else {
      Node testNode = back;
      boolean stop=false;
      while (!stop) {
        if (testNode.getLink() == front) {
          stop=true;
        } else {
          testNode = testNode.getLink();
        }
      }
      front = testNode;
      testNode.setLink(null);
      return (T)testNode.getData();
    }
  }

  public T getFront(){
    return (T)front.getData();
  }

  public boolean isEmpty(){
    return front == null && back == null;
  }

  public void clear(){
    front = null;
    back = null;
  }

}