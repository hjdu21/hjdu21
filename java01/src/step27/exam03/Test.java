// 주제 : 실행 중에 에노테이션 정보를 추출하기.
package step27.exam03;

import java.lang.annotation.Annotation;

public class Test {

  public static void main(String[] args) {

    Class<?> clazz = Member.class;
    Annotation[] anos = clazz.getAnnotations();
    for(Annotation ano : anos) {
      System.out.println(ano.toString());
    }
    
    
    
  }

}

/* Member 클래스에 첨부된 에노테이션 가져오기.
 * 단, 해당 에노테이션의 유지 정책이 RUNTIME이어야 가능하다.
 - 리플렉션 API를 사용하여 가져올 수 있다.

 */