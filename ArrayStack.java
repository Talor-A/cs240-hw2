public class ArrayStack<T> implements StackInterface<T> {
  private T stack[];
  private int endIndex = -1;
  
  public ArrayStack(int size) {
    stack = (T[])new Object[size];
  }
  
  public void push(T newEntry){
    endIndex++;
    stack[endIndex] = newEntry;
  }
  
  public T pop(){
    if(!isEmpty()){
      T temp = stack[endIndex];
      endIndex--;
      return temp;
    } else {
      throw new Error("tried to pop() an empty stack!");
    }
  }
  
  public T peek(){
    if (!isEmpty()){
      return stack[endIndex];
    } else {
      throw new Error("tried to peek() an empty stack!");
    }
  }
  
  public boolean isEmpty(){
    return endIndex == -1;
  }
  
  public void clear(){
    while (endIndex > 0) {
      stack[endIndex] = null;
      endIndex--;
    }
  }
}