package step23.step04;

import java.util.ArrayList;
import java.util.Calendar;

public class HelloJp extends AbstractHello {
  ArrayList<String> list = new ArrayList<String>();
  public HelloJp() {
    list.add("곤니찌와");
    list.add("곰방와");
  }

  public String sayHello() {
    Calendar cal = Calendar.getInstance();
    int hour = cal.get(Calendar.HOUR);
    if (hour < 18) {
      return list.get(0);
    } else {
      return list.get(1);
    }

  }

}
