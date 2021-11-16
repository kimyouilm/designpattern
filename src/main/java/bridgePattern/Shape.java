package bridgePattern;
/*
Shape 클래스가 Color 인터페이스를 소유하고 있고, applyColor() 메소드는 abstract로 선언하여
하위 클래스에게 구현을 위임한다.
 */
public abstract class Shape {
  // Composition
  protected Color color;

  // constructor with implementor as input argument
  public Shape(Color color) {
    this.color = color;
  }

  abstract public void applyColor();
}
