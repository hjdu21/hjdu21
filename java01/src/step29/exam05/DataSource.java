// 객체가 필요할때 만들어주고 기존에 객체가 있으면 주는 클래스
package step29.exam05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;

public class DataSource {

  //커넥션 객체를 담을 그릇 준비
  ArrayList<Connection> connectionPool = new ArrayList<>();
  
  //객체를 생성하는데 필요한 정보 보관
  String jdbcDriver;
  String jdbcUrl;
  String username;
  String password;
  
  public DataSource(String jdbcDriver, String jdbcUrl,
      String username, String password) throws Exception {
    this.jdbcDriver = jdbcDriver;
    this.jdbcUrl = jdbcUrl;
    this.username = username;
    this.password = password;
    
    Class.forName(jdbcDriver);
  }
  
  public Connection getConnection() throws Exception {
    if(connectionPool.size() > 0) {
      return connectionPool.remove(0);
    }
    return DriverManager.getConnection(jdbcUrl, username, password);
  }
  
  public void returnConnection(Connection con) {
    connectionPool.add(con);
  }
  
  public void close() {
    for (Connection con : connectionPool) {
      try { con.close(); } catch (Exception e) { }
    }
  }
  
}
