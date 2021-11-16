package bridgePattern;
/*
Shape 클래스가 소유할 Color 인터페이스의 구현 객체를 정의해보자
 */
public class RedColor implements Color{

  @Override
  public void applyColor() {
    System.out.println("Red");
  }
}
