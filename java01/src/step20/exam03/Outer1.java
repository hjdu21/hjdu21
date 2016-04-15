package step20.exam03;

public class Outer1 {
  //1) top level Inner class
  //==> static 변수처럼 클래스 이름으로 사용가능
  static class TopLevelInner {

  }
  //2) member Inner class
  //==> instance가 있어야만 사용가능
  class MemberInner {

  }
  //3) local Inner class
  //==> 메서드의 로컬 변수처럼 메서드 안에서만 사용가능
  public void m() {
    class LocalInner {

    }
  }
  //4) anomymous Inner class
  //클래스 이름이 없기 때문에 클래스 선언과 동시에 인스턴스를 생성해야 한다
  //#문법
  //==>new 수퍼클래스/인터페이스(생성자 파라미터값...) {
  //    클래스 멤버 선언
  //  };
  Object obj = new Object() {
    public void m() {}
  };


}
