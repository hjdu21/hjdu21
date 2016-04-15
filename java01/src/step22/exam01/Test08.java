//주제 : 주어진 폴더를 뒤져서 중첩 클래스 파일만 이름을 출력해라.
//>java -cp bin step22.exam01.Test08 ./bin ../project01/bin
package step22.exam01;

import java.io.File;
import java.io.IOException;
import java.io.FilenameFilter;
import java.io.FileFilter;

public class Test08 {
  public static void main(String[] args) throws IOException {
    File f = null;
    for(int i = 0; i < args.length; i++){
      f = new File(args[i]);
      printFilename(f);
      }
    }
  static void printFilename(File f) throws IOException {
    if (f.isFile()) {
      if(f.getName().endsWith(".class") && f.getName().contains("$")) {
        System.out.println(f.getCanonicalPath());
      }
    } else {
      File[] list = f.listFiles();
      for(File file : list) {
        printFilename(file);
      }
    }
  }
}