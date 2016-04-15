package step32.exam01;



public class Test01 {

  public static void main(String[] args) throws Exception {
    // CarFactory 추상클래스안의 스테틱 메서드를 호출할 수 있다.
    CarFactory factory = CarFactory.newInstance();
    
    //실제 CarFactory의 newInstance()가 리턴하는 객체는
    // 
    System.out.println(factory.getClass().getName());
    
    Car c1 = factory.newCar("tico");
    Car c2 = factory.newCar("sonata");
   
  
  }

}

/* 

*/