// 주제 : 클래스에서 특정 에노테이션 추출하기.
package step27.exam05;

public class Test {

  public static void main(String[] args) {
    Class<?> clazz = Member.class;
    
    //=> 꺼내고 싶은 에노테이션의 타입을 주면,
    // 그 에노테이션의 정보를 리턴한다.
    Component anno = clazz.getAnnotation(Component.class);
    
    //=> 에노테이션에서 속성값을 꺼낸다.
    System.out.println(anno.value());
    
    }
    
    
    
  }



/* 

 */