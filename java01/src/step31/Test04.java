package step31;

import java.util.Scanner;

public class Test04 {

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    
    // 미리 정의된 문자 집
//    String regex = "\\D"; // 0-9제외한 문자 1개.
//    String regex = "[0-9]"; // 0-9 까지 한개 문자
//    String regex = "\\d"; // 0-9까지 문자 집합. 위의 주석과 같다. 
//    String regex = "a-zA-Z_0-9"; //알파벳이나 숫자 1개
//    String regex = "\\w"; //위와 같다.
//    String regex = "."; // 어떤 문자든 한개.
    String regex = "\\."; // ---> . < 문자 한개.
    String input = null;
    
    while(true) {
      System.out.print("입력 : ");
      input = keyScan.nextLine();
      if(input.equals("quit")) {
        break;
      }
      System.out.println(input.matches(regex));
    }
    
    keyScan.close();
    
  }

}
