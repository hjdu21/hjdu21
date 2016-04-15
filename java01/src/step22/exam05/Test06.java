//주제 : Buffered 데코레이션 사용 전
package step22.exam05;

import java.io.IOException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.DataOutputStream;

public class Test06 {

  public static void main(String[] args) throws IOException {
    FileOutputStream out = new FileOutputStream("exam05.Test06.data");

    long start = System.currentTimeMillis();

    for(int i = 0; i < 5000000; i++) {
      out.write(0x41);
    }
    long end = System.currentTimeMillis();
    System.out.printf("걸린시간 : %d\n",end-start);
    out.close();
  }
}
