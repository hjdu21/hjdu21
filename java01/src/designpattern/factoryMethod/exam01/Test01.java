//주제 : 일반적인 객체 생성방법. - new 연산자를 사용하는 방법
package designpattern.factoryMethod.exam01;


public class Test01 {

  public static void main(String[] args) {
    
    
    
    //티코 객체 생성.
    Car c1 = new Car();
    c1.model = "티코";
    c1.cc = 800;
    
    //소나타 객체 생성
    Car c2 = new Car();
    c2.model = "소나타";
    c2.cc = 1997;
    

  }

}
