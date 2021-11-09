package builderPattern.exam2;

public class BuilderApplication {
  public static void main(String[] args) {
    Member member = Member.builder()
        .firstName("리마")
        .lastName("킴")
        .phone("11111111")
        .build();
  }
}
