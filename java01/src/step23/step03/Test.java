//주제 : 상속을 이용하여 호출 규칙을 정의한다.
//=>Hello, HelloEn의 공통 메서드인 greet()를 뽑아서
//AbstractHello라는 추상 클래스를 정의한다.
//이제 인사말을 생성하는 클래스는 반드시 AbstractHello의 서브 클래스가 되도록
//강제한다.
//이유? =>AbstractHello의 서브 클래스는 greet()를 가질 것이기 때문이다.
//#문제점?
//HelloJp는 이미 ArrayList를 상속받고 있기 때문에
//이 구조로 개편할 수 없다
//#해결책?
//step04로 가라

package step23.step03;

public class Test {
  public static void main(String[] args) {

    String lang = System.getProperty("lang");

    String message = null;

    if("en".equals(lang)) {
      HelloEn obj = new HelloEn();
      message = obj.greet();
    //} else if ("jp".equals(lang)) {
    //  HelloJp obj = new HelloJp();
    //  message = obj.sayHello();
    } else  {
      Hello obj = new Hello();
      message = obj.greet();
    }
    System.out.println(message);

  }
}
