//주제 : 바이트 읽기

package step22.exam02;

import java.io.IOException;
import java.io.FileInputStream;

public class Test08 {

  public static void main(String[] args) throws IOException {
    FileInputStream in = new FileInputStream("exam02.Test05.data");

    byte[] buf = new byte[100];

    int len = in.read(buf, 10, 3);
    len = in.read(buf, 10 + len, 5);
    //배열의 특정 값부터 읽어들인 값을 채우고 싶을때 사용한다
    for(int i = 0; i < 20; i++) {
      System.out.println(Integer.toHexString(buf[i]));
    }
    in.close();

  }
}
