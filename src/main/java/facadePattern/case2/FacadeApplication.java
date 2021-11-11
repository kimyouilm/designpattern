package facadePattern.case2;

public class FacadeApplication {
  public static void main(String[] args) {
    Facade facade = new Facade("스프라이트", "하울의 움직이는 성");
    facade.watchMovie();
    
    /*
    Facade 적용 전
    Beverage beverage = new Beverage("스프라이트");
    RemoteControl remote = new RemoteControl();
    Movie movie = new Movie("포뇨");

    // 음료수 준비
    beverage.prepare();
    // tv 켜기
    remote.turnOn();
    // 영화 찾기
    movie.searchMovie();
    // 영화 결제하기
    movie.chargeMovie();
    // 영화 재생하기
    movie.playMovie();
     */
  }
}
