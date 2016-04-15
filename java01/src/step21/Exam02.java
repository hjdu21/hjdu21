//#Collection ArrayList
package step21;

import java.util.Date;
import java.util.ArrayList;

public class Exam02 {
  public static void main(String[] args) {
    ArrayList<Object> list = new ArrayList<>();
    list.add("홍길동");
    list.add("임꺽정");
    list.add(new Integer(10));
    list.add(new Date());


    System.out.println(list.indexOf("임꺽정"));
    //indexOf()는 레퍼런스 주소가 아니라 내용을 비교한다.
    System.out.println(list.indexOf(new String("임꺽정")));
    //contains()는 레퍼런스 주소가 아니라 내용을 비교한다.
    System.out.println("홍길동" == new String("홍길동")); //주소는 다르다.
    System.out.println(list.contains(new String("홍길동"))); //내용은 같다.

    ArrayList<Object> list2 = new ArrayList<>();
    list2.add("ohola");
    list2.add("uhhhh");

    list.addAll(list2);
    //for(레퍼런스 : 배열 또는 Collection 타입 객체) {}
    for(Object element : list) {
      System.out.println(element);
    }

  }
}
