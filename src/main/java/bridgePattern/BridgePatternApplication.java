package bridgePattern;

public class BridgePatternApplication {
  public static void main(String[] args) {
    Shape triangle = new Triangle(new RedColor());
    triangle.applyColor();

    Shape pentagon = new Pentagon(new GreenColor());
    pentagon.applyColor();
  }
}
