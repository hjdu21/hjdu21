// 주제 : 에노테이션의 유지 정책 확인하기.
package step27.exam02;

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

/* 유지 정책 확인하기
- Component 의 유지 정책이 SOURCE로 변경 되었기 때문에,
  .class파일에 에노테이션 정보가 포함되지 않을 것이다. 
- bin 폴더에 가서 Member.class 파일을 확인 해보라. */