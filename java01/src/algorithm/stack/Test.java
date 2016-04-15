package algorithm.stack;

public class Test {
  public static void main(String[] args) {
    Stack<String> stack = new Stack<String>();
    stack.push("홍길동");
    stack.push("임꺽정");
    stack.push("유관순");
    stack.push("안창호");
    stack.push("김원봉");
    stack.push("김구");

    int length = stack.size();
    for (int i = 0; i < length; i++) {
      System.out.println(stack.pop());
    }
  }
}
