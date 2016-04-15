package algorithm.linked;

public class LinkedList<T> {
  Bucket<T> start;
  Bucket<T> end;
  int count;

  public LinkedList() {
    start = new Bucket<>();
    end = start;
  }

  public int size() {
    return count;
  }

  public void add(T value) {
    end.value = value;
    Bucket<T> addBucket = new Bucket<>();
    end.next = addBucket;
    end = end.next;
    count++;
  }

  public void insert(int index, T value) {
    if(index < 0 || index > count) {
      return;
    }

    if(index == 0) {
      Bucket<T> insertBucket = new Bucket<>(value, start);
      count++;
      return;
    }

    if(index == count) {
      add(value);
    }

    Bucket<T> cursor = start;
    for(int i = 0; i < index - 1; i++) {
      cursor = cursor.next;
    }
    Bucket<T> insertBucket = new Bucket<>(value, cursor.next);
    count++;
  }

  public T get(int index) {
    Bucket<T> cursor = start;
    for(int i = 0; i < index -1; i++) {
      cursor = cursor.next;
    }
    return cursor.value;
  }

  public T remove(int index) {
    if(index < 0 || index >= count) {
      return null;
    }

    if(index == 0) {
      T removeBucket = start.value;
      start = start.next;
      count--;
      return removeBucket;
    }

    Bucket<T> cursor = start;
    for(int i = 0; i < index - 1; i++) {
      cursor = cursor.next;
    }
    T removeBucket = cursor.next.value;
    cursor.next = cursor.next.next;
    count--;
    return removeBucket;
  }
  public T set(int index, T value) {
    if(index < 0 || index >= count) {
      return null;
    }
    Bucket<T> cursor = start;
    for(int i = 0; i < index; i++) {
      cursor = cursor.next;
    }
    T setBucket = cursor.value;
    cursor.value = value;
    return setBucket;
  }

}
