// local Inner class 선언
package step20.exam03;

public class Outer4 {
  int no;
  void m() {
    //로컬 중첩 클래스
    //=> m()메서드 안에서만 사용할 수 있다.
    class Inner {
      // 로컬 이너 클래스도 스태틱 메서드를 선언할 수 없다.
      // public static void m() {
      //   System.out.println("Inner.m()");
      // }

      public void m2() {
        System.out.println("Inner.m2()");
      }
    }
    System.out.println("Outer4.m()");
  }



}
