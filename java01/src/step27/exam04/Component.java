//에노테이션 유지정책 변경하기2
package step27.exam04;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Component {  
   String value();      
}
