//주제: final 활용 문법 test
package step12;

public class Exam11 {
  //컴파일 오류 상속 불가
  //=>원래 만들었던 클래스를 그대로 사용해야한다.
  //=>하위 클래스를 만들어서 조작하는 것이 불가능 하다.
  //class Car2 extend Car8 { }
  public static void main(String[] args) {

  }
}
/*
  #클래스 앞에 final을 붙이는 경우
  -상속을 막고 싶을 때.
  -왜?
  =>다형적 변수의 특성에 따르면 상위 클래스를 요구하는 자리에
    하위 클래스를 대입할 수 있다.
  =>보안이 필요한 업무에서는 특정 클래스가 다른 클래스로 대체되는 것을
    방지해야 한다.
  =>그런 경우에 final을 사용하여 하위 클래스를 만들지 못하도록 한다.
  =>하위 클래스를 만들수 없다면 기존 클래스를 대체할 수 없다.
*/
