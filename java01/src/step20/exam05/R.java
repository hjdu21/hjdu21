package step20.exam05;

public final class R {
//상수 값을 선언한 중첩클래스의 이름을 소문자로 지으면
//상수 값을 사용할 때 꼭 일반 프로퍼티같이 보여서
//코드를 읽기 쉬워진다.
  public static final class gender{
    public static final int MAN = 0;
    public static final int WOMAN = 1;
  }

  public static final class working {
    public static final int BACKSU = 0;
    public static final int SALARY = 1;
    public static final int STUDENT = 2;
  }

  public static final class tech {
    public static final int JAVA = 0;
    public static final int CS = 1;
    public static final int ANDROID = 2;
    public static final int EMBEDDED = 3;
    public static final int UNITY = 4;
  }

}
