package facadePattern.case2;

public class Movie {
  private String name;

  public Movie(String name) {
    this.name = name;
  }

  public void searchMovie() {
    System.out.println(name + " 영화를 찾습니다.");
  }

  public void chargeMovie() {
    System.out.println("영화를 결제 합니다.");
  }

  public void playMovie() {
    System.out.println("영화를 재생합니다.");
  }
}
