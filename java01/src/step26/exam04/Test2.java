package step26.exam04;

import java.io.Writer;

public class Test2 {

  public static void main(String[] args) throws Exception {
    // Object 레퍼런스가 하위 타입의 객체를 가리키는 것처럼.
    // 제네릭 변수도 다양한 객체를 가리킬 수 없는가?
    
    //==> wildcard 타입 방법을 지정하면 된다.
    Box<?> r1 = new Box<String>();
    r1 = new Box<Integer>();
    r1 = new Box<Writer>();
    
    Box<?> r2 = new Box<String>();
    
    // ==> wildcard 문제점;
    // ==> wildcard 래퍼런스는 제네릭의 편의성을 활용하지 못하게 한다.
    String s = (String)r2.getValue(); //<- 형변환을 해야한다. 불편하다.
    
  }

}

/* */