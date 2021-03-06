//주제 : sql 맵퍼인 mybatis 적용하기.
package step30.exam01;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test01 {

  public static void main(String[] args) throws Exception {
   //1. mybatis 설계도(설정파일)를 읽을때 사용할 inputStream을 준비한다.
//    InputStream inputStream = new FileInputStream(절대경로 또는 상대경로);
    //예)
    /*
    InputStream inputStream = new FileInputStream("./bin/step30/exam01/mybatis-config.xml"); 
    */
    // 1) mybatis에서 제공하는 Resources 라는 클래스를 사용하
    // 2) classpath 디렉토리에 파일이 있는 경우 절대경로나 상대경로 보다 
    // 더 편리하게 파일을 찾을 수 있다. 
    //어떻게? => 패키지 이름만 경로로 지정하면 된다.
    InputStream inputStream = Resources.getResourceAsStream("step30/exam01/mybatis-config.xml");
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
  
     // 4) SQL Mapper 파일에서 SQL 문을 찾아 실행시켜줄 객체를 얻는다.
    SqlSession sqlSession = sqlSessionFactory.openSession();
    
      List<Member> list = sqlSession.selectList("MemberDao.selectList");
      
      for (Member m : list) {
        System.out.printf("%d, %s, %s, %s, %s \n",
            m.getNo(),
            m.getName(),
            m.getEmail(),
            m.getPassword(),
            m.getTel() );
      }

  }
}

/*
 * # mybatis 사용 절차
 * 
 * 1) 라이브러리 다운로드 및 classpath에 적용 => mvnrepository.com에서 mybatis를 검색한다. 
 * => build.gradle 파일의 의존 라이브러리 블록에 mybatis 정보를 등록한다. 
 * => "gradle eclipse" 명령을 실행하여 이클립스 설정파일을 개정한다.
 * 
 * 2) mybatis 설정 파일을 준비한다.
 * => mybatis.org 사이트에서 설정 파일 설명 페이지로 간다.
 * => 설정 파일 예제 코드를 복사한다.
 * => 패키지에 mybatis 설정 파일(mybatis-config.xml)을 생성하고, 복사한 내용을 붙여넣는다.
 * DBMS 정보를 현재 환경에 맞게끔 변경한다.
 * 
 * 3) SQL 맵퍼 파일을 준비한다.
 * => mybatis.org  사이트의 SQL 맵퍼 파일 설명 페이지로 들어간다.
 * => SQL 맵퍼의 예제 코드를 복사한다.
 * => 패키지에 SQL 맵퍼파일(MemberMapper.xml)을 생성하고,
 *    복사한 내용을 붙여넣는다.
 * => 그리고 회원 목록을 질의하는 SQL문을 작성한다.
 * 
 * 4) SQL 문을 실행할 mybatis객체를 준비하라.
 * -> mybatis.org 사이트의 getting started 페이지로 간다.
 * -> sqlSessionFactory 객체를 준비시키는 자바 코드를 복사한다
 * -> 이 클래스의 main()에 붙여넣는다.
 * => mybatis 설정 파일의 경로 정보를 변경한다.
 * 
 * 5) SQLSession 팩토리로 부터 SQLSession 객체를 얻어라.
 * => SQLSession 객체는 SQLMapper 파일에 있는 
 */
