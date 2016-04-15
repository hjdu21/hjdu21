// 주제 : Reflection API ; 메서드를 호출할 때 여러개의 값 넘기기
package step25;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Test10 {
  static class Member {
    public static int count;

    String name;
    int age;
    float weight;
    float height;
    
    public void setMember(String name, int age, float weight, float height) {
      this.name = name;
      this.age = age;
      this.weight = age;
      this.height = height;
    }

    @Override
    public String toString() {
      return "Member [name=" + name + ", age=" + age + ", weight=" + weight + ", height=" + height + "]";
    }
    
  }

  public static void main(String[] args) throws Exception {

    Class<?> clazz = Class.forName("step25.Test10$Member");

    // 1. 인스턴스 생성.
    Object obj = clazz.newInstance();

    // 2. setMember() 메서드 찾기
    Method m = clazz.getDeclaredMethod("setMember", String.class, int.class, float.class, float.class);
    
    // 3. 파라미터가 여러개인 메서드 호출하기
    
    //1) 아규먼트를 배열에 담아서 넘기기.
   Object[] arguments = {"홍길동", 20, 85.5f, 182.4f};
    m.invoke(obj, arguments);
    System.out.println(obj);
    
    //2) 아규먼트를 차례로 나열하기.
    m.invoke(obj, "임꺽정", 30,90.2f, 192f);
    System.out.println(obj);
    
    
  }
}


/* 메서드의 파라미터 이름 
 * .class파일은 각 메서드 별로 로컬 변수 테이블을 갖고 있는데,
 * 그 테이블에 메서드의 파라미터 이름이 기록되어 있다.
  => 하지만, 리플렉션API를 사용하여 그 로컬변수 테이블의 정보를 추출 할 수 없다.
  
  해결책?
  * 컴파일 옵션을 사용 하여 메서드의 파라미터 이름을 .class파일에 저장하게 해야한다.
  * 그래야만 리플렉션 API를 사용하여 메서드의 파라미터 이름을 알아낼 수 있다.
  * 예) javac -parameters 소스
   
  
 */