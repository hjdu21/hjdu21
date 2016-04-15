//주제 : 바이트 출력하기

package step22.exam02;

import java.io.IOException;
import java.io.FileOutputStream;


public class Test04 {

  public static void main(String[] args) throws IOException {
    FileOutputStream out = new FileOutputStream("exam02.Test04.data");

    byte[] bytes = {0x2a, 0x3b, 0x4c, 0x5d, 0x6d, 0x7f};

    out.write(bytes, 2, 3);   //2번방부터 3개 출력
                              //offset - 상대적인 주소


    out.close();
  }
}
