package step23.step02;

import java.util.ArrayList;
import java.util.Calendar;

public class HelloJp extends ArrayList<String> {

  
  public HelloJp() {
    this.add("곤니찌와");
    this.add("곰방와");
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
