package step19;

import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Test6 {
  public static void main(String[] args) {
    File f = new File("test.txt");
    try {
      FileReader in = new FileReader("test.txt");
      System.out.println("파일을 찾았습니다.");
    } catch (FileNotFoundException e) {
      System.out.println("파일을 찾을 수 없습니다.");
    }
  }
}
/*
  RuntimeException과 Exception의 용도
  1)RuntimeException
  -자질구레한 예외 상황 알릴 때 사용한다.
  -프로그램을 실행 하면서 흔하게 발생되는 오류인 경우
  -RuntimeException으로 예외상황을 알린다.
  -개발자 입장!
    =>RuntimeException을 던지는 메서드를 사용할 때
      반드시 try {} catch() {} 를 작성해야 하는것은 아니다.
      예외처리에 부담이 덜하다.
      예외처리에 대한 선택권이 개발자에게 있다.
  2)Exception
  -프로그램 실행에 치명적인 영향을 끼치는 오류를 알릴 때 사용한다.
  -즉 이런 오류를 발생하는 메서드를 사용할 때는 더욱 주의를 하라.
   반드시 예외처리를 고려하라는 뜻이다.
  -개발자 입장!
   =>Exception을 던지는 메서드를 사용할 때
    =>예외 상황을 처리하는 코드를 반드시 작성한다.
    =>try {} catch() {} 를 사용하거나 throws를 사용하여 자신을 호출한
      상위 호출자에게 전달한다.
*/
