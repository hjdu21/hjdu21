//주제: final 활용 문법 test
package step12;

public class Exam12 {

  public static void main(String[] args) {
    //상수값은 한번 결정되면 바꿀수 없다.
    //컴파일 오류
    //Car9.model = "sonata";
    System.out.println(Car9.model);

  }
}
/*
  #클래스 변수 앞에 final을 붙이는 경우
  -주로 조회용 값을 저장하고 싶을 때
  -클래스가 로딩 될 때 딱 한번만 만들기위해
  -static과 함께 사용한다.
*/
