package step19;

public class Test14 {
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
      m3(10);
    }// catch (OldManException e) {   가능
     // catch (AgeException e) {      부모가능
     // catch (Exception e) {         부모의부모가능
        catch (Throwable e) {       //부모의부모의부모가능
      e.printStackTrace();
    }
  }

}
