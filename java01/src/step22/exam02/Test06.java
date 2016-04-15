//주제 : 바이트 읽기

package step22.exam02;

import java.io.IOException;
import java.io.FileInputStream;

public class Test06 {

  public static void main(String[] args) throws IOException {
    FileInputStream in = new FileInputStream("exam02.Test05.data");

    //문서 전체를 읽어온다.
    int b;
    while((b = in.read()) != -1){
      System.out.print(Integer.toHexString(b) + " ");
    }
    in.close();
  }
}
