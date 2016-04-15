package step19;

public class Test11 {
  static void m1(int i) {
    if(i < 17) {
      throw new RuntimeException("17 미만입니다.");
    }
    m2(i);
  }
  static void m2(int i) {
    if(i > 70) {
      throw new RuntimeException("70 초과입니다.");
    }
    m3(i);
  }
  static void m3(int i) {
    throw new RuntimeException("예외입니다.");
  }
  public static void main(String[] args) {
    try {
      m1(50);         //만약 main에서도 예외처리를 안하면 JVM이 한다
    } catch (RuntimeException e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
    }
  }
}
/*
  #RuntimeException의 의미
  1)적절한 지점에서 예외를 처리하도록 권고한다.
  -예외처리에 대해 느슨한 요구!
  -개발자의 부담을 덜어준다.
  2)중앙집중적으로 예외처리를 할 수 있다.
  -위 예제를 보면 m1(), m2(), m3()에서 발생한 예외를 main()에서 모두 처리한다.

*/
