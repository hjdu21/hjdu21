package step19;

public class Test1 {
  public static void main(String[] args) {
    Calculator calc = new Calculator();
    calc.plus(10);
    calc.divide(0);   //시스템 계산 오류 발생
    //JVM의 대응은?
    //=> 예외 상황을 보고하고, 즉시 실행을 멈춘다.


    System.out.println("-----------");
    System.out.println(calc.result);
    System.out.println("-----------");
  }
}
/*
  예외 상황에 대한 JVM의 태도
  =>개인 프로그램의 경우 즉시 실행을 멈추어도 상관없다.
  =>서비스 같은 여러 사용자가 동시에 사용하는 공용 프로그램인 경우
    실행을 멈추면 매우 치명적인 상황이 된다.
  =>해결책?
    개발자가 예외상황을 다룰 수 있는 문법을 제시한다.
    "예외처리 문법 등장"
*/
