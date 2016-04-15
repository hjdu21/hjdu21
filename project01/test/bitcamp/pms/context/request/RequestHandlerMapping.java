/*용도 : ApplicationContext가 관리하는 객체 중에서 명령을 처리하는
 *       메서드정보를 따로 보관하여 관리한다.
         =>ProjectApp은 명령어를 처리할 때 클래스를 통해
            메서드 정보를 얻어서 해당 메서드를 호출한다.
*/
package bitcamp.pms.context.request;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import bitcamp.pms.annotation.Controller;
import bitcamp.pms.annotation.RequestMapping;
import bitcamp.pms.context.ApplicationContext;

public class RequestHandlerMapping {

  public RequestHandlerMapping(ApplicationContext appContext) {

  }

  public RequestHandler getRequestHandler(String name) {

}
