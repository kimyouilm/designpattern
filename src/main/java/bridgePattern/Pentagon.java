package bridgePattern;
/*
Shape 추상 클래스를 상속하여 구체화 하는 Triangle 클래스와 Pentagon 클래스를 정의해보쟈
 */
public class Pentagon extends Shape{

  public Pentagon(Color color) {
    super(color);
  }

  @Override
  public void applyColor() {
    System.out.println("Pentagon filled with color");
    color.applyColor();
  }
}
