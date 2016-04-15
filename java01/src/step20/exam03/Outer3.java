// member Inner class 선언
package step20.exam03;

public class Outer3 {
  int no;
  void m() {
    System.out.println("Outer3.m()");
  }

  class Inner {
    /*
    member Inner class는 스태틱메서드를 선언할수 없다
    public static void m() {
      System.out.println("Inner.m()");
    }
    */
    public void m2() {
      System.out.println("Inner.m2()");
    }

  }

}
