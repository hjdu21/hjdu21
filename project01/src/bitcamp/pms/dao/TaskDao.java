package bitcamp.pms.dao;

import bitcamp.pms.annotation.Component;

@Component
public class TaskDao {

  /*


  public List<Task> selectList() throws Exception {
    ArrayList<Task> list = new ArrayList<>();
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;

    try {
      con = dataSource.getConnection();
      stmt = con.createStatement();
      rs = stmt.executeQuery("select * from TASKS");
      Task task = null;

      while (rs.next()) {
        task = new Task();
        task.setNo(rs.getInt("TNO"));
        task.setTitle(rs.getString("TITLE"));
        task.setWorkerEmail(rs.getString("EMAIL"));
        task.setContent(rs.getString("CONTS"));
        task.setStartDate(rs.getDate("SDT"));
        task.setEndDate(rs.getDate("EDT"));
        task.setState(rs.getInt("STAT"));
        list.add(task);
      }
      return list;
    } finally {
      try {rs.close();} catch (Exception e) {}
      try {stmt.close();} catch (Exception e) {}
      dataSource.returnConnection(con);
    }
  }

  public Task selectOne(int no) throws Exception {
    Connection con = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    try {
      con = dataSource.getConnection();
      stmt = con.prepareStatement("select * from TASKS where TNO=?");
      stmt.setInt(1, no);
      rs = stmt.executeQuery();

      if (rs.next()) {
        Task task = new Task();
        task.setNo(rs.getInt("TNO"));
        task.setTitle(rs.getString("TITLE"));
        task.setWorkerEmail(rs.getString("EMAIL"));
        task.setContent(rs.getString("CONTS"));
        task.setStartDate(rs.getDate("SDT"));
        task.setEndDate(rs.getDate("EDT"));
        task.setState(rs.getInt("STAT"));
        return task;

      }

      return null;
    } finally {
      try {rs.close();} catch (Exception e) {}
      try {stmt.close();} catch (Exception e) {}
      dataSource.returnConnection(con);

    }
  }

  public int insert(Task task) throws Exception {
    Connection con = null;
    PreparedStatement stmt = null;

    try {
      con = dataSource.getConnection();
      stmt = con.prepareStatement("insert into TASKS (TITLE,EMAIL,CONTS,SDT,EDT) values(?,?,?,?,?)");

      stmt.setString(1, task.getTitle());
      stmt.setString(2, task.getWorkerEmail());
      stmt.setString(3, task.getContent());
      stmt.setDate(4, task.getStartDate());
      stmt.setDate(5, task.getEndDate());

      return stmt.executeUpdate();

    } finally {
      try {stmt.close();} catch (Exception e) {}
      dataSource.returnConnection(con);
    }
  }

  public int update(Task task) throws Exception {
    Connection con = null;
    PreparedStatement stmt = null;

    try {
      con = dataSource.getConnection();
      stmt = con.prepareStatement("update TASKS set TITLE=?, EMAIL=?, CONTS=?, SDT=?, EDT=? where TNO=?");

      stmt.setString(1, task.getTitle());
      stmt.setString(2, task.getWorkerEmail());
      stmt.setString(3, task.getContent());
      stmt.setDate(4, task.getStartDate());
      stmt.setDate(5, task.getEndDate());
      stmt.setInt(6, task.getNo());

      return stmt.executeUpdate();

    } finally {
      try {stmt.close();} catch (Exception e) {}
      dataSource.returnConnection(con);
    }
  }

  public int delete(int no) throws Exception {
    
    Connection con = null;
    PreparedStatement stmt = null;

    try {
      con = dataSource.getConnection();
      stmt = con.prepareStatement("delete from TASKS where TNO=?");
      stmt.setInt(1, no);
      return stmt.executeUpdate();
    } finally {
      try {stmt.close();} catch (Exception e) {}

      dataSource.returnConnection(con);
    }
  }
*/
}
