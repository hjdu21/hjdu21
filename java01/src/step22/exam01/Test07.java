package step22.exam01;

import java.io.File;
import java.io.IOException;

public class Test07 {
  public static void main(String[] args) throws IOException {
    File f = new File(".");

    printFilename(f);
  }
  static void printFilename(File f) {
    //만약 f가 파일이면 이름을 검사하고 .class라면 출력한다.
    //만약 f가 디렉토리라면 모든 파일목록을 얻어서 파일이름을 출력한다.
    if (f.isFile()) {
      if(f.getName().endsWith(".class")) {
        System.out.println(f.getName());
      }
    } else {
      File[] list = f.listFiles();
      for(File file : list) {
        printFilename(file);
      }
    }
  }
}
