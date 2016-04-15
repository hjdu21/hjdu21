//주제 : ObjectInputStream 데코레이터사용
package step22.exam05;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.BufferedInputStream;

public class Test11 {

  public static void main(String[] args) throws Exception {
    FileInputStream in0 = new FileInputStream("exam05.Test10.data");
    BufferedInputStream in1 = new BufferedInputStream(in0);
    ObjectInputStream in = new ObjectInputStream(in1);

    Member2 m1 = (Member2)in.readObject();
    m1.CalculateBMI();      //transient 필드의 값을 설정하기 BMI계산수행

    Member2 m2 = (Member2)in.readObject();
    m2.CalculateBMI();      //transient 필드의 값을 설정하기 BMI계산수행
    in.close();
    in1.close();
    in0.close();

    System.out.println(m1);
    System.out.println(m2);
  }

}
////////////////////////////////////////////////////////////////////////
