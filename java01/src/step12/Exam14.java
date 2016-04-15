//주제: final 활용 문법 test
package step12;

public class Exam14 {
  class Myclass extends Car11 {
    @Override
    public int plus(final int a, final int b) {
      return a + b + 100;
    }
  }

  public static void main(String[] args) {

  }
}
/*
  #메서드 앞에 final을 붙이는 경우
  -하위 클래스가 재정의 하는 것을 막기 위함이다.
  -final클래스와 마찬가지로 보안상 재정의 하지 말아야 하는 메서드에 대해
   final을 붙이면 된다.
*/
