// 주제 : Reflection API ; 메서드 정보 추출하기2.
package step25;

import java.lang.reflect.Method;

public class Test06 {
  public static void main(String[] args) throws Exception {

    // 1 클래스 정보를 얻기
    Class<?> clazz = Class.forName("step25.Member2");
    // 컴파일러에게 타입을 알려줘야 문법적 오류가 없다.
    // 메서드 정보 추출.
    // => public , protected, default, private
    Method[] methods = clazz.getDeclaredMethods(); //해당 클래스의 메서드만

    for (Method m : methods) {
      System.out.println(m.getName());
    }
    System.out.println("-------------------------");

    methods = clazz.getMethods();

    for (Method m : methods) {
      System.out.println(m.getName());

    }
  }
}
