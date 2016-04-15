package step18.exam01;

public class Test4 {
  public static void main(String[] args) {
    Bucket4 p = new Bucket4();
    p.value = new Integer(10);
    // p.value = new java.util.Date();
    // p.value = new String("ohkydoky");


  }
}

/*
이번 프로젝트는 Bucket에 Integer 인스턴스만 저장하기로 했다.
물론 개발자의 실수를 방지하도록 문법적으로 막아야 한다.
해결책?
Bucket은 Integer가 아닌 다른 타입의 인스턴스를 저장할 수 있기 때문에
바람직 하지 않다.
Bucket3는 사용할 수 없다. 왜? Integer만 저장가능하도록 작성해놨기 때문이다
Bucket4를 Integer 인스턴스만 저장가능하도록 작성해야 한다.
다른 타입의 인스턴스를 저장하려고 할 때 컴파일 오류가 발생하여 개발자가
바로 오류를 확인할 수 있다.


*/
