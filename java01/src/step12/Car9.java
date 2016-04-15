//final의 활용
package step12;

public class Car9 {
//변수 앞에 final을 붙이면, 한번만 값 할당
//=>상수 값으로 사용하기 위해!(값을 바꾸지 않고 단지 조회용)
//=>보통 상수로 사용할 것이기 때문에 인스턴스 마다 개별적으로 만들 필요가
//  없어서 static 변수로 만든다.
//=>따라서 상수변수는 보통 static이면서 final이 된다.
  static final String model = "tico";
}
