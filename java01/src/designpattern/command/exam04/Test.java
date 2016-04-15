package designpattern.command.exam04;

import java.util.HashMap;

public class Test {
  static HashMap<String,Command> commandMap = new HashMap<>();
  static {
    commandMap.put("+", new PlusCommand());
    commandMap.put("-", new MinusCommand());
    commandMap.put("*", new MultipleCommand());
  }
  
  public static void main(String[] args) {
    
   if (args.length < 3) {
     System.out.println("사용법: java -cp bin designpattern.command.exam04.Test 10 + 20");
   return;
  }
   
   Command command = commandMap.get(args[1]);
   if(command == null) {
     System.out.println("지원하지 않는 연산자 입니다.");
     return;
   }
   
   command.execute(Integer.parseInt(args[0]), Integer.parseInt(args[2]));
 }
}
/*
*/