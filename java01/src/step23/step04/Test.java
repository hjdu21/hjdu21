//주제 : HelloJp처럼 이미 다른 클래스를 상속 받는 경우 해결책!
//=>기존에 상속받는 클래스 대신 AbstractHello를 상속받게 한다.
//  그리고 기존에 상속받았던 기능은 다른 방식으로 처리한다.
//HelloJp 클래스 개편!
//#문제점
//그나마 HelloJp처럼 클래스의 크기가 작을 때는 소스코드 개편이 가능하지만
//실무에서는 이렇게 간단하지 않다.
//기존의 클래스를 상속 받은 후 많은 코드가 추가된 경우에는
//HelloJp처럼 상속을 포기 할 수 없다.

package step23.step04;

public class Test {
  public static void main(String[] args) {

    String lang = System.getProperty("lang");

    String message = null;

    if("en".equals(lang)) {
      HelloEn obj = new HelloEn();
      message = obj.greet();
    } else if ("jp".equals(lang)) {
     HelloJp obj = new HelloJp();
     message = obj.sayHello();
    } else  {
      Hello obj = new Hello();
      message = obj.greet();
    }
    System.out.println(message);

  }
}
