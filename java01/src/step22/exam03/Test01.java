//주제 : 바이트 값을 메모리(바이트 배열)로 출력하기
package step22.exam03;

import java.io.IOException;
import java.io.ByteArrayOutputStream;

public class Test01 {

  public static void main(String[] args) throws IOException {
    ByteArrayOutputStream out = new ByteArrayOutputStream();

    int value = 0x2a3b4c5d;
    out.write(value >> 24);   //ByteArrayOutputStream이 관리하는
    out.write(value >> 16);   //내부 바이트 배열에 출력한다
    out.write(value >> 8);
    out.write(value);
    //#중요
    //메모리에 데이터를 저장할 때에도 꼭 파일로 출력하는 것처럼 프로그래밍을 짤수 있다.
    //데이터를 저장하는 대상이 파일이든 메모리든 간에 일관된 방식으로 프로그래밍을 할 수있다.
    //=>이것이 스트림 프로그래밍이다.
    byte[] bytes = out.toByteArray();
    for(byte b : bytes) {
      System.out.println(Integer.toHexString(b));
    }
    out.close();
  }
}
