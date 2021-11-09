package builderPattern.exam1;
// 제품을 필드로 가지며 객체 생성시 필요한 메소드를 선언하는 추상 클래스입니다.
public abstract class Builder {
  protected House house;

  public void createHouse() {
    house = new House();
  }

  public abstract void buildWalls();
  public abstract void buildDoors();
  public abstract void buildRoof();
  public abstract void buildWindows();
  public abstract House getHouse();
}
