// 1) preparedStatement 적용!
// 2) DB 연결정보를 외부로부터 받는다.
// ==> DBMS 연결 정보가 바뀌더라도 코드를 변경할 필요가 없다.
// 3) 커넥션 한개만 생성하여 공유하기.
// ==> 메서드가 호출 될 때 마다 커넥션을 맺고 실행한 다음 커넥션을 끊으면,
//     실행 속도가 느려진다.
// ==> 그래서 DAO를 생성할 때 미리 커넥션을 .......못봄
// ==> selectList(), insert(), update(), delete()이 커넥션을 공유하게 만든다.
package step30.exam01;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class MemberDao {
  SqlSessionFactory sqlSessionFactory;
  public MemberDao() {
  }
  
  public void SqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
    
    this.sqlSessionFactory = sqlSessionFactory;
  }

  public List<Member> selectList() throws Exception {
    SqlSession sqlSession = sqlSessionFactory.openSession();    
    
    try {
      return sqlSession.selectList("step30.exam01.MemberDao.selectList");
    } finally {
      sqlSession.close();
    }
   
   
  }

  /*
  public int insert(Member member) throws Exception {
    Connection con = null;
    PreparedStatement stmt = null;
    try {
      con = dataSource.getConnection();
      stmt = con.prepareStatement("insert into MEMBERS(MNAME,EMAIL,PWD,TEL)" + " values(?,?,?,?)");
      stmt.setString(1, member.getName());
      stmt.setString(2, member.getEmail());
      stmt.setString(3, member.getPassword());
      stmt.setString(4, member.getTel());

      return stmt.executeUpdate();

    } finally {
      try {
        stmt.close();
      } catch (Exception e) {
      }
      dataSource.returnConnection(con);
    }
  }

  public int update(Member member) throws Exception {
    Connection con = null;
    PreparedStatement stmt = null;
    try {
      con = dataSource.getConnection();
      stmt = con.prepareStatement("update MEMBERS set MNAME = ?, EMAIL=?, PWD?, where MNO=?");
      stmt.setString(1, member.getName());
      stmt.setString(2, member.getEmail());
      stmt.setString(3, member.getPassword());
      stmt.setString(4, member.getTel());
      stmt.setInt(5, member.getNo());

      return stmt.executeUpdate();

    } finally {
      try {
        stmt.close();
      } catch (Exception e) {
      }

      dataSource.returnConnection(con);
    }
  }

  public int delete(int no) throws Exception {
    Connection con = null;
    PreparedStatement stmt = null;
    try {
      con = dataSource.getConnection();
      stmt = con.prepareStatement("delete from MEMBERS where MNO =?");
      stmt.setInt(1, no);

      return stmt.executeUpdate();

    } finally {
      try {
        stmt.close();
      } catch (Exception e) {
      }

      dataSource.returnConnection(con);
    }
  }
  */

}
