package step31;

import java.util.Scanner;

public class Test09 {

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    

    String regex = "(?=.*[0-9])(?=.*[?!@])(?=.*[a-zA-Z]).{4,10}"; 
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
