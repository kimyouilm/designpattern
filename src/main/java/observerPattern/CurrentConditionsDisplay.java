package observerPattern;
// 모든 옵저버 클래스들은 Observer 인터페이스를 구현해야하며 Display가 필요한 클래스들은
// DisplayElement 인터페이스 또한 구현해야한다.
public class CurrentConditionsDisplay implements Observer, DisplayElement {

  private float temperature;
  private float humidity;
  private Subject weatherData;

  // 생성자에 weatherData라는 주제 객체가 전달되며, 그 객체를 써서 디스플레이를 옵저버로 등록한다.
  public CurrentConditionsDisplay(Subject weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  // update()가 호출되면 기온과 습도를 저장하고 display()를 호출
  @Override
  public void update(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    display();
  }

  @Override
  public void display() {
    System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity.");
  }
}
