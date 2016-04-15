/*
  #중첩 클래스(Inner Class) 도입 후
*/
package step20.exam02;

public class Test1 {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.add("일길동");
    list.add("이길동");
    list.add("삼길동");

    for(int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
  }
}
/*
  #중첩 클래스?
  -특정 클래스 안에서만 사용되는 클래스라면
   굳이 패키지 멤버 클래스로 만들지 말고 그 클래스 내부에 선언하라
  -패키지 멤버 클래스(일반 클래스)는 다른 클래스가 사용 할 수 있도록
   노출한 클래스다.
  -다른 클래스가 사용할 일이 없는데도 불구하고, 패키지 멤버로 선언하면
   정말 그 이름의 패키지 멤버 클래스를 만들고 싶을 때 못 만들게 된다.
  -소스 코드 관리 차원에서도 특정 클래스 안에서만 사용된다면
   그 클래스 안에 선언하는 것이 유지보수에 용이하다.

  #종류?
  -top level Inner class
    => static member class
  -member Inner class
    => instance member class
  -local Inner class
    => 메서드 안에 선언된 클래스
  -anomymous Inner class
    => 이름이 없는 클래스
    => 클래스 선언과 인스턴스 생성 문법이 결합되어 있다.
*/
