// 주제 : db 커넥션 풀 사용하기
package step29.exam05;

import java.util.List;

public class MemberList {

  public static void main(String[] args) throws Exception {
    try {
      DataSource ds = new DataSource("com.mysql.jdbc.Drive",
          "jdbc:mysql://localHost:3306/java80db", 
          "java80", 
          "1111" );
      MemberDao memberDao = new MemberDao();
      memberDao.setDataSource(ds);
      
      List<Member> list = memberDao.selectList();
      
      for(Member member : list) {
        System.out.printf("%d, %s, %s, %s\n", member.getNo(),
            member.getName(),
            member.getEmail(),
            member.getPassword());
   
      }
        ds.close();
        
    } catch (Exception e) {
      System.out.println("데이터를 가져오는데 실패했습니다.");
    }
  }
}
/* 
  */