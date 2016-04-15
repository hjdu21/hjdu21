package step26.exam02;


public class Test2 {

  public static void main(String[] args) {
    //제네릭이 적용된 클래스를 사용할 때
    //타입을 적용하지 않고 날 것 그대로 사용한다면 경고가 된다.
    // => "raw type"
    Box box = new Box();
    
    box.setValue("문자열");
    
    String value = (String)box.getValue();
  }

}


/* 제네릭 사용후
 *  1) 컴파일 할 때 데이터형을 엄격히 검사할 수 있다.
 *  2) 값을 꺼낼 때 마다 형변환 할 필요 없다.
 * */