//주제 : 원시 타입 값 출력하기(Refactoring)
package step22.exam04;

import java.io.IOException;
import java.io.FileOutputStream;
import java.io.OutputStream;


public class Test02 {
  static void writeShort(OutputStream out, short value) throws IOException  {
    out.write(value >> 8);
    out.write(value);
  }

  static void writeInt(OutputStream out, int value) throws IOException  {
    out.write(value >> 24);
    out.write(value >> 16);
    out.write(value >> 8);
    out.write(value);
  }

  public static void main(String[] args) throws IOException {
    FileOutputStream out = new FileOutputStream("exam04.Test02.data");

    short no = 17;
    int kor = 100;
    int eng = 89;
    int math = 75;

    writeShort(out, no);
    writeInt(out, kor);
    writeInt(out, eng);
    writeInt(out, math);

    out.close();
  }
}
