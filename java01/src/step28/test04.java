// 주제 : 예외 처리와 연결 해제3 - try(자원){} 문법 사용하여 자동으로 자원 해제하기.
package step28;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.Driver;

public class test04 {

  public static void main(String[] args) throws Exception {
    DriverManager.deregisterDriver(new Driver());
    
    try(
        //여기에 선언한 모든 자원은 try 블록을 벗어나기 전에 자동으로 해제된다.
        // => 따라서 finally 블록에서 close()를 호출할 필요가 없다.
        // => 단, 자동으로 해제시키는 자원은 java.lang.autoCloseable 구현체여야 한다.
        // => 만약 autoCloseable 구현체가 아닌 자원은 자동해제 시키지 못한다.
        // 그 뜻은 직접 finally 블록에서 해제시켜야 함을 의미한다.
        Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/java80db",/* JDBC URL*/
        "java80", /*DBMS 사용자 아이디*/
        "1111"/*DBMS 사용자암호 */);
        ){
    
     
        
    System.out.println("연결 성공");
    System.out.printf("5 / 0 = %d\n", 5/0);
    System.out.println("맑은 날씨입니다.!"); 
    
    }
  }
}


