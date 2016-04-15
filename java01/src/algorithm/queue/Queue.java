package algorithm.queue;

public class Queue<T> {
  Bucket<T> front;
  Bucket<T> rear;
  int count;

  public Queue() {
    front = new Bucket<>();
    rear = front;
  }

  public void put(T value) {
    rear.value = value;
    Bucket<T> putBucket = new Bucket<>();
    rear.prev = putBucket;
    rear = putBucket;
    count++;
  }

  public T poll() {
    if(count == 0) {
      return null;
    }
    T pollBucket = front.value;
    front = front.prev;
    count--;
    return pollBucket;
  }

  public int size() {
    return count;
  }

}
