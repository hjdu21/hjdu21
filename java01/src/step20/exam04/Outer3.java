package step20.exam04;

public class Outer3 {
  int no = 20;
  public void m1() {
    System.out.println("Outer3.m()....");
  }
  public void m2() {
    class Inner {
      int no = 100;
      public void test(int no) {
        System.out.println(no);               
        System.out.println(this.no);          //  이너클래스 인스턴스변수
        System.out.println(Outer3.this.no);   //  이너클래스와 변수명이 같은
                                              //  외부변수
      }
    }

    Inner p = new Inner();
    p.test(8888);
  }
}
