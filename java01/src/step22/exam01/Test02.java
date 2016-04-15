//주제 : 파일 정보 다루기
package step22.exam01;
import java.io.File;
import java.io.IOException;

public class Test02 {
  public static void main(String[] args) throws IOException{
    File f = new File("./test02.txt");
    //f.createNewFile();    //없으면 생성 있으면 유지
    //f.delete();           //있으면 삭제
    File f2 = new File("./testOk.txt");
    //f.renameTo(f2);
    //f.mkdir();
    if(f.delete()) {  //파일 뿐만 아니라 폴더를 지울 수 있다.
      System.out.println("삭제성공");
    }else {
      System.out.println("삭제실패");
    }
  }
}
