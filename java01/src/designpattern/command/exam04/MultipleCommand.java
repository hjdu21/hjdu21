//기존 코드 손 대지 않아도 된다.
package designpattern.command.exam04;

public class MultipleCommand implements Command {
  
  public void execute(int a, int b) {
    System.out.printf("%d * %d = %d\n", a, b, (a*b));
  }
 
  

}
