//주제 : 자바 버퍼링 데코레이터 사용
package step22.exam05;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.DataInputStream;
import java.io.BufferedInputStream;

public class Test05 {

  public static void main(String[] args) throws IOException {
    FileInputStream in0 = new FileInputStream("test.pdf");
    BufferedInputStream in = new BufferedInputStream(in0);
    long start = System.currentTimeMillis();

    int b = 0;
    int count = 0;
    while((b = in.read()) != -1) {
      if(count % 100000 == 0) {
        System.out.print(".");
      }
      count++;
    }
    System.out.println();

    long end = System.currentTimeMillis();

    System.out.printf("걸린시간 : %s\n", end - start);

    in.close();
    in0.close();
  }

}
