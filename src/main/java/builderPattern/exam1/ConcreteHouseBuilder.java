package builderPattern.exam1;
// Builder 추상 클래스의 기능을 재정의
public class ConcreteHouseBuilder extends Builder{
  
  @Override
  public void buildWalls() {
    house.setWalls("콘크리트");
  }

  @Override
  public void buildDoors() {
    house.setDoors("나무");
  }

  @Override
  public void buildRoof() {
    house.setRoof("보라색");
  }

  @Override
  public void buildWindows() {
    house.setWindows("KCC창문");
  }

  @Override
  public House getHouse() {
    return house;
  }
}
