package step18.exam01;

public class Test7 {
  public static void main(String[] args) {
    Bucket p1 = new Bucket();
    Bucket6<String> p2 = new Bucket6<String>();
    p1.value = new String("kahaha");
    p2.value = new String("Tahaha");

    String s1 = (String)p1.value;   //p1.value는 Object이기 때문에 String에 저장하려면 type casting을 해야한다.
    String s2 = p2.value;           //p2.value는 String이기 때문에 String에 바로 저장할 수 있다.
  }
}
