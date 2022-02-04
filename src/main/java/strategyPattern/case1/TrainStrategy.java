package strategyPattern.case1;

public class TrainStrategy implements TransportationStrategy {
  @Override
  public void takeTransportation() {
    System.out.println("기차를 탈꺼야!");
  }
}
