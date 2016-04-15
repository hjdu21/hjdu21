package step26.exam04;

import java.io.FileWriter;
import java.io.Writer;

public class Test {

  public static void main(String[] args) throws Exception {
    // => 항상 상위 타입의 래퍼런스는 하위 타입을 가리킬 수 있다.
    Object r1 = new FileWriter(""); // ok
    Writer r2 = new FileWriter(""); // ok
    FileWriter r3 = new FileWriter(""); // ok

    Box<String> b1 = new Box<String>(); // ok
    
    //Box<Object> 는 Box<String>의 상위 타입이 아니다!    
    //Box<Object> b2 = new Box<String>(); // error
    // Box<FileWriter> b3 = new Box<Writer>(); 오류.
    
    
    
  }

}

/* */