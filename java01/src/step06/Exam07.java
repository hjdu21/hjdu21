/* 주제: 가변개수 파라미터 선언 순서 */
package step06;

public class Exam07 {
   //가변 개수 파라미터는 반드시 마지막에 선언해야한다.
  //static int plus(int...a, String s) // 컴파일 오
  static int plus(String s, int... a) {
    
    int sum = 0;
    for (int v : a) {
      sum += v;
    }
    
    System.out.print(s);
    return sum;
  }
  

  public static void main(String[] args) {
    System.out.println(plus("문자열", 10, 20));
    System.out.println(plus("문자열", 10));
    System.out.println(plus("문자열", 10, 20, 30));
 
  }
}
