// anomymous Inner class 선언2
// 익명 중첩 클래스에 메서드 추가하기
package step20.exam03;

public class Outer6 {
  int no;

  Object obj1 = new Object() {
    public void test() {
      System.out.println("어떻게 호출하지?");
    }
    @Override
    public String toString() {
      return "ohhola~~";
    }
  };

  void m() {
    System.out.println(obj1);
    }
  }
}
/*
obj.test(); 오류
컴파일러는 레퍼런스 변수의 타입을 조사하여
메서드를 호출할 수 있는지 검사한다
실제 레퍼런스가 어떤 인스턴스를 가리키는지는 고려하지 않는다.
직접 코드로 호출할 수는 없지만 특수도구를 사용하면 가능하다.
*/
