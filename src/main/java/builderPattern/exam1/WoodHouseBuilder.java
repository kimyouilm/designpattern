package builderPattern.exam1;
// Builder 추상 클래스의 기능을 재정의
public class WoodHouseBuilder extends Builder{

  @Override
  public void buildWalls() {
    house.setWalls("통나무");
  }

  @Override
  public void buildDoors() {
    house.setDoors("철문");
  }

  @Override
  public void buildRoof() {
    house.setRoof("하얀색");
  }

  @Override
  public void buildWindows() {
    house.setWindows("나무창문");
  }

  @Override
  public House getHouse() {
    return house;
  }
}
