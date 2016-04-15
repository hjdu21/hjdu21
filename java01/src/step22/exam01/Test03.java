//주제 : 디렉토리에 있는 모든 파일(디렉토리 포함) 목록을 알아내기
package step22.exam01;
import java.io.File;
import java.io.IOException;

public class Test03 {
  public static void main(String[] args) throws IOException{
    //현재 폴더의 파일과 디렉토리 이름을 모두 출력한다.
    File f = new File(".");
    String[] str = f.list();

    for(int i = 0; i < str.length; i++) {
      System.out.println(str[i]);
    }
  }
}
