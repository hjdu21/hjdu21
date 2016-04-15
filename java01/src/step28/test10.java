// 주제 : 데이터 추가하기 - insert 문 보내기.
package step28;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class test10 {

  public static void main(String[] args) throws Exception {
    Connection con = null;
    Statement stmt = null;
    try{
    Class.forName("com.mysql.jdbc.Driver");

      con = DriverManager.getConnection("jdbc:mysql://localHost:3306/java80db",
                                             "java80", "1111");
      stmt = con.createStatement();
      
      int count = stmt.executeUpdate("insert into MEMBERS(MNAME,EMAIL,PWD)"
                            + " values('강감찬', 'kang@test.com', '1111');");
      
        System.out.printf("입력 개수 : %d",count);
      
      } finally {
      try { stmt.close(); } catch (Exception e) {} // 각각닫아야함.
      try { con.close(); } catch (Exception e) {}
    } 
  }}

/* 
  */