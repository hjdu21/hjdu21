package algorithm.ex01;

public class LinkedList {
  Bucket start;
  Bucket end;
  int count;

  public LinkedList() {
    start = new Bucket();
    end = start;
  }

  public int size() {
    return count;
  }

  public void add(Object value) {
    end.value = value;
    Bucket newBucket = new Bucket();
    end.next = newBucket;
    end = end.next;
    count++;
  }

  public void insert(int index, Object value) {
    if(index < 0 || index > count) {
      return;
    }

    if(index == 0) {
      Bucket insertBucket = new Bucket(value, start);
      start = insertBucket;
      count++;
      return;
    }

    if(index == count) {
      add(value);
      return;
    }

    Bucket cursor = start;
    for(int i = 0; i < index - 1; i++) {
      cursor = cursor.next;
    }
    cursor.next = new Bucket(value, cursor.next);
    count++;
  }

  public Object get(int index) {
    Bucket cursor = start;
    for (int i = 0; i < index; i++) {
      cursor = cursor.next;
    }
    return cursor.value;
  }

  public Object remove(int index) {
    if (index < 0 || index >= count) {
      return null;
    }

    if(index == 0) {
      Object removeBucket = start.value;
      start = start.next;
      count--;
      return removeBucket;
    }
    Bucket cursor = start;
    for(int i = 0; i < index - 1; i++) {
      cursor = cursor.next;
    }
    Object removeBucket = cursor.next.value;
    cursor.next = cursor.next.next;
    count--;
    return removeBucket;
  }
  public Object set(int index, Object value) {
    if (index < 0 || index >=count) {
      return null;
    }

    Bucket cursor =start;
    for(int i = 0; i < index; i++) {
      cursor = cursor.next;
    }
    Object setBucket = cursor.value;
    cursor.value = value;
    return setBucket;
  }

}
