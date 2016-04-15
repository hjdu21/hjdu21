// anomymous Inner class 선언
package step20.exam03;

public class Outer5 {
  int no;

  //anomymous inner class - member
  //=> new [수퍼클래스/인터페이스] (생성자파라미터) { 선언 }
  Object obj1 = new Object() {};  //Object의 하위클래스
  Object obj2 = new Object() {};  //Object의 하위클래스
  void m() {
    System.out.println(obj1);
    System.out.println(obj2);
  }
}

/*
  #중첩 클래스와 class 파일
  -자바 컴파일러는 클래스 선언 당 한개의 .class파일을 생성한다
  -중첩 클래스의 경우 "바깥클래스명$중첩클래스명.class"형식으로
   클래스 파일을 만든다.
  -익명 중첩 클래스는 "바깥클래스명$1.class"처럼 $다음에 선언된 순서대로
   번호가 붙는다.
*/
