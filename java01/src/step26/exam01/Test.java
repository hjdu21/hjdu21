package step26.exam01;

import java.util.Date;

public class Test {

  public static void main(String[] args) {
    Box box = new Box();
    
    box.setValue("문자열");
    box.setValue(new Date());
    box.setValue(10); //<-autoBoxing(원시타입이 Object 래퍼런스에 못들어가는데,
                        //자동으로 랩퍼클래스를 만들어 넣어줌.
    
    String value = (String)box.getValue();
    
  }

}




/* 제네릭 사용전 문제점.
 *  1) 컴파일 할 때 데이터형을 엄격히 검사할 수 없다.
 *  2) 값을 꺼낼 때 마다 형변환을 해야한다.
 * */
 