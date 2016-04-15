//주제 : 현재 폴더에 있는 파일만 출력한다(디렉토리 제외)
package step22.exam01;
import java.io.File;
import java.io.IOException;

public class Test04 {
  public static void main(String[] args) throws IOException{
    //현재 폴더의 파일을 모두 출력한다.
    File f = new File(".");
    File[] files = f.listFiles();

    for(File file: files) {
      if(file.isFile())
      System.out.println(file.getName());
    }
  }
}
