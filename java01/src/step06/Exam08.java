/* 주제: 가변개수 파라미터 선언 순서 */
package step06;

public class Exam08 {
   //가변 개수 파라미터는  여러개 올 수 없다.
  static int plus(int...a boolean... i) { //에러
    // 이와같이 여러개를 선언할 수 없다.
    
    int sum = 0;
    for (int v : a) {
      sum += v;
    }
    
    return sum;
  }
  

  public static void main(String[] args) {
    System.out.println(plus("문자열", 10, 20));
    System.out.println(plus("문자열", 10));
    System.out.println(plus("문자열", 10, 20, 30));
 
  }
}
