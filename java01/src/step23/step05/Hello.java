package step23.step05;

public interface Hello {
  //호출 규칙을 정의한다
  /*public abstract <-- 안붙여도 public, abstract이다 다른건 불가!
  =>private, protected, (default) 안됨
  =>일반 메서드 선언할 수 없다. 반드시 추상 메서드만 가능
  =>이유? 규칙이니까. 규칙은 클래스에서 구현하는 것이다.
  */
  String greet();

}
