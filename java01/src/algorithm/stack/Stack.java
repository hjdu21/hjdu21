package algorithm.stack;

public class Stack<T> {
  Bucket<T> top;
  Bucket<T> bottom;
  int count;

  public Stack() {
    top = new Bucket<>();
    bottom = top;
  }

  public void push(T value) {
    Bucket<T> pushBucket = new Bucket<>(value, top);
    top = pushBucket;
    count++;
  }

  public T pop() {
    if(count == 0) {
      return null;
    }
    Bucket<T> popBucket = top;
    top = top.prev;
    count--;
    return popBucket.value;
  }

  public int size() {
    return count;
  }
}
