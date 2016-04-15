package step19;

public class Test9 {
  public static void main(String[] args) {//throws Exception {
    MyClass obj = new MyClass();
    //Exception 예외는 반드시 처리해야한다
    //try-catch로 처리하든
    //메서드 선언부에 어떤 예외가 발생하는지 명시하든
    //둘중 하나는 무조건 해야한다
    //obj.m2();
    //try-catch로 예외처리를 할 수도 있다
    try {
      obj.m2();
    } catch(Exception e) {
      System.out.println("m2()에서 오류발생");
    }
  }
}
