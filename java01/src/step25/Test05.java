// 주제 : Reflection API ; 메서드 정보 추출하기2.
package step25;

import java.lang.reflect.Method;

public class Test05 {
  static class Member {

    public static int count;

    String name;

    public Member() {
      System.out.println("Member()....");
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    protected void m1() {
    }

    void m2() {
    }

    private void m3() {
    }

  }

  public static void main(String[] args) throws Exception {

    Class<?> clazz = Class.forName("step25.Test05$Member");
    // 컴파일러에게 타입을 알려줘야 문법적 오류가 없다.
    // 메서드 정보 추출.
    // ==> public, protected, private, default 메서드들 
    Method[] methods = clazz.getDeclaredMethods();

    for (Method m : methods) {
      System.out.println(m.getName());
    }
    System.out.println("-------------------------");
    
    // ==> public 메서드들
    methods = clazz.getMethods();

    for (Method m : methods) {
      System.out.println(m.getName());

    }
  }
}
