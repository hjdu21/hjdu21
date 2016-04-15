//주제 : 원시타입값을 읽기  java에서 제공하는 데코레이터 사용하기
package step22.exam05;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.DataInputStream;

public class Test02 {

  public static void main(String[] args) throws IOException {
    FileInputStream in = new FileInputStream("exam04.Test07.data");
    DataInputStream in2 = new DataInputStream(in);

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
