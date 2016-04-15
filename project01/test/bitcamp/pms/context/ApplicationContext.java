// 용도 : @Component 및 @Controller가 붙은 클래스에 대해서만 인스턴스를 생성하고 관리한다.
package bitcamp.pms.context;

import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import bitcamp.pms.annotation.Component;
import bitcamp.pms.annotation.Controller;

public class ApplicationContext {
HashMap<String, Object> objPool = new HashMap<>();

  public ApplicationContext(String basePackage) {
    String path = "./bin/" + basePackage.replace(".", "/");
    createObject(new File(path));
    injectDependency();
  }

  private void injectDependency() {

  }

  private Object findObjectByType(Class<?> paramType) {

  }

  private void createObject(File file) {
    String name = file.getName().
        replace(".class", "").replace("./bin/", "").replace("/", ".");
    
    try {
    Class<?> clazz = Class.forName(name);
    Annotation[] annos = clazz.getAnnotations();
    for (Annotation anno : annos) {
      if (anno.annotationType() == Controller.class) {
        processControllerAnnotation(clazz);
      } 
      if (anno.annotationType() == Component.class) 
        processComponentAnnotation(clazz);
    }
    
    
    } catch (Exception e) {}
  }

  private void processControllerAnnotation(Class<?> clazz) throws Exception {
    Controller anno = clazz.getAnnotation(Controller.class);
    String value = anno.value();
    if (value.equals("")) {
      value = clazz.getName();
    }
    
    objPool.put(value, clazz.newInstance());
    
  }

  private void processComponentAnnotation(Class<?> clazz) throws Exception {

  }

  public List<Object> getBeans(Class<?> beanType) {

  }

  public Object getBean(String name) {
  }

  public Map<String, Object> getBeansWithApplication(Class<? extends Annotation> annoType) {

  }

  public Object getBean(Class<?> type) {

  }

  //외부에서 임의로 객체를 추가할 수 있게 한다.
  public void addBean() {
  }

}
