package bitcamp.pms.util;

import java.util.Scanner;

public class CommandUtil {
  static public boolean confirm(String msg, Scanner keyScan) {
    String input = null;
    while (true) {
      System.out.printf("%s(y/n) ", msg);
      input = keyScan.nextLine().toLowerCase();
      if (input.equals("y")) {
        return true;
      } else if(input.equals("n")) {
        return false;
      } else {
        System.out.println("오류!");
      }
    }
  }
}
