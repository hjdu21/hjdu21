// 주제 : 예외 처리와 연결 해제6 - 예외 상황 정리 / 다양한 예외 확인.
package step28;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.Driver;

public class test06 {

  public static void main(String[] args) throws Exception {

    DriverManager.deregisterDriver(new Driver());
    try (

        Connection con = DriverManager.getConnection("jdbc:mysql://localHost:3306/java80db", 
                                                     "java80",
                                                           "121");) {


      System.out.println("연결 성공");

    }
  }
}

/* # 오타 등의 이유로 JDBC URL 형식이 잘못 되었을때.
 - No suitable driver found for
 
 * # 해당 IP 를 가진 컴퓨터가 실행중이지 않을때
 * # 포터 번호가 다를때.
 - The driver has not received any packets from the server
 - Caused by: java.net.ConnectException: 연결이 거부됨
 
 // 존재하지 않는 dMBS를 가리킬때
 # 아이디가 존재하지 않거나 암호가 맞지 않을 때,
=> Access denied for user 'java80'@'localhost' to database 'java80db2'
=> Access denied for user 'java80'@'localhost' (using password: YES)

# 최대 연결 개수를 초과할 때
=> Too many connections
 
 
  */