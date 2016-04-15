//주제 : 메서드 클래스 분리 MyDataOutputStream3클래스  인스턴스멤버
package step22.exam04;

import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Test05 {

  public static void main(String[] args) throws IOException {
    FileOutputStream out = new FileOutputStream("exam04.Test05.data");

    short no = 17;
    int kor = 100;
    int eng = 89;
    int math = 75;

    MyDataOutputStream3 mdos3 = new MyDataOutputStream3(out);

    mdos3.writeShort(no);
    mdos3.writeInt(kor);
    mdos3.writeInt(eng);
    mdos3.writeInt(math);

    out.close();
  }
}
