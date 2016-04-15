// 여러개의 속성 값 설정하기.
package step27.exam06;

//여러 개의 속성 값을 지정 할 때에는 value라 할 지라도 이름을 생략 할 수 없다.
//즉 다음과 같으면 오류다.
// @Component("오호라", num=333, title="title...")  //컴파일 오류

@Component(value="오호라", num=333, title="title...") 
public class Member2 {

  
}