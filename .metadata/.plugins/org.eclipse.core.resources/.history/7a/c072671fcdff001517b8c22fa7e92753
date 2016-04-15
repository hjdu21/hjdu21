//주제 : 파일 정보 다루기
package step22.exam01;
import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Test01 {
  public static void main(String[] args) throws IOException{
    File f = new File(".");   //현재경로 . <
    System.out.printf("getName() : %s\n",f.getName());
      //경로에서 파일명출력
    System.out.printf("getPath() : %s\n",f.getPath());
      //경로에서 사용자가 지정한 경로를 모두 출력
    System.out.printf("getAbsolutePath() : %s\n",f.getAbsolutePath());
      //전체 경로를 출력한다
      //. 또는 ..에 대해 그대로 유지한다
    System.out.printf("getCanonicalPath() : %s\n",f.getCanonicalPath());
      //. 또는 ..에 대해 계산을 완료한 경로
      // .=> 현재 폴더
      // ..=> 상위 폴더
    System.out.printf("getParent() : %s\n", f.getParent());
      //파일인 경우 폴더를 가리킨다.
    System.out.printf("length() : %s\n", f.length());
      //파일의 크기(byte)
    System.out.printf("toURI() : %s\n", f.toURI());
      //URI의 정보 추출
    System.out.printf("isFile() : %s\n", f.isFile());
    System.out.printf("isDirectory() : %s\n", f.isDirectory());
      //파일 및 디렉토리 여부 검사
    System.out.printf("exists() : %s\n", f.exists());
      //파일 및 디렉토리 존재 검사
    System.out.printf("getTotalSpace() : %s\n", f.getTotalSpace());
    System.out.printf("getFreeSpace() : %s\n", f.getFreeSpace());
    System.out.printf("getUsableSpace() : %s\n", f.getUsableSpace());
    //파티션의 크기 알아내기
    long millis = f.lastModified();
    Date date = new Date(millis);
    System.out.printf("lastModified() : %s\n", date.toString());
    //마지막으로 변경된 날짜
  }
}
/*
  #파일의 위치 정보 표현
  1)path
    -OS의 파일시스템의 경로 정보이다.
    예) 윈도 => c:\Program Files\Java\jdk1.8.0_74
    예) 리눅스 => /usr/local/jdk1.8.0_74
  2)URL(Uniform Resource Locator)
    -웹 주소형태로 표현하는 경로 정보이다.
    예) 윈도 => file://c:/Program+files/Java/jdk1.8.0_74
    예) 리눅스 => file://usr//local/jdk1.8.0_74

  #URI, URL, URN 의 차이
  -URI(Uniform Resource Indicator)
    =>네트워크상에 있는 자원의 주소를 표현하는 방법
    =>표현 방법
      1)URL(Uniform Resource Locator)
        프로토콜://서버주소:포트번호/.../자원경로
        예) http://www.bitcamp.co.kr/board/index.html
      2)URN(Uniform Resource Name)
        예)urn:ISSN:0167-4423
*/
