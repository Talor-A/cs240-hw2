public class ArrayQueue<T> implements QueueInterface<T> {
  private T[] queue;
  private int front;
  private int back;
  
  public ArrayQueue(int size){
    queue = (T[])new Object[size];
    front=0;
    back=0;
  }
  
  private int wrapAround(int index){
    return index % queue.length;
  }
  
  public void enqueue(T newEntry){
    back = wrapAround(back++);
    if (queue[back] != null) {
      throw new Error("list is full!");
    } else {
      queue[back] = newEntry;
    }
  }

  public T dequeue(){
    if (isEmpty()){
      throw new Error("list is empty!");
    } else {
      T temp = queue[front];
      front = wrapAround(front++);
      return temp;
    }
  }

  public T getFront(){
    return queue[front];
  }

  public boolean isEmpty(){
    return front == back;
  }

  public void clear(){
    for(int i=0; i < queue.length; i++){
      queue[i] = null;
    }
    front=0;
    back=0;
  }

}