package step26.exam03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class Test {

  public static void main(String[] args) throws Exception {
      // Writer 및 Writer의 계열의 클래스들만 지정가능.
    // Box<String> box = new Box<>(); //컴파일 오류
    // Box<Object> box2 = new Box<>(); //오류
    
    Box<FileWriter> box3 = new Box<>(); //ok
    box3.setValue(new FileWriter("")); //ok
    
    Box<Writer> box4 = new Box<>(); //ok
    box4.setValue(new FileWriter("")); //ok
    box4.setValue(new BufferedWriter(null)); //ok
    
    
  }

}


/* */