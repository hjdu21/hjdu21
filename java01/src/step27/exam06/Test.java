// 주제 : 클래스에서 특정 에노테이션 추출하기.
package step27.exam06;

public class Test {

  public static void main(String[] args) {
   
    
    Class<?> clazz = Member.class;
    Component anno = clazz.getAnnotation(Component.class);
    System.out.println(anno.value());
    System.out.println(anno.title());
    System.out.println(anno.num());
    System.out.println("-------------------------");
    
    
    Class<?> clazz2 = Member2.class;
    Component anno2 = clazz2.getAnnotation(Component.class);
    System.out.println(anno2.value());
    System.out.println(anno2.title());
    System.out.println(anno2.num());
    
    
    }
    
    
    
  }



/* 

 */