// 주제 : 예외 처리와 연결 해제2 - 연결 해제를 자동으로 하기..
package step28;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.Driver;

public class test03 {

  public static void main(String[] args) throws Exception {
    Connection con = null;
    try{
    DriverManager.deregisterDriver(new Driver());
       
    con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/java80db?user=java80&password=1111");
    System.out.println("연결 성공");
    System.out.printf("5 / 0 = %d\n", 5/0);
    System.out.println("맑은 날씨입니다.!"); 
    
    } finally { //try 블럭을 벗어나기 전에 무조건 자동으로 실행한다.
      //1) try 블록에서 예외가 발생하여 상위 호출자에게 보고 하더라도,
      // 2) try 블록 중간에서 메서드를 탈출(return) 하더라도,
      // 무조건 finally 블록에 있는 모든 명령들은 실행된다.
      // 그래서 보통 자원을 해제시키는 명령어를 주로 둔다.
      
      //close()도 닫다가 예외를 발생 할 수 있다.
      // => close()에 대한 예외를 사용자에게 굳이 알릴 필요는 없다.
      // => 따라서 close()에 대해 try, catch 로 처리하라.
      // 물론 닫다가 발생된 예외에 대해서는 특별히 할 일이 없다.
      // 그냥 JVM이 오류 문구를 내뱉는 것을 막기 위함이다.
      try {con.close(); } catch(Exception e) {}
    }
  }
}


