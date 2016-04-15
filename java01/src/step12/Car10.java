//final의 활용
package step12;

public class Car10 {
  //파라미터 앞에 final을 붙인다.
  public static int plus(final int a, final int b) {
  //만약 파라미터로 받은 값을 변경하려 한다면
  //컴파일 오류가 발생할 것이다.
  //파라미터 값을 일반 로컬 변수로 착학하지 않도록 하기 위함.
    a = 30;
    return a + b;

  }
}
