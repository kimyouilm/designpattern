package flyweightPattern;

import java.util.HashMap;
// getCircle() 메소드를 통해 객체의 생성 또는 공유의 역할을 담당하며 클라이언트에게 응답해줍니다.
public class ShapeFactory {
  private static final HashMap<String, Circle> circleMap = new HashMap<>();

  public static Shape getCircle (String color) {
    Circle circle = circleMap.get(color);

    if (circle == null) {
      circle = new Circle(color);
      circleMap.put(color, circle);
      System.out.println("==== 새로운 객체 생성 : " + color + "색 원 ====");
    }
    return circle;
  }
}
