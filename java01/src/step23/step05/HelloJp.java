package step23.step05;

import java.util.ArrayList;
import java.util.Calendar;

public class HelloJp extends ArrayList<String> implements Hello {

  public HelloJp() {
    this.add("곤니찌와");
    this.add("곰방와");
  }
  @Override
  public String greet() {
    return this.sayHello();   //기존 메서드를 손대지 않는다.
  }

  public String sayHello() {
    Calendar cal = Calendar.getInstance();
    int hour = cal.get(Calendar.HOUR);
    if (hour < 18) {
      return this.get(0);
    } else {
      return this.get(1);
    }

  }

}
