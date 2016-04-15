//주제 : 바이트 읽기

package step22.exam02;

import java.io.IOException;
import java.io.FileInputStream;

public class Test05 {

  public static void main(String[] args) throws IOException {
    FileInputStream in = new FileInputStream("exam02.Test05.data");

    int b = in.read();  //리턴타입이 int이지만 1바이트 값을 읽어서 리턴한다.
    System.out.println(Integer.toHexString(b));

    b = in.read();
    System.out.println(Integer.toHexString(b));

    b = in.read();
    System.out.println(Integer.toHexString(b));

    in.close();
  }
}
