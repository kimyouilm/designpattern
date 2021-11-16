package decoratorPattern.case1;

// Decorator 적용 X
public class Frappuccino extends Beverage {

  public Frappuccino() {
    // Beverage 로 부터 상속 받은 name
    name = "Frappuccino";
  }

  // Deco 없는 가격
  @Override
  public double costs() {
    return 3.0;
  }
}
