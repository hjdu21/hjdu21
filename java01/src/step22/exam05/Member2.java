//Member2를 직렬화 할 수 있도록 지정한다.
package step22.exam05;

import java.io.Serializable;


public class Member2 implements Serializable {
  String name;
  int age;
  int height;
  int weight;
  transient float bmi;
  /*transient
  =>사전적 의미 "일시적인, 순간적인"
  =>인스턴스 변수 중에서 일시적인 데이터를 저장하는 용도나 또는
    다른 인스턴스 변수의 갑승ㄹ 사용하여 계산한 결과를 저장하는 용도인 경우
    출력 대상에서 제외하는 것이 정확도 측면에서 좋다.

    한마디로
    Serializable 대상에서 제외할 변수에 대해 이 옵션을 붙여라.
  */

  public Member2() {
  }

  public Member2(String name, int age, int height, int weight) {
    this.name = name;
    this.age = age;
    this.height = height;
    this.weight = weight;
    this.CalculateBMI();
  }
  @Override
  public String toString() {
    return this.name + " : " + this.age + " - " + this.height + " - " +
            this.weight + " - " + bmi;
  }
  public void CalculateBMI() {
    float h = this.height / 100f;
    this.bmi = this.weight / (h * h);
  }
}
