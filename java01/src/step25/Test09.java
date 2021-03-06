// 주제 : Reflection API ; 메서드의 파라미터 정보 알아내기
package step25;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Test09 {
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

    Class<?> clazz = Class.forName("step25.Test09$Member");

    // 1. 인스턴스 생성.
    Object obj = clazz.newInstance();

    // 2. setMember() 메서드 찾기
    Method m = clazz.getDeclaredMethod("setMember", String.class, int.class, float.class, float.class);
    
    // 3. 메서드의 파라미터 알아내
   Parameter[] params = m.getParameters();
   for(Parameter param : params) {
     System.out.printf("%s : %s \n",param.getName(), param.getType(), param.getName());
   }
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
   
  이 방식의 단점?
  => 컴파일할때 -parameters 라는 옵션을 주지 않으면,
     class파일에 메서드의 파라미터 정보가 기록되지 않는다.
  => 일반적으로 개발자들이 컴파일할때 메서드의 파라미터 이름까지 저장하도록
     해당 옵션을 활성하하지 않는다.
  => 따라서 리플렉션 API를 사용하여 메서드의 파라미터 이름을 알아내기가 힘들다.
 */