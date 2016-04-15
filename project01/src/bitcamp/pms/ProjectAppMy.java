
package bitcamp.pms;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import bitcamp.pms.context.ApplicationContext;
import bitcamp.pms.context.request.RequestHandler;
import bitcamp.pms.context.request.RequestHandlerMapping;
import bitcamp.pms.dao.MemberDao;
import bitcamp.pms.domain.Member;
import bitcamp.pms.util.CommandUtil;

public class ProjectAppMy {
  static ApplicationContext appContext;
  static RequestHandlerMapping requestHandlerMapping;
  static Scanner keyScan = new Scanner(System.in);
  static int no;
  static String input;

  public static void main(String[] args) throws Exception {
    appContext = new ApplicationContext("bitcamp.pms");
    requestHandlerMapping = new RequestHandlerMapping(appContext);

    appContext.addBean("stdinScan", keyScan);

    try {
      InputStream inputStream = Resources.getResourceAsStream("conf/mybatis-config.xml");
      appContext.addBean("sqlSessionFactory", new SqlSessionFactoryBuilder().build(inputStream));
    } catch (Exception e) {
      System.out.println("Mybatis 준비중 오류 발생. \n 시스템을 종료하겠습니다.");
      e.printStackTrace();
      return;
    }

    login();

    do {
      input = prompt();
      processCommand(input);
    } while (!input.equals("quit"));

    keyScan.close();
  }

  static void processCommand(String input) throws Exception {
    
    if (input.equals("quit")) {
      doQuit();

    } else if (input.equals("about")) {
      doAbout();

    } else if (input.equals("unsubscribe")) {
      unsubscribe();
      return;
    } else {
      RequestHandler requestHandler = (RequestHandler) requestHandlerMapping.getRequestHandler(input);

      if (requestHandler == null) {
        doError();
        return;
      }

      Method method = requestHandler.getMethod();
      Object obj = requestHandler.getObj();
      try {
        ArrayList<Object> args = new ArrayList<>();

        Parameter[] params = method.getParameters();
        Object arg = null;

        for (Parameter param : params) {
          arg = appContext.getBean(param.getType());
          args.add(arg);
        }

        method.invoke(obj, args.toArray());

      } catch (Exception e) {
        System.out.println("명령 처리 중에 오류가 발생했습니다!");
      }
    }
  }

  static String prompt() {
    System.out.print("명령> ");
    return keyScan.nextLine().toLowerCase();
  }

  static void doQuit() {
    System.out.println("안녕히 가세요!");
  }

  static void doError() {
    System.out.println("올바르지 않은 명령어입니다.");
  }

  static void doAbout() {
    System.out.println("비트캠프 80기 프로젝트 관리 시스템!");
  }

  static void unsubscribe() throws Exception {
    MemberDao memberDao = (MemberDao) appContext.getBean(MemberDao.class);
    if (CommandUtil.confirm(keyScan, "정말로 탈퇴하시겠습니까?")) {
      memberDao.delete(no);
      System.out.println("회원 정보를 삭제하였습니다. 안녕히 가세요.");
      login();
    } 
  }

  static void login() throws Exception {
    System.out.println("1) 로그인");
    System.out.println("2) 회원가입");
    System.out.println("9) 종료");

    while (true) {
      System.out.print("선택? ");
      String input = keyScan.nextLine();

      if (input.equals("1")) {
        MemberDao memberDao = (MemberDao) appContext.getBean(MemberDao.class);
        System.out.print("이메일: ");
        input = keyScan.nextLine();
        Member member = memberDao.selectEmail(input);
        System.out.print("암호: ");
        input = keyScan.nextLine();

        if (member == null) {
          System.out.println("등록되지 않은 사용자입니다.");
          continue;
        }
        if (input.equals(member.getPassword())) {
          System.out.printf("환영합니다. %s님! \n", member.getName());
          no = member.getNo();
          break;
        } else {
          System.out.println("암호가 맞지 않습니다.");
        }

      } else if (input.equals("2")) {
        join();
      } else if(input.equals("9")) {
        doQuit();
        System.exit(0);
       } else {
        System.out.println("잘못 입력했습니다.");
      }
      
    }
  }

  static void join() throws Exception {
    while (true) {
      String input = null;
      Member member = new Member();
      MemberDao memberDao = (MemberDao) appContext.getBean(MemberDao.class);

      System.out.print("이름?: ");
      member.setName(keyScan.nextLine());


      while (true) {
        System.out.print("이메일?: ");
        input = keyScan.nextLine();
        
        if (input.matches("^[_a-zA-Z0-9-\\.]+@[\\.a-zA-Z0-9-]+\\.[a-zA-Z]+$")) {
          member.setEmail(input);
          break;
        } else {
          System.out.println("이메일 형식이 맞지 않습니다. (유효 형식: xxx@xxx.xxx)");
        }
      }
      while (true) {
        System.out.print("암호?: ");
        input = keyScan.nextLine();
        if (input.matches("(?=.*\\d)(?=.*[a-zA-Z])(?=.*[!@?])[0-9a-zA-Z!@?]{%d}")) {
          member.setPassword(input);
          break;
        } else {
          
          System.out.println("암호는 4 ~ 10자 까지만 가능합니다.\n "
              +"최소 알파벳1개, 숫자1개, 특수문자(?,!,@)1개 반드시 포함.");
        }
      }

      while (true) {
        System.out.print("전화?: ");
        input = keyScan.nextLine();
        if (input.matches("[0-9]{3,4}[-][0-9]{4}") || input.matches("[0-9]{2,4}[-][0-9]{3,4}[-][0-9]{4}")) {
          member.setTel(input);
          break;
        } else {
          System.out.println("전화 번호 형식에 맞지 않습니다.(3~4-4자), (2~4-3~4-4)");
        }
      }

      memberDao.insert(member);
      System.out.println("회원 가입되었습니다.");
      break;

    }
  }

}