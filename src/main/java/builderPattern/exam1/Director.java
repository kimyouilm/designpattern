package builderPattern.exam1;
// Builder을 속성으로 가지며, Builder클래스의 메소드를 사용해 객체를 생성하고, 반환해줍니다.
public class Director {
  private Builder builder;

  public Director(Builder builder) {
    this.builder = builder;
  }

  public void build() {
    builder.createHouse();
    builder.buildWalls();
    builder.buildDoors();
    builder.buildRoof();
    builder.buildWindows();
  }

  public House getHouse() {
    return builder.getHouse();
  }
}
