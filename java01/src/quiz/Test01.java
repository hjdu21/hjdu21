package quiz;

public class Test01 {
  public static void main(String[] args) {
    int a = 3;
    System.out.println(Test01.fact(a));

  }
  public static int fact(int n) {
    if (n == 0) {
      return 1;
    }
    return n * fact(n-1);
  }
}
