// 주제 : 데이터 추가하기 - insert 문 보내기.
package step29.exam04;

public class MemberAdd {

  public static void main(String[] args) throws Exception {
   try{
     Member member = new Member();
     member.setName("세종대왕");
     member.setEmail("sae@test.com");
     member.setPassword("1111");
     member.setTel("1111-1111");
     
     MemberDao memberDao = new MemberDao("com.mysql.jdbc.Drive", 
         "jdbc:mysql://localHost:3306/java80db", 
         "java80", 
         "1111" );
     
     int count = memberDao.insert(member);
      
        System.out.printf("입력 개수 : %d\n",count);
        memberDao.destroy(); 
      } catch (Exception e) {
        System.out.println("입력 실패입니다!");
      }
    } 
  }
