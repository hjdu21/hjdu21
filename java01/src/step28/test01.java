// 주제 : DBMS에 연결하기
package step28;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.Driver;

public class test01 {

  public static void main(String[] args) throws Exception {
    // 1) java.sql.Driver 구현체를 JDBC 드라이버 관리자에 등록한다.
    DriverManager.registerDriver(new Driver());
    // 2) JDBC 드라이버 관리자에게 java.sql.Connection 구현체를 달라고 요청한다.
    // 그러면 JDBC 드라이버 관리자는 누구에게 요청하느냐? => com.mysql.jdbc.Drvier 객체에게 요구한다.
    // => com.mysql.jdbc.Driver => JDBC 드라이버 관리자에게 Connection 구현체를 리턴한다.
    // => 즉 com.mysql.jdbc.ConnectionImpl 객체를 리턴한다.
    // => JDBC 드라이버 관리자는 com.mysql.jdbc.Driver가 리턴한 값을 그대로 리턴한다..
    // => 우리는 인터페이스 변수로 java.sql.Connection 인터페이스의 래퍼런스로 해당 객체를 받는다. 
    Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/java80db?user=java80&password=1111");
    System.out.println("연결 성공");
    con.close(); // connection 객체를 사용한 후에는 명시적으로 닫아야한다.
    // -> 안닫으면 어떻게 되나요?
    // 일정 시간동안 DBMS 서버 메모리에 연결 정보가 남아있는다.
    // -> 연결 정보가 좀 남아있다면 어때요?
    // DBMS는 최대 연결 수를 관리한다.
    // 연결 수가 최대 값을 초과하면 ? 더이상 연결을 허락하지 않는다.
    // 그래서 항상 Connection을 다 사용했으면 즉시 끊는게 중요하다.
    // 물론 안끊는다면! 서버에 설정된 시간(timeOut)이 지나면 강제로 연결을 끊는다.
  }
}


/* JDBC API
 - DBMS와 연동할 때 사용하는 도구들의 규약
 - 이 규약에 따라 DBMS 벤더는 클래스를 작성하여 배포한다.
  ==> 이렇게 배포된것을 "JDBC Driver"라고 부른다.
  
 - 주요 규약.
 1) java.sql.Driver 인터페이스
 => JDBC 드라이버 정보를 다루고 커넥션을 준비하는 기능.
 => 구현체.
   MySQL JDBC 드라이버 : com.mysql.jdbc.Driver 클래스
   ORACLE JDBC 드라이버 : oracle.jdbc.OracleDriver 클래스

 2) java.sql.Connection 인터페이스
 => DBMS의 연결 정보를 다루고 질의 도구(SQL을 DBMS에 보내는 도구)를 준비하는 기능.
 => 구현체
   MySQL JDBC 드라이버 : com.mysql.jdbc.ConnectionImpl 클래스 (Impl => 인터페이스를 구현했다)
   Oracle JDBC 드라이버 : oracle.jdbc.OracleConnectionWrapper 클래스 
    
 3) java.sql.Statement 인터페이스
 => DBMS에 질의를 하고 데이터를 가져오는 기능.
 => 구현체
   MySQL JDBC 드라이버 : com.mysql.jdbc.StatementImpl 클래스.
   Oracle JDBC 드라이버 : oracle.jdbc.driver.OracleStatementWrapper 클래스.
 
 4) java.sql.ResultSet 인터페이스.
 => DBMS로부터 레코드를 가져오고, 레코드의 컬럼 값을 꺼내는 기능.
 => 구현체
   MySQL JDBC 드라이버 : com.mysql.jdbc.ResultSetImpl 클래스.
   Oracle JDBC 드라이버 : oracle.jdbc.driver.OracleReturnResultSet 클래스.
   
  # JDBC API의 사용!!
  - 직접 구현체(인터페이스를 구현한 클래스)를 사용하지는 않는다.  
  이유?? 특정클래스 이름을 사용하면 해당 JDBC 드라이버 및 DBMS에 종속되기 때문이다.
  -- 그럼 어떤방식??? 프로그래밍 방식.
  => 체인 방식을 통해 원하는 객체를 얻는다.
   == 장점 : 첫번째 클래스의 이름만 알면 된다.(==첫번째 클래스 이름에만 종속된다)
 * */