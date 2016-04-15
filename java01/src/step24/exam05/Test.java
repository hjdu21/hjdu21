package step24.exam05;

public class Test implements A, B {
  public void m1() {
    // 인터페이스의 모든 필드는 public static final이다.
    //WOMAN = 20;   컴파일 오류!
    System.out.println(A.WOMAN);  //static이기 때문에 인터페이스 이름으로 사용
    System.out.println(WOMAN);    //구현 클래스에서는 인터페이스 이름 생략 가능
    //System.out.println(MAN);     컴파일 오류! A, B의 MAN을 구분할 수 없다.
    System.out.println(A.MAN);
    System.out.println(B.MAN);
    //구현한 인터페이스에 동일한 이름의 변수가 있을 때는
    //인터페이스 이름을 명시하여 명확하게 구분해야 한다.
    System.out.println("m1()...");
  }

  public static void main(String[] args) {
    Test p = new Test();
    p.m1();
  }
}

/*#인터페이스의 구현
=> 클래스 입장에서는 구현되지 않은 메서드이기 때문에 다중 인터페이스에서
서로 중복되는 메서드가 있다고 할 지라도 구현하는데 문제가 되지 않는다.
*/
