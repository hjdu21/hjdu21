package step18.exam01;

public class Test2 {
  public static void main(String[] args) {
    Bucket2 p = new Bucket2();
    p.value = new String("ohkydoky");
    // p.value = new Integer(20);
    // p.value = new Float(3.14f);
    // p.value = new java.util.Date();

  }
}

/*
  프로젝트에서는 한가지 타입의 인스턴스만 저장하고 싶다.
  -해결책?
  Bucket의 value 변수를 한가지 String으로 선언한다.
  -질문?
  그냥 value에 String만 저장하면 되지 않을까?
  개발자가 조심히 사용하면 되는거 아닌가?
  -답변
  사람은 늘 실수를 한다. 용도 대로 사용하지 않는다.
  용도 대로 사용하지 않았을 때 컴파일 단계에서 오류를 띄어주면
  프로그램을 좀 더 안정적으로 개발할 수 있다.
  String만 넣기로 해놓고, 다른 타입의 인스턴스를 저장할 때도 있다.
  문제는 Object타입의 value에서는 문법적으로 오류가 아니니까
  컴파일할때 오류가 발생하지 않는다.
  그래서 String만 넣을 수 있는 Bucket2.java를 작성할 필요가 있었다.
  이 클래스의 value에 String타입 외에 다른 타입의 인스턴스를 넣으면
  컴파일 오류가 발생한다




*/
