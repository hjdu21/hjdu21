// member Inner class 테스트
// =>인스턴스 중첩 클래스
package step20.exam03;
import static step20.exam03.Outer2.Inner;
public class Test04 {

  public static void main(String[] args) {
    Outer3 p = new Outer3();
    p.no = 20;
    p.m();
    //레퍼런스를 선언하는 방법은 top level inner class와 같다
    //그러나 인스턴스를 생성하는 문법은 다르다
    //=>인스턴스.new 중첩클래스();
    Outer3.Inner p2 = p.new Inner();
    p2.m2();
  }

}
