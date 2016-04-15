package step19;

public class Test10 {
  static void m1() {
    m2();
  }
  static void m2() {
    m3();
  }
  static void m3() {
    throw new RuntimeException();
  }
  public static void main(String[] args) {
    try {
      m1();         //만약 main에서도 예외처리를 안하면 JVM이 한다
    } catch (RuntimeException e) {
      System.out.println("예외 처리");
    }
  }
}
