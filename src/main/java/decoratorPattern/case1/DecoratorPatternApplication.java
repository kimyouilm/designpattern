package decoratorPattern.case1;

public class DecoratorPatternApplication {
  public static void main(String[] args) {

    // Deco 없이 에스프레소만 주문해보기!
    Beverage beverage = new Espresso();
    System.out.println(beverage.getName() + " $" + beverage.costs());

    // 우유랑 자바칩 추가
    Beverage beverage1 = new Frappuccino();
    beverage1 = new Milk(beverage1);
    beverage1 = new JavaChip(beverage1);

    System.out.println(beverage1.getName() + ", $" + beverage1.costs());
  }
}
