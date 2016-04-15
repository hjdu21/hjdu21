package step20.exam05;

public class Outer1{
  static int v1;
  static void m1() {}
  int v2;
  void m2() {}
  //1) top-level-inner class
  static class Inner1{      //static안에서는 static만 들어갈 수 있다.
    static void test() {    //메서드는 상관없다.
      v1 = 10;
      m1();
    }
  }

  //2) member-inner class
  class Inner2{             //static이 아니면 모두 다 가능하다.
    static void test() {    //메서드는 상관없다.
      v1 = 10;
      v2 = 20;
      m1();
      m2();
    }

  }

  //3) local-inner class
  public static void m() {  //staic 메서드니까 static만 들어갈 수 있다.
    class Inner3{           //local-inner클래스는 감싸고있는 메서드가 중요하다.
      static void m() {     //안에 있는 메서드는 상관없다.
        v1 = 10;
        m1();
      }

    }

  //4) anomymous-inner class
  Object obj = new Object() {

  };

  }

}
