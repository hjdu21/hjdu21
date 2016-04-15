package step19;

public class Test8 {
  public static void main(String[] args) {
    MyClass obj = new MyClass();
    //RunTimeException 예외를 처리하지 않으면
    //자동으로 상위 호출자에게 전달된다
    //obj.m1();
    //try-catch로 예외처리를 할 수도 있다.
    try {
      obj.m1();
    } catch (RuntimeException e) {
      System.out.println("m1()에서 에러발생");
    }
  }
}

/*

*/
