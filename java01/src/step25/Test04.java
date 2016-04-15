// 주제 : Reflection API ; 메서드 정보 추출하기.
package step25;

import java.lang.reflect.Method;

public class Test04 {
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

  }

  public static void main(String[] args) throws Exception {
     
    //1 클래스 정보를 얻기
    Class<?> clazz = Class.forName("step25.Test04$Member");
     // 컴파일러에게 타입을 알려줘야 문법적 오류가 없다.
    //메서드 정보 추출.
    Method[] methods = clazz.getDeclaredMethods();
    
    for(Method m : methods) {
      System.out.println(m.getName());
    }
    System.out.println("-------------------------");
    
    methods = clazz.getMethods();
    
    for(Method m : methods) {
      System.out.println(m.getName());
  
  }
}
}
