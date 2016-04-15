package algorithm.stack;

public class Bucket<T> {
  T value;
  Bucket<T> prev;

  public Bucket() {
  }

  public Bucket(T value, Bucket<T> prev) {
    this.value = value;
    this.prev = prev;
  }
}
