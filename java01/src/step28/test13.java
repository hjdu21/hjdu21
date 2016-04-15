// 주제 : Statement사용시 문제점.
package step28;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class test13 {

  public static void main(String[] args) throws Exception {
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    
    try{
    Class.forName("com.mysql.jdbc.Driver");

      con = DriverManager.getConnection("jdbc:mysql://localHost:3306/java80db",
                                             "java80", "1111");
      stmt = con.createStatement();
      
      // 문제점
      // 1) 사용자가 값을 입력할 때 SQL실행에 영향을 미치는 코드를 삽입 할 경우
      String str = "1 or 1=1";
      
      // 2) Statement에서는 SQL문을 서버에 보낼 때 문자열로 표현한다.
      // 즉 다음과같이 사용자가 입력한 값을 SQL문을 만들 때 붙인다.
      // => 사용자가 입력 값에 넣은 SQL 코드도 함께 삽입 될 수 있다.
      rs = stmt.executeQuery("select * from MEMBERS where MNO =" +str);
     
      // 결과) 무방비로 데이터가 노출 되거나 변경 될 수 있다.
       while (rs.next()) {
         System.out.printf("%d, %s, %s, %s\n",
         rs.getInt("MNO"),
         rs.getString("MNAME"),
         rs.getString("EMAIL"),
         rs.getString("PWD"));
       }
      
      
      } finally {
      try { rs.close(); } catch (Exception e) { }
      try { stmt.close(); } catch (Exception e) { }
      try { con.close(); } catch (Exception e) { }
    } 
  }}

/* 
  */