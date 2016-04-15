// 주제 : 클래스에서 특정 에노테이션 추출하기.
package step27.exam07;

public class Test {

  public static void main(String[] args) {

    // Class<?> clazz = Member.class; => 아래 대신 이거 넣으면 홍길동만 나옴.
    Class<?> clazz = Member.class;
    Component anno = clazz.getAnnotation(Component.class);
    String[] list = anno.value();

    for (String s : list) {
      System.out.println(s);
    }

  }
}
