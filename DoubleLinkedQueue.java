public class DoubleLinkedQueue<T> implements StackInterface<T>{
  Node free;
  Node back;
  public DoubleLinkedQueue() {
    free = new Node(null,null);
    free.setLink(empty);
  }
  public void enqueue(T newEntry){
    Node newNode = new Node(newEntry, back);
    back = newNode;
  }

  public T dequeue(){
    if (isEmpty()){
      throw new Error("list is empty!");
    } else {
      Node temp = back;
      back = temp.getLink();
      
      return temp.getData();
    }
  }

  public T getFront(){
    
  }

  public boolean isEmpty(){
    return free.getLink() == free;
  }

  public void clear(){
    
  }

}