// 주제 : Statement사용시 문제점 해결! - PreparedStatement 사용
package step28;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class test14 {

  public static void main(String[] args) throws Exception {
    Connection con = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    
    try{
    Class.forName("com.mysql.jdbc.Driver");

      con = DriverManager.getConnection("jdbc:mysql://localHost:3306/java80db",
                                             "java80", "1111");
      String str = "2";
      // 1. 미리 SQL문을 준비한다.
      // => 단, 값이 입력되어야 할 부분은 IN-PARAMETER(?)로 표시한다.
      stmt = con.prepareStatement("select * from MEMBERS where MNO=?");
      
      // 2. 값을 따로 입력한다.
      // => 숫자 값을 입력 할 때 setString을 사용할 수 있다.
      // => 원래는 setInt를 사용해야 한다.
      // => PreparedStatement 는 지정된 위치에 들어갈 수 있는 값 이외에는 삽입하지 않는다.
      // => 그래서 해커가 임의의 sql문을 삽입할 수 없다.
      stmt.setString(1, str);
      
      // 3. 질의를 수행한다.
      rs = stmt.executeQuery();
     
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

/* PreparedStatement vs Statement
 * 1) 임의의 SQL 코드를 삽입 할 수 없다 == 보안이 좋다.
 * 2) SQL문과 값이 분리되어 있다. == 코드 가독성이 좋다.
 * 3) !! 바이너리 데이터를 저장할 수 있다.!! == statement는 불가능하다.
 *  ==> statement 에서는 Base64와 같은 특별한 인코딩을 수행한 후에 저장 할 수 있다.
 *      그래도 statement는 직접 바이너리 데이터를 저장할 수는 없다.
 *      
 * Base64 용도? : (바이너리 ==> 문자열)
 * 바이너리 데이터를 영어대문자/소문자, 숫자, '+', '-', '/'을 이용하여 문자열로 변환할때 사용한다.
 * 주로 바이너리 데이터를 문자열로 저장할 때 사용한다.
 * 저장된 데이터를 사용할 때에는 문자열을 원래의 바이너리 값으로 복원 한 후 사용한다.      
  */