// 주제 : 예외 처리와 연결 해제4 - 프로그램에서 예외처리 기.
package step28;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.Driver;

public class test05 {

  public static void main(String[] args) throws Exception {
    
    DriverManager.deregisterDriver(new Driver());
    try(
        
        Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/java80db",
        "java80", 
         "1111");
        ){
    
     
        
    System.out.println("연결 성공");
    System.out.printf("5 / 0 = %d\n", 5/0);
    System.out.println("맑은 날씨입니다.!"); 
    }catch (Exception e) {
      System.out.println("잠시 dbms와의 연결이 원할하지 않습니다.\n잠시후 다시 시도해 주세요");
    }
  }
}


