package step31;

import java.util.Scanner;

public class Test03 {

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    
    //문자 그룹
    //String regex = "[abc]"; //-> a | b | c  문자 1개 .
//    String regex = "[^abc]"; //->^ ==> a,b,c 를 제외한 문자 1개
    //String regex = "[a-z]"; //-> a-z 까지 문자 한개
//    String regex = "[a-zA-Z]"; //-> a-z 까지 또는 A-Z까지 문자 한개
    //String regex = "[a-d[x-z]]"; // a | b | c | d | x | y | z 중에 한개 (합집합의미)
//    String regex = "[a-dx-z]"; // ==> 위와 같다
    String regex = "[a-f&&[d-m]]"; // a-f 와 d-m 의 교집합 ==def 중 1개
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
