package step22.exam05;

import java.io.IOException;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;

public class Test01 {
  public static void main(String[] args) throws IOException {
    FileOutputStream out = new FileOutputStream("exam05.Test01.data");
    //FileOutputStream에 데코레이터를 붙인다.
    //DataOutputStream은 원시타입을 바이트 단위로 쪼개서 출력하는 기능
    //=> 이런 데코레이터 클래스를 "Data Processing Stream Class"라고 부른다.
    DataOutputStream out2 = new DataOutputStream(out);

    short no = 17;
    int kor = 100;
    int eng = 89;
    int math = 75;

    out2.writeShort(no);
    out2.writeInt(kor);
    out2.writeInt(eng);
    out2.writeInt(math);
    //자원을 해제할 땐 맨 마지막에 연결된 객체부터 해제하라.
    out2.close();
    out.close();

  }
}
