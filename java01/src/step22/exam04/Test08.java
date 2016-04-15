//주제 : 원시타입값을 읽기  MyDataInputStream
package step22.exam04;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.InputStream;

public class Test08 {

  public static void main(String[] args) throws IOException {
    FileInputStream in = new FileInputStream("exam04.Test07.data");
    MyDataInputStream in2 = new MyDataInputStream(in);

    short no = in2.readShort();
    int kor = in2.readInt();
    int eng = in2.readInt();
    int math = in2.readInt();

    in2.close();
    in.close();
    System.out.println(no);
    System.out.println(kor);
    System.out.println(eng);
    System.out.println(math);
  }
}
