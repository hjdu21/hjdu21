// 주제: Collection API - 해시코드와 HashSet
//=> hashCode(), equals() 재정의하기
package step21;

import java.util.HashSet;

public class Exam11 {
  static class Member {
    String name;
    int age;

    public Member(String name, int age) {
      this.name = name;
      this.age = age;
    }

    @Override
    public String toString() {
      return name + "," + age;
    }
    

    @Override
    public int hashCode() {
      return this.toString().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      Member other = (Member) obj;
      if (age != other.age)
        return false;
      if (name == null) {
        if (other.name != null)
          return false;
      } else if (!name.equals(other.name))
        return false;
      return true;
    }
  }

  static void printList(HashSet<Member> list) {
    System.out.println("-----------------------");
    for (Object value : list.toArray()) {
      System.out.println(value);
    }
  }

  public static void main(String[] args) throws Exception {
    Member m1 = new Member("홍길동", 20);
    Member m2 = new Member("임꺽정", 30);
    Member m3 = new Member("유관순", 16);
    Member m4 = new Member("홍길동", 20);
    Member m5 = new Member("임꺽정", 30);

    System.out.printf("m1 = %d\n", m1.hashCode());
    System.out.printf("m2 = %d\n", m2.hashCode());
    System.out.printf("m3 = %d\n", m3.hashCode());
    System.out.printf("m4 = %d\n", m4.hashCode());
    System.out.printf("m5 = %d\n", m5.hashCode());
    System.out.printf("-------------------------");

    HashSet<Member> set = new HashSet<>();
    set.add(m1);
    set.add(m2);
    set.add(m3);
    set.add(m4); // 저장안된다.
    set.add(m5); // 저장안된다.

    printList(set);
  }

}

/*
# Member를 HashSet에 저장할 떄 주의점
  -같은 값을 갖는 경우 중복저장하지 않도록 hashCode()와 equals()를
   재정의하여 사용하라
*/
