//주제 : 메서드 클래스 분리 MyDataOutputStream클래스
package step22.exam04;

import java.io.IOException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Test03 {

  public static void main(String[] args) throws IOException {
    FileOutputStream out = new FileOutputStream("exam04.Test03.data");

    short no = 17;
    int kor = 100;
    int eng = 89;
    int math = 75;

    MyDataOutputStream.writeShort(out, no);
    MyDataOutputStream.writeInt(out, kor);
    MyDataOutputStream.writeInt(out, eng);
    MyDataOutputStream.writeInt(out, math);

    out.close();
  }
}
