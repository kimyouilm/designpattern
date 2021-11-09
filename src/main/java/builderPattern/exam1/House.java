package builderPattern.exam1;
// 제품 클래스 입니다. 생성될 제품의 속성과 기능을 가집니다.
public class House {
  private String roof;
  private String doors;
  private String windows;
  private String walls;

  public void setRoof(String roof) {
    this.roof = roof;
  }

  public void setDoors(String doors) {
    this.doors = doors;
  }

  public void setWindows(String windows) {
    this.windows = windows;
  }

  public void setWalls(String walls) {
    this.walls = walls;
  }

  @Override
  public String toString() {
    return "House{" +
        "roof='" + roof + '\'' +
        ", doors='" + doors + '\'' +
        ", windows='" + windows + '\'' +
        ", walls='" + walls + '\'' +
        '}';
  }
}
