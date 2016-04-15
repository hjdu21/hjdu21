package step19;

public class Test15 {
  static void m1(int i) throws AgeException {
    throw new AgeException();
  }
  static void m2(int i) throws ChildException {
    throw new ChildException();
  }
  static void m3(int i) throws OldManException {
    throw new OldManException();
  }

  public static void main(String[] args) {
    try{
      m3(20);
      m2(10);
      m1(30);
    } catch (OldManException e) {
      e.printStackTrace();
    } catch (ChildException e) {
      e.printStackTrace();
    } catch (AgeException e) {
      e.printStackTrace();
    }
  }
}

/*
  #catch문 작성순서
  -try 블록에서 여러개의 예외가 발생하고 각각의 예외를 개별로 처리해야 할 경우
   예외간의 상속 관계를 따져서 최하위 예외부터 잡도록 한다.
   -상위 클래스가 아래에 위치해야한다.
*/
